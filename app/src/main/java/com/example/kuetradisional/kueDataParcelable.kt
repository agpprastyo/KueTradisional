package com.example.kuetradisional

import android.os.Parcel
import android.os.Parcelable

class kueDataParcelable(
    val photo: Int?,
    val name: String?,
    val detail: String?,
): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readString(),
        parcel.readString()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeValue(photo)
        parcel.writeString(name)
        parcel.writeString(detail)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<kueDataParcelable> {
        override fun createFromParcel(parcel: Parcel): kueDataParcelable {
            return kueDataParcelable(parcel)
        }

        override fun newArray(size: Int): Array<kueDataParcelable?> {
            return arrayOfNulls(size)
        }
    }
}