package com.familyroots.customer.response

import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("partnerId")
    val partnerId: Long
)