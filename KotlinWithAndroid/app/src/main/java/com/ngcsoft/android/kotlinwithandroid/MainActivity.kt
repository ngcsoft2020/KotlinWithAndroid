package com.ngcsoft.android.kotlinwithandroid

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Remove extra boiler code to declare and initialize btn_click variable
        //Here we use high-level lamda-expression functionality for onClick operation
        btn_click.setOnClickListener {
            //write code here
            Toast.makeText(this, "I am Clicked!", Toast.LENGTH_SHORT).show()
        }

        btn_send_message.setOnClickListener {
            // kotlin doesn't have getter/setter concept instead have property concept
            //that's why instead of ed_message.getText(), we use ed_message.text
            val msg: String = ed_message.text.toString()
            //  Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
            //the way of declaring second parameter in intent object is known as Kotlin reflations
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("user_msg",msg)
            startActivity(intent)
        }
    }
}