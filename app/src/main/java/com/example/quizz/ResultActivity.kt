package com.example.quizz

import android.content.Intent
import android.media.ImageWriter.newInstance
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.findNavController
import androidx.navigation.navArgs
import androidx.navigation.navArgument
import kotlinx.android.synthetic.main.activity_result.*
import org.xmlpull.v1.XmlPullParserFactory.newInstance
import java.lang.reflect.Array.newInstance

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val args:GameFragmentArgs by navArgs()

        userName.text = "Parabéns ${args.username} !!"
        tv_score.text = "Você adivinhou em ${args.score} tentativas"

        btn_goHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}