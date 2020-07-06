package com.familyroots.customer.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.familyroots.customer.R

class CreateNewAccountFragment : BaseFragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        activity.setTitle("bhjbj")
        return inflater.inflate(R.layout.fragment_createaccount, container, false)
    }
}