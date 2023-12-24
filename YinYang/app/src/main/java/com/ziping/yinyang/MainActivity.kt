package com.ziping.yinyang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.ziping.yinyang.databinding.ActivityMainBinding
import com.ziping.yinyang.util.ChineseEraUtil

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.getResult.setOnClickListener {
            val year = binding.inputYear.text.toString().trim()
            binding.resultText.text = ChineseEraUtil.calculateTime(year)
        }
    }
}