package com.example.midterm2.fragments.data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.midterm2.R
import com.example.midterm2.Type
import kotlinx.android.synthetic.main.all_data.view.*

class DataAdapter(private var types: List<Type>) :
    RecyclerView.Adapter<DataAdapter.ProductViewHolder>() {

    class ProductViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.all_data, parent, false)
        return ProductViewHolder(view)

    }

    override fun getItemCount(): Int = types.count()

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val p = types[position]


        holder.itemView.fuelData.text = "Fuel: "+p.fuel
        holder.itemView.elData.text = "Electricity: "+p.electricity
        holder.itemView.waterData.text = "Water: "+p.water
        holder.itemView.gasData.text = "Gas: "+p.gas

    }
}