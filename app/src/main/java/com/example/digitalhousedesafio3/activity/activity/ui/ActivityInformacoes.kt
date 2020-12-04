package com.example.digitalhousedesafio3.activity.activity.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.digitalhousedesafio3.R
import kotlinx.android.synthetic.main.activity_cadastro.*

class ActivityInformacoes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informacoes)


        inputPassword.transformationMethod =
            AsteriskPassword()

        toolbar.setNavigationOnClickListener {
            this.onBackPressed()
        }

        btnFinalizaCadastro.setOnClickListener {
            startActivity(Intent(this, ActivityLista::class.java))
        }
    }
}