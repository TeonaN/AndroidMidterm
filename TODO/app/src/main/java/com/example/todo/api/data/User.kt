package com.example.todo.api.data


data class AddressInfo(

    val street: String,

    val city: String

)

data class User(

    val id: Int,

    val name: String,

    val email: String,

    val address: AddressInfo


)


data class ToDos(
    val userId: Int,
    val id: Int,
    val title: String,
    val completed: Boolean

)