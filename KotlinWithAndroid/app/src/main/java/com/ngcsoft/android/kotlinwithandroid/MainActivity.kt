package com.ngcsoft.android.kotlinwithandroid

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity :AppCompatActivity (){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Remove extra boiler code to declare and initialize btn_click variable
        //Here we use high-level lamda-expression functionality for onClick operation
        btn_click.setOnClickListener {
            //write code here
            Toast.makeText(this,"I am Clicked!",Toast.LENGTH_SHORT).show()
        }
    }
}