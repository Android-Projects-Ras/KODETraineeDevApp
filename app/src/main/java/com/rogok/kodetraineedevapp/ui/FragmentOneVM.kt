package com.rogok.kodetraineedevapp.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rogok.kodetraineedevapp.data.RetrofitObject
import com.rogok.kodetraineedevapp.models.Items
import com.rogok.kodetraineedevapp.models.User
import kotlinx.coroutines.launch

class FragmentOneVM: ViewModel() {
    private var _users = MutableLiveData<List<User>>()
    val users: LiveData<List<User>> = _users

    init {
        viewModelScope.launch {
            _users.postValue(RetrofitObject.apiService.getUsers().items)
        }
    }
}