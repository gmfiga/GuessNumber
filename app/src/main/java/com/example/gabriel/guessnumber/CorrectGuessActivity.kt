package com.example.gabriel.guessnumber

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_correct_guess.*

class CorrectGuessActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_correct_guess)
        playAgain()
        exitGame()
    }

    fun playAgain(){
        btnPlayAgain.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }

    fun exitGame(){
        btnExit.setOnClickListener{
            this.finishAffinity()
        }
    }
}
