package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R.*



class MainActivity2 : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main2)

        val adapter = RecyclerAdapter()
        val kutu = findViewById(id.recyclerView) as RecyclerView


        kutu.layoutManager = LinearLayoutManager(this)
        kutu.adapter = adapter



        





    }
}