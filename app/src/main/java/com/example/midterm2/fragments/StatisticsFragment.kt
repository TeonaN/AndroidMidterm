package com.example.midterm2.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.midterm2.App
import com.example.midterm2.R
import kotlinx.android.synthetic.main.fragment_statistics.*

class StatisticsFragment : Fragment(R.layout.fragment_statistics) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val sum1=App.instance.db.getTypeDao().getFuelSum()
        val sum2=App.instance.db.getTypeDao().getElectricitySum()
        val sum3=App.instance.db.getTypeDao().getWaterSum()
        val sum4=App.instance.db.getTypeDao().getGasSum()

        var text1="Fuel: $sum1"
        var text2="Electricity: $sum2"
        var text3="Water: $sum3"
        var text4="Gas: $sum4"

        fuelSum.text=text1
        electricitySum.text=text2
        waterSum.text=text3
        gasSum.text=text4
    }
}