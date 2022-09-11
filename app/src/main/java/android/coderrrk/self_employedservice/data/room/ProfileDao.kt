package android.coderrrk.somenotes.data.sqlite

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface ProfileDao {

    @Query("SELECT * FROM profile_table ORDER BY surnameProfile, nameProfile, patronymicProfile, emailProfile, phoneProfile, innProfile")
    fun getProfile(): Flow<List<ProfileDb>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(profileDb: ProfileDb)

    @Query("DELETE FROM profile_table")
    suspend fun deleteAll()

}