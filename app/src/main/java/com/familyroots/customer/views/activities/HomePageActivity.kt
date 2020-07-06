package com.familyroots.customer.views.activities

import android.os.Bundle
import android.os.PersistableBundle
import com.familyroots.customer.R

class HomePageActivity: BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_forgotpassword)
        supportActionBar?.title = resources.getString(R.string.app_name)
    }
}