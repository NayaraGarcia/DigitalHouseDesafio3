package com.example.digitalhousedesafio3.activity.activity.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.digitalhousedesafio3.R
import kotlinx.android.synthetic.main.activity_cadastro.*

class ActivityCadastro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        inputPassword.transformationMethod =
            AsteriskPassword()

        toolbar.setNavigationOnClickListener {
            this.onBackPressed()
        }


        }
    }
