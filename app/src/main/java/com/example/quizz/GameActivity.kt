package com.example.quizz

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_game.*
import kotlin.properties.Delegates


class GameActivity : AppCompatActivity() {
    lateinit var userName: Any
    var userNumber by Delegates.notNull<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)


        userName = intent.getStringExtra("userName").toString()
        userNumber = intent.getIntExtra("userNumber",0)

    }
}

