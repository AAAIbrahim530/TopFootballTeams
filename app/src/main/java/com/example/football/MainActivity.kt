package com.example.football

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    val teams = arrayOf<String>("Mamelodi Sundowns FC",
        "Bidvest Wits",
        "Orlando Pirates",
        "Kaizer Chiefs",
        "Cape Town City FC")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // get the teams view
        val teamstextView = findViewById<TextView>(R.id.teamsTextView)
        // set the text view's text to the first team
        teamstextView.text = teams[0]
        teams[0] = "Mamelodi Sundowns FC <3"
        //add all the teams manually
        var teamsDisplay = ""

        var counter = 0
        while (counter < teams.count())
        {
            teamsDisplay += "${teams[counter]}\n"
            counter++
            for (counter in 0..teams.count() - 1) {
                teamsDisplay += "${teams[counter]}\n"
            }
            teamsDisplay += "${teams[0]}\n"
            teamsDisplay += "${teams[1]}\n"
            teamsDisplay += "${teams[2]}\n"
            teamsDisplay += "${teams[3]}\n"
            teamsDisplay += "${teams[4]}\n"

            teamstextView.text = teamsDisplay
        }



        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}