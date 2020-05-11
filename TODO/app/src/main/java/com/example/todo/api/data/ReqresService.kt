package com.example.todo.api.data
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ReqresService {

    @GET("users")
    fun getUsers(): Call<List<User>>

    @GET("users/{userId}/todos")
    fun getUserToDos(@Path("userId") userId: Int): Call<List<ToDos>>

}