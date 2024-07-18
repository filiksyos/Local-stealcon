package com.example.localstealcon.Room

import androidx.room.*
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Entity(tableName = "Victims")
@Parcelize
data class VictimEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    @ColumnInfo(name = "VictimName")
    val victimName: String,
    // Add other properties as needed, e.g.,
    // @ColumnInfo(name = "email")val email: String?
    // @ColumnInfo(name = "phone") val phoneNumber: String?
): Parcelable
