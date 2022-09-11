package android.coderrrk.somenotes.data.sqlite

import android.coderrrk.self_employedservice.domain.roomusecase.ProfileRepository
import androidx.annotation.WorkerThread
import kotlinx.coroutines.flow.Flow

class ProfileRepositoryImpl(private var profileDao: ProfileDao): ProfileRepository {

    override var plofile: Flow<List<ProfileDb>> = profileDao.getProfile()

    @WorkerThread
    override suspend fun insert(profileDb: ProfileDb) {
        profileDao.insert(profileDb)
    }

    @WorkerThread
    override suspend fun deleteAll() {
        profileDao.deleteAll()
    }

}
