package com.example.meuslivros2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.example.meuslivros2.databinding.ActivityCadastrarLivrosBinding
import com.example.meuslivros2.databinding.ActivityMainBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class CadastrarLivros : AppCompatActivity() {

    private lateinit var binding: ActivityCadastrarLivrosBinding

    private lateinit var database : DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCadastrarLivrosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botaoCadastrar.setOnClickListener{

            val nomeLivro = binding.nomeLivro.text.toString()
            val nomeAutor = binding.nomeAutor.text.toString()
            val editora = binding.editora.text.toString()

            database = FirebaseDatabase.getInstance().getReference("Livros")
            val Livro = Livro(nomeLivro, nomeAutor, editora)
            database.child(nomeLivro).setValue(Livro).addOnSuccessListener {

                binding.nomeLivro.text.clear()
                binding.nomeAutor.text.clear()
                binding.editora.text.clear()

                Toast.makeText(this, "Salvado com sucesso", Toast.LENGTH_SHORT ).show()


            }



        }
    }
}