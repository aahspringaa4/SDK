package com.example.sdk_project.ui.profile.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.sdk_project.data.auth.LoginRepository
import com.example.sdk_project.data.profile.ProfileRepository

class ProfileViewModel(
    private val rp: ProfileRepository
) : ViewModel() {
    private val success : MutableLiveData<Boolean> = MutableLiveData()
    private val failed : MutableLiveData<Boolean> = MutableLiveData()
    lateinit var userId: String

    fun readProfile() {
        rp.readProfile(userId).subscribe { response ->
            if(response.isSuccessful) {
                success.value = true
            } else {
                failed.value = true
            }
        }
    }
}