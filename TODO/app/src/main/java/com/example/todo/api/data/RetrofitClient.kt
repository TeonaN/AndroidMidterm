package com.example.todo.api.data

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {

    private lateinit var retrofit: Retrofit
    private lateinit var okHttpClient: OkHttpClient

    fun initClient() {

        okHttpClient = OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
            .build()

        retrofit = Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }

    private fun <S> getService(serviceClass: Class<S>): S {
        return retrofit.create(serviceClass)
    }

    val reqResApi: ReqresService
        get() = getService(ReqresService::class.java)

}