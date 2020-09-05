package com.ngcsoft.android.kotlinwithandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        //Here we use kotlin "?" nullable operator to avoid nullpointer exception
        val bundle:Bundle?=intent.extras
        //as we use nullable operator for bundle so below we use not null assertion operator "!!"
        val msg=bundle!!.getString("user_msg")

        tv_message.text=msg
    }
}
