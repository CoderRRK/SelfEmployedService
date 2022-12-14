package android.coderrrk.somenotes.data.sqlite

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


@Database(entities = [ProfileDb::class], version = 2)
abstract class ProfileRoomDataBase : RoomDatabase() {

    abstract fun profileDao(): ProfileDao

    companion object {
        @Volatile
        private var INSTANCE: ProfileRoomDataBase? = null

        fun getDatabase(
            context: Context,
            scope: CoroutineScope
        ): ProfileRoomDataBase {

            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    ProfileRoomDataBase::class.java,
                    "profile_database"
                )
                    .fallbackToDestructiveMigration()
                    .addCallback(ProfileDataBaseCallback(scope))
                    .build()
                INSTANCE = instance
                return instance
            }
        }

        private class ProfileDataBaseCallback(
            private val scope: CoroutineScope
        ) : RoomDatabase.Callback() {

            override fun onCreate(db: SupportSQLiteDatabase) {
                super.onCreate(db)

                INSTANCE?.let { database ->
                    scope.launch(Dispatchers.IO) {
                        populateDatabase(database.profileDao())
                    }
                }
            }
        }

        suspend fun populateDatabase(profileDao: ProfileDao) {

            profileDao.deleteAll()

        }
    }
}
