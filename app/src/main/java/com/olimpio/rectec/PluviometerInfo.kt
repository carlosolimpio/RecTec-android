package com.olimpio.rectec

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class PluviometerInfo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pluviometer_info)

        val pluv = intent.getParcelableExtra<Pluviometer>("itemPluivometer")
        Log.d("olimpio", "name: " + pluv.name)
    }
}
