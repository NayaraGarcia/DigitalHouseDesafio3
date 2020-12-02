package com.example.digitalhousedesafio3.activity.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.digitalhousedesafio3.R
import kotlinx.android.synthetic.main.activity_login.*

class ActivityLogin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        inputPassword.transformationMethod =
            AsteriskPassword()

        btnLogin.setOnClickListener {
            startActivity(Intent(this, ActivityLista::class.java))
        }

        btnCadastro.setOnClickListener {
            startActivity(Intent(this, ActivityCadastro::class.java))
        }


    }

}