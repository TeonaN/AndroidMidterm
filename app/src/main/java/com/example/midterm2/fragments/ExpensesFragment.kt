package com.example.midterm2.fragments

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import com.example.midterm2.App
import com.example.midterm2.R
import com.example.midterm2.Type
import kotlinx.android.synthetic.main.fragment_expenses.*


class ExpensesFragment : Fragment(R.layout.fragment_expenses){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        save.setOnClickListener{

            val input = fuel.text.toString()
            val input2 = electricity.text.toString()
            val input3 = water.text.toString()
            val input4 = gas.text.toString()


            var type = Type(0, input,input2,input3,input4)


            App.instance.db.getTypeDao().insert(type)

            App.instance.db.getTypeDao().getAllType().forEach { type ->
                Log.d("Mydata", type.toString())
            }

            fuel.setText("")
            electricity.setText("")
            water.setText("")
            gas.setText("")

        }

    }

}