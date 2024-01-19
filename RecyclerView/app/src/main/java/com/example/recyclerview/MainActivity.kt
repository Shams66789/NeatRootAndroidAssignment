package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val dataList = ArrayList<Model>()
        dataList.add(Model(R.drawable.student, R.drawable.student1, "This is video1"))
        dataList.add(Model(R.drawable.student1, R.drawable.student2, "This is video2"))
        dataList.add(Model(R.drawable.student2, R.drawable.student3, "This is video3"))
        dataList.add(Model(R.drawable.student3, R.drawable.student, "This is video4"))
        dataList.add(Model(R.drawable.student, R.drawable.student1, "This is video5"))
        dataList.add(Model(R.drawable.student1, R.drawable.student2, "This is video6"))
        dataList.add(Model(R.drawable.student2, R.drawable.student3, "This is video7"))

        var adapter = Adapter(dataList)
        binding.rv.layoutManager = LinearLayoutManager(this)
        binding.rv.adapter = adapter

    }
}