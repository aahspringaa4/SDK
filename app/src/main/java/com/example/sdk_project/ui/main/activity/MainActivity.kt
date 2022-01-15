package com.example.sdk_project.ui.main.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sdk_project.R
import com.example.sdk_project.base.BaseActivity
import com.example.sdk_project.databinding.ActivityLoginBinding
import com.example.sdk_project.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>(
    R.layout.activity_main
) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun observeEvent() {
        TODO("Not yet implemented")
    }
}