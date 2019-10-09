package com.example.signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner


class MainActivity : AppCompatActivity() {

    lateinit var option:Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        option = findViewById(R.id.user_typeSpinner) as Spinner

        val options = arrayOf("Select","Self","Son","Daughter","Brother", "Sister", "Friend")
        option.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options)

        option.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {

            }

        }

    }


    fun goToLogin(view: View) {

        var loginPageIntent = Intent(this@MainActivity,SignIn::class.java)
        startActivity(loginPageIntent)
    }

    fun goToBasic(view: View) {
        var nextPageBasicIntent = Intent(this@MainActivity,SignUp_Two::class.java)
        startActivity(nextPageBasicIntent)
    }
}
