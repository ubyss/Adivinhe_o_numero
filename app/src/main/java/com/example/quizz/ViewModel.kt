package com.example.quizz

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModel: ViewModel() {

    val user: MutableLiveData<String> by lazy{
        MutableLiveData<String>()
    }
    fun updateUser(name: String){
        user.value = name
    }

    var number = 0
    val currentUserNumber: MutableLiveData<Int> by lazy{
        MutableLiveData<Int>()
    }

}