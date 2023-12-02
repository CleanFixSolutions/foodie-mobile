package com.foodie.mobile.retrofit.dto.recipes

data class RecipeResponseDto(
    val recipeBlockDtoList: List<RecipeBlockDto>,
    val author: String
)
