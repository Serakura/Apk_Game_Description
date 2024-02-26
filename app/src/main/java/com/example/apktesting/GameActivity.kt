package com.example.apktesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apktesting.databinding.ActivityGameBinding

class GameActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGameBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val deskripsi = intent.getStringExtra("deskripsi")
        val imageId = intent.getIntExtra("imageId", R.drawable.ml)

        binding.judul.text = name
        binding.keterangan.text = deskripsi
        binding.gambar.setImageResource(imageId)
    }
}