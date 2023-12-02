package com.foodie.mobile.auth

/**
 * TODO: rewrite to safety storage token in database
 */
class TokenManager {
    companion object {
        private var token: String? = null
    }

    fun getToken() : String? {
        return token
    }

    suspend fun saveToken(token: String) {
        TokenManager.token = token
    }
}
