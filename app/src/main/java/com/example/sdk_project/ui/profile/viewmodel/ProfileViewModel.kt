package com.example.sdk_project.ui.profile.viewmodel

import androidx.lifecycle.ViewModel
import com.example.sdk_project.data.auth.LoginRepository
import com.example.sdk_project.data.profile.ProfileRepository

class ProfileViewModel(
    private val rp: ProfileRepository
) : ViewModel() {

}