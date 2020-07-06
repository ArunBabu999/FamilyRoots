package com.familyroots.customer.views.activities

import android.os.Bundle
import com.familyroots.customer.R
import com.familyroots.customer.views.fragments.LoginFragment

class LoginActivity: BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout)
        supportActionBar?.title = resources.getString(R.string.login_label)
        addLoginFragment()
    }
    private fun addLoginFragment() {
        supportFragmentManager.beginTransaction().replace(R.id.container, LoginFragment()).commit()
    }
    override fun invalidateOptionsMenu() {
        super.invalidateOptionsMenu()
    }
}