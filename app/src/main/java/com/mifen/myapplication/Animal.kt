package com.mifen.myapplication

import android.os.Parcel
import android.os.Parcelable

open class Animal(
    val amount: Int
) : Parcelable {
    constructor(parcel: Parcel) : this(parcel.readInt()) {
    }

    fun printAnimai(): Int=2
    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(amount)
    }

    override fun describeContents(): Int {
        return 0
    }
    companion object CREATOR : Parcelable.Creator<Animal> {
        override fun createFromParcel(parcel: Parcel): Animal {
            return Animal(parcel)
        }
        override fun newArray(size: Int): Array<Animal?> {
            return arrayOfNulls(size)
        }
    }
}