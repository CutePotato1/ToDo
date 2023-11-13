package com.todo

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ToDoAdapter (
    private val todos: MutableList<ToDo>
): RecyclerView.Adapter<ToDoAdapter.ToDoViewHolder>()
{

    class ToDoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ToDoViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}