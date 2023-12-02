package com.foodie.mobile.retrofit.services

import com.foodie.mobile.retrofit.dto.auth.LoginRequestDto
import com.foodie.mobile.retrofit.dto.auth.LoginResponseDto
import com.foodie.mobile.retrofit.dto.auth.RegisterRequestDto
import com.foodie.mobile.retrofit.dto.auth.RegisterResponseDto
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthApiService {
    @POST("auth/login")
    suspend fun login(
        @Body auth: LoginRequestDto
    ) : Response<LoginResponseDto>

    @POST("auth/register")
    suspend fun register(
        @Body auth: RegisterRequestDto
    ) : Response<RegisterResponseDto>
}
