package com.foodie.mobile.retrofit.dto.auth

import com.google.gson.annotations.SerializedName

data class LoginResponseDto(
    @SerializedName("access_token")
    val accessToken: String,

    @SerializedName("refresh_token")
    val refreshToken: String
)
