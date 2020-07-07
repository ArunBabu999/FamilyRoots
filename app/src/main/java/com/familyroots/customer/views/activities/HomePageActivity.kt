package com.familyroots.customer.views.activities

import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.viewpager2.widget.ViewPager2
import com.familyroots.customer.R
import com.familyroots.customer.adapter.ViewPagerFragmentAdapter
import com.familyroots.customer.databinding.ActivityHomeBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class HomePageActivity : BaseActivity() {

    private var activityLoginHomeBinding: ActivityHomeBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityLoginHomeBinding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(activityLoginHomeBinding?.root)
        supportActionBar?.title = resources.getString(R.string.app_name)
        activityLoginHomeBinding?.viewPager?.adapter = ViewPagerFragmentAdapter(this)
        // attaching tab mediator
        TabLayoutMediator(
            activityLoginHomeBinding?.tabLayout as TabLayout, activityLoginHomeBinding?.viewPager as ViewPager2
        ) { tab, position ->
            when(position){
                0 -> {tab.icon = ContextCompat.getDrawable(this, R.drawable.home_icon)}
                1 -> {tab.icon = ContextCompat.getDrawable(this, R.drawable.family_icon)}
                2 -> {tab.icon = ContextCompat.getDrawable(this, R.drawable.group_icon)}
                3 -> {tab.icon = ContextCompat.getDrawable(this, R.drawable.profile_icon)}
                4 -> {tab.icon = ContextCompat.getDrawable(this, R.drawable.notification_icon)}
                5 -> {tab.icon = ContextCompat.getDrawable(this, R.drawable.menu_icon)}
            }
        }.attach()
    }
}