package android.coderrrk.self_employedservice.presentation.userwindows.home

import android.coderrrk.self_employedservice.data.retrofit.RepositoryImpl
import android.coderrrk.self_employedservice.domain.retrofitusecase.Jobs
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import retrofit2.Response

class UserHomeViewModel: ViewModel() {

    var repo = RepositoryImpl()
    val myList: MutableLiveData<Response<Jobs>> = MutableLiveData()

    fun getDataRetro(){
        viewModelScope.launch {
            myList.value = repo.getDataRetro()
        }
    }
}