package edu.fullerton.fz.cs411.resourcesandconstraints01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private lateinit var btn: Button
    private lateinit var image: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MyCode", "greeting: ${R.string.greeting}")
        btn = findViewById(R.id.button)
        image = findViewById(R.id.imageView)
        btn.setOnClickListener {
            image.setImageDrawable(getDrawable(R.drawable.screenshot))
        }
    }
}