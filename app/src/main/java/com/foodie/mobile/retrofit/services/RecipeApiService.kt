package com.foodie.mobile.retrofit.services

import com.foodie.mobile.retrofit.dto.recipes.RecipeResponseDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header

interface RecipeApiService {
    @GET("recipe")
    suspend fun getRecipe(
        @Header("Authorization") token: String,
    ): Response<RecipeResponseDto>
}
