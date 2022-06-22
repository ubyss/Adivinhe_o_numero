package com.example.quizz

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_game.*
import kotlin.random.Random


class GameFragment : Fragment() {
     lateinit var viewModel: ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_game, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val usuarioNome = (requireActivity() as GameActivity).userName
        val hideNumber = Random.nextInt(0, 10)
        var score = 0

        viewModel = ViewModelProvider(this)[ViewModel::class.java]

        viewModel.currentUserNumber.observe(viewLifecycleOwner, Observer {
            edt_userNumber.text = it.toString()
        })

        edt_userNumber.text = viewModel.number.toString()
        btn_plus.setOnClickListener {
            viewModel.currentUserNumber.value = ++viewModel.number
        }
        btn_minus.setOnClickListener {
            viewModel.currentUserNumber.value = --viewModel.number
        }

        btn_check.setOnClickListener {
            if(hideNumber > viewModel.number){
                tv_hint.text = "$usuarioNome, seu número é menor"
                ++score
            } else if(hideNumber == viewModel.number) {
                tv_hint.text = "$usuarioNome, parabens esse é o numero !"
                val action = GameFragmentDirections.actionGameFragmentToResultActivity(usuarioNome as String, score)
                findNavController().navigate(action)
            } else{
                tv_hint.text = "$usuarioNome, seu número é maior"
                ++score
            }
        }
    }

}
