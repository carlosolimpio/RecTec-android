package com.olimpio.rectec

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Pluviometer(var name: String, var type: String, var location:String) : Parcelable