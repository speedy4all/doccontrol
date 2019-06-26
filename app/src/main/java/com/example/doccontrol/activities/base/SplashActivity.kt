package com.example.doccontrol.activities.base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.doccontrol.R
import com.example.doccontrol.activities.base.home.DashboardActivity
import com.google.android.gms.common.GoogleApiAvailability
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
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
        startActivity(intentFor<DashboardActivity>())
        finish()
    }
}
