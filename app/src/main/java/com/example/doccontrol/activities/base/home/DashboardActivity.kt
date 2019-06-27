package com.example.doccontrol.activities.base.home

import android.os.Bundle
import com.example.doccontrol.R
import com.example.doccontrol.activities.base.BaseActivity

class DashboardActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



    }

    override fun getContentViewResId(): Int {
        return R.layout.content_dashboard
    }

    override fun getActionTitle(): String {
        return getString(R.string.dashboard)
    }

    override fun getMenuForActivity(): Int {
        return R.menu.main
    }

}
