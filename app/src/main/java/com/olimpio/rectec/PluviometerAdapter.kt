package com.olimpio.rectec

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.list_item.view.*

class PluviometerAdapter (private val context: Context, private var pluviometerList: MutableList<Pluviometer>):
        RecyclerView.Adapter<PluviometerAdapter.PluviometerViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, position: Int): PluviometerViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return PluviometerViewHolder(view)
    }

    override fun onBindViewHolder(holder: PluviometerViewHolder, position: Int) {
        holder.bindView(pluviometerList[position])
    }

    override fun getItemCount() = pluviometerList.size

    class PluviometerViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
        val textViewName = itemView.txtName
        val textViewType = itemView.txtType
        val textViewLocation = itemView.txtLocation

        fun bindView(pluviometer: Pluviometer) {
            textViewName.text = pluviometer.name
            textViewType.text = pluviometer.type
            textViewLocation.text = pluviometer.location
        }
    }
}
