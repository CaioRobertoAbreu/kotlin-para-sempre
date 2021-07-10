package com.kotlin.app6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var aboutButton : Button
    private lateinit var formationButton : Button
    private lateinit var experienceButton : Button
    private lateinit var objectiveButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        aboutButton = findViewById(R.id.about_button)
        formationButton = findViewById(R.id.formation_button)
        experienceButton = findViewById(R.id.experience_button)
        objectiveButton = findViewById(R.id.objective_button)

        aboutButton.setOnClickListener{
            startActivity(Intent(this@MainActivity, AboutActivity::class.java))
        }

        formationButton.setOnClickListener{
            startActivity(Intent(this@MainActivity, FormationActivity::class.java))
        }

        experienceButton.setOnClickListener{
            startActivity(Intent(this@MainActivity, ExperienceActivity::class.java))
        }


        objectiveButton.setOnClickListener{
            startActivity(Intent(this@MainActivity, ObjectiveActivity::class.java))
        }
    }
}