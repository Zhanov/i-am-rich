package com.example.applications

import android.media.MediaPlayer
import android.os.Bundle
import android.provider.MediaStore.Audio.Media
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.applications.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var flag = true
        binding.button.setOnClickListener {
            if(flag) {
                binding.imageView.setImageResource(R.mipmap.blue_crystal)
                flag = false
            } else {
                binding.imageView.setImageResource(R.mipmap.red_crystal)
                flag = true
            }
        }
    }
}