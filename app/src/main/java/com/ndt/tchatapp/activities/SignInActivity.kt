package com.ndt.tchatapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ndt.tchatapp.R
import com.ndt.tchatapp.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySignInBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setListeners()
    }

    fun setListeners() {
        binding.tvCreate.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }
    }
}