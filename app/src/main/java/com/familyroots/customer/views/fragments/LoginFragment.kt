package com.familyroots.customer.views.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.familyroots.customer.R
import androidx.databinding.DataBindingUtil
import com.familyroots.customer.databinding.FragmentLoginBinding
import com.familyroots.customer.views.callbacks.LoginActivityCallback
import android.widget.Toast


class LoginFragment: BaseFragment(), LoginActivityCallback {

    lateinit private var TAG: String;
    private var loginBinding: FragmentLoginBinding? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        TAG = activity.localClassName
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        loginBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)
        loginBinding?.logincallback = this
        return loginBinding?.root
    }

    override fun onLoginClick() {
        Toast.makeText(getActivity(),"Login Click",Toast.LENGTH_SHORT).show();
    }

    override fun onCreateAccountClick() {
        getActivity()?.supportFragmentManager?.beginTransaction()?.replace(R.id.container, CreateNewAccountFragment())?.addToBackStack("Login")?.commit();
    }

    override fun onForgotPasswordClick() {
       getActivity()?.supportFragmentManager?.beginTransaction()?.replace(R.id.container, ForgotPasswordFragment())?.addToBackStack("Login")?.commit();
    }
}