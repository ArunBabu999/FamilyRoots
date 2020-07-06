package com.familyroots.customer.views.activities

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import com.familyroots.customer.R
import com.familyroots.customer.constants.ApplicationConstants

/**
 * @author Arun Babu pathakota
 */
class SplashScreenActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed({ launchLoginActivity() }, ApplicationConstants.SPLASH_SCREEN_DELAY)
    }

    private fun launchLoginActivity(){
        val loginActivity = Intent(this, LoginActivity::class.java)
        startActivity(loginActivity)
        finish()
    }

}