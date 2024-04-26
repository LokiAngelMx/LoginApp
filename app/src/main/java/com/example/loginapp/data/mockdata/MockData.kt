package com.example.loginapp.data.mockdata

import com.example.loginapp.domain.models.User

class MockData {
    companion object{
        val users = listOf<User>(
            User(1, email = "angel@gmail.com", password = "12345"),
            User(2, email = "pepe@gmail.com", password = "12345"),
            User(3, email = "dani@gmail.com", password = "12345"),
        )

        fun getUsers(){
            println("Get users")
        }
    }
}