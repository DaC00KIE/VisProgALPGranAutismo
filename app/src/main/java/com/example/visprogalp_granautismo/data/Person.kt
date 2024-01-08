package com.example.visprogalp_granautismo.data
import android.os.Parcelable
import androidx.annotation.DrawableRes
import com.example.visprogalp_granautismo.R
import kotlinx.parcelize.Parcelize
@Parcelize
data class Person(
    val id: Int = 0,
    val name: String = "",
@DrawableRes val icon: Int = R.drawable.arya_stark
) : Parcelable

val personList = listOf(
    Person(
        1,
        "AryaStark",
        R.drawable.arya_stark
    ),
    Person(
        2,
        "BranStark",
        R.drawable.bran_stark
    ),
    Person(
        3,
        "Daenarys_T",
        R.drawable.daenerys_targaryen
    ),
    Person(
        4,
        "JonSnow",
        R.drawable.jon_snow
    ),
    Person(
        5,
        "RobStark",
        R.drawable.rob_stark
    ),
    Person(
        6,
        "SansaStark",
        R.drawable.sansa_stark
    ),
    Person(
        7,
        "Tyrian_L",
        R.drawable.tyrian_lannister
    ),
    Person(
        8,
        "JorahMormont",
        R.drawable.jorah_mormont
    ),
    Person(
        9,
        "NedStark",
        R.drawable.nedstark
    ),
    Person(
        10,
        "Jaime_L",
        R.drawable.jaimelanniste
    ),
)