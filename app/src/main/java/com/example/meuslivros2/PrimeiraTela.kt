package com.example.meuslivros2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.meuslivros2.databinding.ActivityMainBinding

class PrimeiraTela : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        val view = binding.root

        setContentView(view)

        binding.botaoCadastroLivros.setOnClickListener {
            var intent = Intent(this, CadastrarLivros::class.java)
            startActivity(intent)
        }

        binding.botaoVerLivros.setOnClickListener {
            var intent = Intent(this, MeusLivros::class.java)
            startActivity(intent)
        }

    }
}