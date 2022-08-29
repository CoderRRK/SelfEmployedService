package android.coderrrk.self_employedservice.presentation.userwindows

import android.coderrrk.self_employedservice.data.RepositoryImpl
import android.coderrrk.self_employedservice.domain.retrofitusecase.Jobs
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import retrofit2.Response

class UserWindowViewModel: ViewModel() {

    var repo = RepositoryImpl()
    val myList: MutableLiveData<Response<Jobs>> = MutableLiveData()

    fun getExchangeRates(){
        viewModelScope.launch {
            myList.value = repo.getListExchangeRates()
        }
    }
}