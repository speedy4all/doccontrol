package com.example.doccontrol.activities.base.home

import com.example.doccontrol.R
import com.example.doccontrol.activities.base.BaseActivity

class DashboardActivity : BaseActivity() {
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
