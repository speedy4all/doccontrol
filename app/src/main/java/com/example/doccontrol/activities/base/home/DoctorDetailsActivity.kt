package com.example.doccontrol.activities.base.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.doccontrol.R
import com.example.doccontrol.activities.base.BaseActivity
import kotlinx.android.synthetic.main.activity_doctor_details.*
import android.graphics.BitmapFactory
import android.graphics.Bitmap
import android.util.Log
import java.io.IOException
import java.net.HttpURLConnection
import java.net.URL


class DoctorDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.doccontrol.R.layout.activity_doctor_details)
        setupListeners()

    }

    private fun setupListeners() {
        test_btn.setOnClickListener{
            runOnUiThread {
                testFunction()
            }
        }
    }
    fun getBitmapFromURL(src: String): Bitmap? {
        try {
            Log.e("src", src)
            val url = URL(src)
            val connection = url.openConnection() as HttpURLConnection
            connection.setDoInput(true)
            connection.connect()
            val input = connection.getInputStream()
            val myBitmap = BitmapFactory.decodeStream(input)
            Log.e("Bitmap", "returned")
            return myBitmap
        } catch (e: IOException) {
            e.printStackTrace()
            //Log.e("Exception", e.getMessage())
            return null
        }

    }
    private fun testFunction() {
        Toast.makeText(applicationContext, "Not yet implemented", Toast.LENGTH_LONG).show()
    }
}
