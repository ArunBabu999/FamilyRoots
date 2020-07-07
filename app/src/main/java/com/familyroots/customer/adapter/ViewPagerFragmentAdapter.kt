package com.familyroots.customer.adapter

import androidx.annotation.NonNull
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.familyroots.customer.views.fragments.GroupsFragment
import com.familyroots.customer.views.fragments.HomeFragment
import com.familyroots.customer.views.fragments.SettingsFragment


class ViewPagerFragmentAdapter(@NonNull fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {

    @NonNull
    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return HomeFragment()
            1 -> return GroupsFragment()
            2 -> return SettingsFragment()
        }
        return HomeFragment()
    }

    override fun getItemCount(): Int {
        return 3
    }
}