package com.olimpio.rectec

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mPluviometers: MutableList<Pluviometer> = mutableListOf(
        Pluviometer("carlos", "metalico", "rural"),
        Pluviometer("olimpio", "papel", "ufpe"),
        Pluviometer("rodrigues", "madeira", "upe"),
        Pluviometer("de", "pedra", "catolica"),
        Pluviometer("Melo", "ouro", "nassau"),
        Pluviometer("Filho", "prata", "fg"),
        Pluviometer("carlos1", "cobre", "senac")
    )

    lateinit var pluviometerAdapter: PluviometerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pluviometerAdapter = PluviometerAdapter(this, mPluviometers)
        rvPluviometer.adapter = pluviometerAdapter
        rvPluviometer.layoutManager = LinearLayoutManager(this)
        rvPluviometer.smoothScrollToPosition(mPluviometers.size)
    }



}
