package com.picker.intentpass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun OnClick(view: View) {
        var intent = Intent(this,MainActivity2::class.java)
        startActivity(intent)
        Log.d(Companion.TAG, "OnClick: ")
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}