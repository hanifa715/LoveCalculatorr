package com.example.lovecalculatorr.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lovecalculatorr.R
import com.example.lovecalculatorr.databinding.ActivityResultBinding
import com.example.lovecalculatorr.remote.LoveModel

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val model = intent.getSerializableExtra("model") as LoveModel
        binding.tvFirstName.text = model.firstName
        binding.tvSecondName.text = model.secondName
        binding.tvPercent.text = model.percentage
        binding.tvResult.text = model.result
    }
}