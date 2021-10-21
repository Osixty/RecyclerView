package com.example.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.dedi,
                "dedi cahyadi",
                "GG gaming"


            ),
            Superhero(
                R.drawable.rafatar,
                "Rafatar",
                "Gue udah kaya dari lahir"
            ),
            Superhero(
                R.drawable.david,
                "david gadgetin",
                "Hallo guys david disini..."

            ),
            Superhero(
                R.drawable.arab,
                "Reja Arab",
                "Gamers ganteng idaman"
            )


        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList){

        }
    }
}