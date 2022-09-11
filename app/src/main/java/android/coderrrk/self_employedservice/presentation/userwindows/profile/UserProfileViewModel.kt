package android.coderrrk.self_employedservice.presentation.userwindows.profile

import android.coderrrk.somenotes.data.sqlite.ProfileDb
import android.coderrrk.somenotes.data.sqlite.ProfileRepositoryImpl
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class UserProfileViewModel (private val repository: ProfileRepositoryImpl): ViewModel() {

    var plofile: LiveData<List<ProfileDb>> = repository.plofile.asLiveData()

    fun insert(profileDb: ProfileDb) = viewModelScope.launch {
        repository.insert(profileDb)
    }

    fun deleteAll() = viewModelScope.launch {
        repository.deleteAll()
    }

}