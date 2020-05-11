package com.example.todo.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.todo.R
import com.example.todo.adapters.ToDoAdapter
import com.example.todo.api.data.RetrofitClient
import com.example.todo.api.data.ToDos
import kotlinx.android.synthetic.main.second_activity.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SecondActivity: AppCompatActivity() {

    private lateinit var todoAdapter: ToDoAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        this.initRecycler()

        val userId = intent.extras?.getInt("userId")

        if (userId != null) {

            RetrofitClient.reqResApi.getUserToDos(userId).enqueue(object : Callback<List<ToDos>>{
                override fun onFailure(call: Call<List<ToDos>>, t: Throwable) {
                    TODO("Not yet implemented")
                }

                override fun onResponse(call: Call<List<ToDos>>, response: Response<List<ToDos>>) {

                        if (response.isSuccessful && response.body() != null) {
                            todoAdapter.updateToDos(response.body()!!)
                        }

                }


            })

        }


    }



    private fun initRecycler() {
        val layoutManager = LinearLayoutManager(this)
        todoList.layoutManager = layoutManager
        todoAdapter = ToDoAdapter(ArrayList())
        todoList.adapter = todoAdapter
    }
}