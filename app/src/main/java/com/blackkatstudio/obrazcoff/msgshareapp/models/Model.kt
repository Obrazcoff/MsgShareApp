package com.blackkatstudio.obrazcoff.msgshareapp.models

data class Hobby(var title: String)

object Supplier {
    val hobbies = listOf(
            Hobby("Swimming"),
            Hobby("Reading"),
            Hobby("Walking"),
            Hobby("Sleeping"),
            Hobby("Programming"),
            Hobby("Playing")

    )
}