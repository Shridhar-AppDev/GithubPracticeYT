    package com.app.githubpracticeyt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("This is my another branch")
        println("Change 3")
        println("This is my hello from your friend")
    }
}