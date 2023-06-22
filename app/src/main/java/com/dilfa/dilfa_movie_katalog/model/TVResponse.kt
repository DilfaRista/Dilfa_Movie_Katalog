package com.dilfa.dilfa_movie_katalog.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class TVResponse(
    @SerializedName("result")
    val TV : List<TV>

): Parcelable{
    constructor(): this(mutableListOf())
}
