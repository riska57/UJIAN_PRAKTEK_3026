package com.example.riska_anggun_pplg1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnbiodata: Button = findViewById(R.id.button1)
        val btnpendidikan: Button = findViewById(R.id.button2)
        val btnportofolio: Button = findViewById(R.id.button3)


        btnbiodata.setOnClickListener {
            val intent = Intent(this, Activity_Biodata::class.java)
            startActivity(intent)
        }

        btnpendidikan.setOnClickListener {
            val intent = Intent(this, Activity_Pendidikan::class.java)
            startActivity(intent)
        }

        btnportofolio.setOnClickListener {
            val intent = Intent(this, Activity_Portofolio::class.java)
            startActivity(intent)
        }

    }
}