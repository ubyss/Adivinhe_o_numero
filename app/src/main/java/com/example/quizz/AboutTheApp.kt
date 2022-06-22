package com.example.quizz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_about_the_app.*

class AboutTheApp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_the_app)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)


        val lista: MutableList<Steps> = mutableListOf()

        val adapter = RecyclerAdapter(this, lista)
        recyclerView.adapter = adapter

        val passo1 = Steps(
            R.drawable.step,
            "Abra o jogo",
            "Passo 1"
        )
        lista.add(passo1)

        val passo2 = Steps(
            R.drawable.step,
            "Um número será gerado onde você tem que adivinhar",
            "Passo 2"
        )

        lista.add(passo2)

        val passo3 = Steps(
            R.drawable.step,
            "Aperte checar para saber se o seu número é menor ou maior que o número escondido",
            "Passo 3"
        )

        lista.add(passo3)


        val passo4 = Steps(
            R.drawable.step,
            "Você pode aumentar ou diminuir o seu número até bater com o número certo",
            "Passo 6"
        )

        lista.add(passo4)

        val passo5 = Steps(
            R.drawable.step,
            "Suas tentativas são contabilizadas no final do jogo e mostradas após acertar",
            "Passo 5"
        )

        lista.add(passo5)


        val passo6 = Steps(
            R.drawable.step,
            "Se divirta !",
            "Passo 6"
        )

        lista.add(passo6)






    }
}