package com.example.doccontrol.activities.base.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.doccontrol.R
import kotlinx.android.synthetic.main.activity_doctor_details.*

class DoctorDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctor_details)
        setupListeners()
    }

    private fun setupListeners() {
        test_btn.setOnClickListener{
            runOnUiThread {
                testFunction()
            }
        }
    }

    private fun testFunction() {
        Toast.makeText(applicationContext, "Not yet implemented", Toast.LENGTH_LONG).show()
    }
}
