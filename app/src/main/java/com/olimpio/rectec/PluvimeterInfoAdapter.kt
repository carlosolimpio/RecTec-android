package com.olimpio.rectec

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_pluviometer_info.view.*
import kotlinx.android.synthetic.main.item_pluv_measure.view.*

class PluviometerInfoAdapter(private val context: Context, private var mMeasure: MutableList<String>):
        RecyclerView.Adapter<PluviometerInfoAdapter.PluviometerInfoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): PluviometerInfoViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_pluv_measure, parent, false)
        return PluviometerInfoViewHolder(view)
    }

    override fun getItemCount() = mMeasure.size

    override fun onBindViewHolder(holder: PluviometerInfoViewHolder, position: Int) {
        holder.bindView(mMeasure[position])
    }


    class PluviometerInfoViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val textViewTimeStamp = itemView.tv_pluv_timestamp
        val textViewMeasure = itemView.tv_pluv_measure

        fun bindView(measure : String) {
            //measure string
            var pair = measure.split(";")
            textViewTimeStamp.text = pair.elementAt(0)
            textViewMeasure.text = pair.elementAt(1)
        }
    }
}