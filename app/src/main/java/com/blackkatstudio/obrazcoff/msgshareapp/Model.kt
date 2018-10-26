package com.blackkatstudio.obrazcoff.msgshareapp

data class Hobby(var title: String)

object Supplier {
    val hobbies = listOf<Hobby>(
            Hobby("Swimming"),
            Hobby("Reading"),
            Hobby("Walking"),
            Hobby("Sleeping"),
            Hobby("Programming"),
            Hobby("Playing")

    )
}