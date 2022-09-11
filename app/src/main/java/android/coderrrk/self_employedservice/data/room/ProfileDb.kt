package android.coderrrk.somenotes.data.sqlite

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "profile_table")
data class ProfileDb(
    @PrimaryKey
    @ColumnInfo(name = "surnameProfile") var surnameProfile: String,
    @ColumnInfo(name = "nameProfile") var nameProfile: String,
    @ColumnInfo(name = "patronymicProfile") var patronymicProfile: String,
    @ColumnInfo(name = "emailProfile") var emailProfile: String,
    @ColumnInfo(name = "phoneProfile") var phoneProfile: String,
    @ColumnInfo(name = "innProfile") var innProfile: String

    )

