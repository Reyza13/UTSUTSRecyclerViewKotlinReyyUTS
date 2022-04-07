package com.reyy.recyclerviewkotlinreyy

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Badminton(
   val imgBadminton: Int,
   val nameBadminton: String,
   val descBadminton: String
) : Parcelable
