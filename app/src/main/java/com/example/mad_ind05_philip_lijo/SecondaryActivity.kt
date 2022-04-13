package com.example.mad_ind05_philip_lijo

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondaryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)

        //  Reference to the state elements in second activity.
        val stateNamePassed: TextView = findViewById(R.id.name)
        val stateAreaPassed: TextView = findViewById(R.id.area)
        val flagImagePassed: ImageView = findViewById(R.id.flag_image)
        val stateImagePassed: ImageView = findViewById(R.id.state_image)

        // Receiving passed data with each key.
        val bundle : Bundle?= intent.extras
        val name = bundle!!.getString("name")
        val imageId = bundle.getInt("imageId")
        val area = bundle.getString("area")
        val imageId2 = bundle.getInt("imageId2")

        // Setting data to the view elements.
        stateNamePassed.text = name
        stateAreaPassed.text = area
        flagImagePassed.setImageResource(imageId)
        stateImagePassed.setImageResource(imageId2)
    }
}