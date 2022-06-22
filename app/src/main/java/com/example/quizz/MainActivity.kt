package com.example.quizz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_start.setOnClickListener {
            if(edt_username.text.isNullOrEmpty()){
                Toast.makeText(this, "Você precisa colocar um nome para começar", Toast.LENGTH_LONG).show()
            } else {
                val intent = Intent(this, GameActivity::class.java)
                intent.putExtra("userName", edt_username.text.toString())
                startActivity(intent)
            }
        }

        btn_moreInfo.setOnClickListener {
            val intent = Intent(this, AboutTheApp::class.java)
            startActivity(intent)

        }
    }
}