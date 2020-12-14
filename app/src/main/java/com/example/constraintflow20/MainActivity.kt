package com.example.constraintflow20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.constraintflow20.databinding.ActivityLoadingBinding

class MainActivity : AppCompatActivity() {
    private var _binding : ActivityLoadingBinding? = null
    private val binding get() = _binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityLoadingBinding.inflate(layoutInflater)
        setContentView(binding?.root)


    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}