package com.olimpio.rectec

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mMeasures: ArrayList<String> = arrayListOf(
            "02/04/1994 - 10:35:12;999,0000 mm",
            "02/04/1994 - 10:35:12;999,0000 mm",
            "02/04/1994 - 10:35:12;999,0000 mm",
            "02/04/1994 - 10:35:12;999,0000 mm",
            "02/04/1994 - 10:35:12;999,0000 mm",
            "02/04/1994 - 10:35:12;999,0000 mm",
            "02/04/1994 - 10:35:12;999,0000 mm",
            "02/04/1994 - 10:35:12;999,0000 mm",
            "02/04/1994 - 10:35:12;999,0000 mm",
            "02/04/1994 - 10:35:12;999,0000 mm",
            "02/04/1994 - 10:35:12;999,0000 mm",
            "02/04/1994 - 10:35:12;999,0000 mm",
            "02/04/1994 - 10:35:12;999,0000 mm"
    )
    private val mPluviometers: MutableList<Pluviometer> = mutableListOf(
        Pluviometer("carlos", "metalico", "rural", mMeasures),
        Pluviometer("olimpio", "papel", "ufpe", mMeasures),
        Pluviometer("rodrigues", "madeira", "upe", mMeasures),
        Pluviometer("de", "pedra", "catolica", mMeasures),
        Pluviometer("Melo", "ouro", "nassau", mMeasures),
        Pluviometer("Filho", "prata", "fg", mMeasures),
        Pluviometer("carlos1", "cobre", "senac", mMeasures),
        Pluviometer("carlos1", "cobre", "senac", mMeasures)
        )

    lateinit var pluviometerAdapter: PluviometerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pluviometerAdapter = PluviometerAdapter(this, mPluviometers)
        rv_pluviometers.adapter = pluviometerAdapter
        rv_pluviometers.layoutManager = LinearLayoutManager(this)
    }

}
