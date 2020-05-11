package com.example.todo.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.todo.R
import com.example.todo.api.data.ToDos
import kotlinx.android.synthetic.main.user_todos.view.*


class ToDoAdapter(private var todos: List<ToDos>) :
    RecyclerView.Adapter<ToDoAdapter.ToDoViewHolder>() {

    class ToDoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {



        private lateinit var todo: ToDos

        fun bind(todo: ToDos) {

            this.todo = todo

            itemView.title.text = todo.title

            itemView.completed.text = todo.completed.toString()


        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.user_todos, parent, false)
        return ToDoViewHolder(v)
    }

    override fun getItemCount(): Int = todos.size

    override fun onBindViewHolder(holder: ToDoViewHolder, position: Int) {
        holder.bind(todos[position])
    }

    fun updateToDos(todos: List<ToDos>) {
        this.todos = todos
        notifyDataSetChanged()
    }


}