package com.example.lab2_2500115772_vothanhdat

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lab2_2500115772_vothanhdat.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvValueEmail.text = intent.getStringExtra(EXTRA_EMAIL).orEmpty()
        binding.btnLogout.setOnClickListener { finish() } // quay lại màn hình Login
    }

    companion object {
        const val EXTRA_EMAIL = "extra_email"
    }
}