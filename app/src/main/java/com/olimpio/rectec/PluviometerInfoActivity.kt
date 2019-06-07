package com.olimpio.rectec

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_pluviometer_info.*

class PluviometerInfoActivity : AppCompatActivity() {

    lateinit var pluviometerInfoAdapter: PluviometerInfoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pluviometer_info)

        val pluv = intent.getParcelableExtra<Pluviometer>("itemPluivometer")
        val textViewPluvId = tv_pluv_id_value
        val textViewPluvLocation = tv_pluv_location_value

        textViewPluvId.text = pluv.id
        textViewPluvLocation.text = pluv.location

        pluviometerInfoAdapter = PluviometerInfoAdapter(this, pluv.measures)
        rv_measures.adapter = pluviometerInfoAdapter
        rv_measures.layoutManager = LinearLayoutManager(this)

        //TODO make button work
    }
}
