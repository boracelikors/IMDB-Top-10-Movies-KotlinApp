package com.example.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.VerifiedInputEvent
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.MainActivity2
//import com.example.myapplication.MainActivity2
import com.example.myapplication.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button_id = findViewById(R.id.button_id) as Button



       button_id.setOnClickListener(
        ) {
            val Intent = Intent(this, MainActivity2::class.java)
            startActivity(Intent)
        }


    }
}



