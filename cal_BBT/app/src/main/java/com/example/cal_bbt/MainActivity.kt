package com.example.cal_bbt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        cal.setOnClickListener{
            if (fm.text.toString() != null || age != null || we != null || he != null ) {
                var fm = fm.text.toString()
                var age = age.text.toString().toInt()
                var we = we.text.toString().toInt()
                var he = he.text.toString().toInt()

            } else if (fm.text.toString() == null || age == null || we == null || he == null) {
                val not = Toast.makeText(applicationContext, "กรุณากรอกให้ครบ!!", Toast.LENGTH_LONG).show()
            }
            }
        }

    }
