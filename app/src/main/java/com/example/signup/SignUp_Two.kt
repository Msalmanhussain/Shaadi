package com.example.signup

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.DatePicker
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_sign_up__two.*
import java.util.*

class SignUp_Two : AppCompatActivity() {

    lateinit var religionChoose:Spinner
    lateinit var MotherTongueChoose:Spinner
    lateinit var countryChoose:Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up__two)

        //spinner for religion choice

        religionChoose = findViewById(R.id.religion_spinner_signUp) as Spinner

        val options = arrayOf("Muslim","Christan","Hindu")
        religionChoose.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options)

        religionChoose.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
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
        //end of religion choice calender
        //start of motherTongue choose calender

        MotherTongueChoose = findViewById(R.id.motherTongue_spinner_signUp) as Spinner

        val optionsForTongue = arrayOf("Urdu","Punjabi","Sraiki","Pashtoon","Balochi")
        MotherTongueChoose.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,optionsForTongue)

        MotherTongueChoose.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
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
        //end of mother tongue spinner
        //start of country spinner

        countryChoose = findViewById(R.id.country_spinner_signUp) as Spinner

        val optionsForCountry = arrayOf("Pakistan","Spain","Australia","United Kingdom","United States")
        countryChoose.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,optionsForCountry)

        countryChoose.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
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

        //Date Picker Calender
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        date_OB_Button.setOnClickListener{
            val dob = DatePickerDialog(this, DatePickerDialog.OnDateSetListener{view:DatePicker, mYear:Int, mMonth:Int, mDay:Int ->
                //setToTextView
                date_show_text_signup.setText(""+ mDay +"/"+ mMonth +"/"+ mYear)
            }, year,month,day)
            //show date
            dob.show()
        }

    }
}
