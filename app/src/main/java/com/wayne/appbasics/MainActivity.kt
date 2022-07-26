package com.wayne.appbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var inputOne: EditText = findViewById(R.id.inputOne)
        var inputTwo: EditText = findViewById(R.id.inputTwo)
        var myButton: Button = findViewById(R.id.buttonAdd)
        var myResult: TextView = findViewById(R.id.txtResult)

        //listener
        myButton.setOnClickListener {
            //get the text the user has entered
            var firstText = inputOne.text.toString().trim()
            var secondText = inputTwo.text.toString().trim()
            //convert to numbers

            if (firstText.isEmpty() || secondText.isEmpty()) {
                Toast.makeText(applicationContext, "please enter all values", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            try {

                var firstNumber = firstText.toDouble()
                var secondNumber = secondText.toDouble()

                //calculate add
                var sum = firstNumber + secondNumber

                //display
                myResult.text = "Sum is $sum"
            }catch(e:Exception){
                Toast.makeText(applicationContext, "Enter valid values", Toast.LENGTH_SHORT).show()
            }


        }


    }
}