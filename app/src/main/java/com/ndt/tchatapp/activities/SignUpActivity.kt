package com.ndt.tchatapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ndt.tchatapp.R
import com.ndt.tchatapp.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setListener()
    }

    fun setListener() {
        binding.tvSignIn.setOnClickListener {
            onBackPressed()
        }
    }
}