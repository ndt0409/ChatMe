package com.ndt.tchatapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.firestore.FirebaseFirestore
import com.ndt.tchatapp.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySignInBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setListeners()
    }

    private fun setListeners() {
        binding.tvCreate.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }
        binding.btnSignIn.setOnClickListener {
            //addDataToFireStore()
        }
    }

//    private fun addDataToFireStore() {
//        val hashMap = HashMap<String, Any>()
//        hashMap["first_name"] = "Nguyen"
//        hashMap["last_name"] = "Tu"
//        FirebaseFirestore.getInstance().collection("users")
//            .add(hashMap)
//            .addOnSuccessListener {
//                Toast.makeText(this, "Data insert", Toast.LENGTH_SHORT).show()
//
//            }.addOnFailureListener {
//                Toast.makeText(this, "Data insert", Toast.LENGTH_SHORT).show()
//            }
//    }
}