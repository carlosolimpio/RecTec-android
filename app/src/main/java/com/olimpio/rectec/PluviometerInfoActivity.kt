package com.olimpio.rectec

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBar
import android.support.v7.app.AlertDialog
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.MenuItem
import android.widget.Button
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_pluviometer_info.*

class PluviometerInfoActivity : AppCompatActivity() {

    lateinit var pluviometerInfoAdapter: PluviometerInfoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pluviometer_info)

        //top back button
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)
        getSupportActionBar()?.setDisplayShowHomeEnabled(true)


        val pluv = intent.getParcelableExtra<Pluviometer>("itemPluivometer")
        val textViewPluvId = tv_pluv_id_value
        val textViewPluvLocation = tv_pluv_location_value
        textViewPluvId.text = pluv.id
        textViewPluvLocation.text = pluv.location

        pluviometerInfoAdapter = PluviometerInfoAdapter(this, pluv.measures)
        rv_measures.adapter = pluviometerInfoAdapter
        rv_measures.layoutManager = LinearLayoutManager(this)

        //button click
        val btnShowMeasure = findViewById<Button>(R.id.btn_show_measure)
        btnShowMeasure.setOnClickListener {
            showAlertMeasure(pluv) //irá receber o pluv da api
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    private fun showAlertMeasure(pluv: Pluviometer) {
        var id = pluv.id
        var measure = pluv.measures[0].split(";").elementAt(1) //por enquanto
        var alertDialog = AlertDialog.Builder(this)

        alertDialog.setTitle("Medida Atual")
        alertDialog.setMessage("O pluviômetro de ID: $id está medindo $measure") //TODO colocar dados de um pluviometro aqui: id, data e medida

        alertDialog.setNeutralButton("FECHAR", { alertDialog, i -> })
        alertDialog.show()
    }
}
