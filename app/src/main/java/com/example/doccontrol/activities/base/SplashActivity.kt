package com.example.doccontrol.activities.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.doccontrol.R
import com.example.doccontrol.activities.base.home.DoctorDetailsActivity
import com.google.android.gms.common.GoogleApiAvailability
import org.jetbrains.anko.intentFor

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }
    override fun onStart() {
        super.onStart()
        GoogleApiAvailability.getInstance().makeGooglePlayServicesAvailable(this@SplashActivity)
        routeToAppropriatePage()

    }
    private fun routeToAppropriatePage() {
        startActivity(intentFor<DoctorDetailsActivity>())
        finish()
    }
}
