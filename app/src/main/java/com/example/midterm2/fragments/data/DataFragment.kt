package com.example.midterm2.fragments.data

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.midterm2.App
import com.example.midterm2.R
import com.example.midterm2.Type
import kotlinx.android.synthetic.main.fragment_data.*

class DataFragment : Fragment(R.layout.fragment_data) {

    private lateinit var types: List<Type>


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        types = App.instance.db.getTypeDao().getAllType()

        var adapter = DataAdapter(types)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this.context)

    }


}