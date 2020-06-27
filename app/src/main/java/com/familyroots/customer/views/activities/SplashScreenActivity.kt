package com.familyroots.customer.views.activities

import android.app.Activity
import android.os.Bundle
import android.os.Handler

/**
 * @author Arun Babu pathakota
 */
class SplashScreenActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed({ launchLoginActivity() }, ApplicationConstants.SPLASH_SCREEN_DELAY)
    }

}