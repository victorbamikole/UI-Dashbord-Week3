package com.example.appdashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatDelegate
import com.google.android.material.switchmaterial.SwitchMaterial

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Creating the app Top bar

        val tool: androidx.appcompat.widget.Toolbar? = findViewById(R.id.toolBar)

        if (tool != null){
            setSupportActionBar(tool)
        }


        //Implementing the switch to toggle between light and dark mode
        val switch1 = findViewById<SwitchMaterial>(R.id.switch1)

        switch1.setOnClickListener {
            if (switch1.isChecked) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
        }

    }

}
