package android.coderrrk.self_employedservice.domain.roomusecase

import android.coderrrk.somenotes.data.sqlite.ProfileDb
import androidx.annotation.WorkerThread
import kotlinx.coroutines.flow.Flow

interface ProfileRepository {

    var plofile: Flow<List<ProfileDb>>

    @WorkerThread
    suspend fun insert(profileDb: ProfileDb)

    @WorkerThread
    suspend fun deleteAll()

}