package com.example.rule369
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("verifyEmail")
    fun verifyEmail(@Query("email") email: String): Call<EmailVerificationResponse>
}

data class EmailVerificationResponse(
    val exists: Boolean
)
