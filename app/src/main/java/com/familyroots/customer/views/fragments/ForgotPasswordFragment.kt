package com.familyroots.customer.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.familyroots.customer.R

class ForgotPasswordFragment : BaseFragment() {

    lateinit private var TAG: String;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        (activity as AppCompatActivity).supportActionBar?.title= resources.getString(R.string.forgot_password_title)
        return inflater.inflate(R.layout.fragment_forgotpassword, container, false);
    }


}