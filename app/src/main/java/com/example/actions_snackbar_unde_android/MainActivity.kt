package com.example.actions_snackbar_unde_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAdd = findViewById<Button>(R.id.add)

        btnAdd.setOnClickListener {
            showSnackbar(findViewById<View>(R.id.CurrentLayout),"Added",Snackbar.LENGTH_LONG)
        }
    }

    private fun showSnackbar(v: View, str: String, duration: Int) {
        var snackbar = Snackbar.make(v, str, duration)

        snackbar.setAction("DISMISS",View.OnClickListener {
            @Override
            fun onClick(v: View){
                // Desired functionality goes here
                // Functionality used here is only to dismiss the Snackbar
                // But it can have any desired functionality
                snackbar.dismiss()
            }
        })

        snackbar.show()
    }
}
