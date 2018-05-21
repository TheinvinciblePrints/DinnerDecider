package com.example.emmabuthen.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Chinese", "Burger King", "Hamburger", "Roti Telur", "McDonalds")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addFoodBtn.setOnClickListener(View.OnClickListener {
            val newFood = addFoodTxt?.text.toString().trim()

            if (newFood.isNullOrBlank())
                Toast.makeText(applicationContext, "Enter food name", Toast.LENGTH_SHORT).show()
            else
                foodList.add(newFood)

            addFoodTxt.text.clear()

        })


        decideBtn.setOnClickListener {

            val random = Random()
            val foodRandom = random.nextInt(foodList.count())

            selectedFoodTxt.text = foodList[foodRandom]
        }


    }
}
