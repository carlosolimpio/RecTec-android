package com.olimpio.rectec

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Pluviometer(var id: String,
                       var type: String,
                       var location:String,
                       var measures: ArrayList<String>) : Parcelable