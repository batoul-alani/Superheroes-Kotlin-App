package com.example.superheroes.model

import com.example.superheroes.R

object HeroesRepository {
    val heroes  = listOf<Hero>(
        Hero(
            title = R.string.hero1,
            description = R.string.description1,
            image = R.drawable.android_superhero1
        ),
        Hero(
            title = R.string.hero2,
            description = R.string.description2,
            image = R.drawable.android_superhero2
        ),
        Hero(
            title = R.string.hero3,
            description = R.string.description3,
            image = R.drawable.android_superhero3
        ),
        Hero(
            title = R.string.hero4,
            description = R.string.description4,
            image = R.drawable.android_superhero4
        ),
        Hero(
            title = R.string.hero5,
            description = R.string.description5,
            image = R.drawable.android_superhero5
        ),
        Hero(
            title = R.string.hero6,
            description = R.string.description6,
            image = R.drawable.android_superhero6
        )
    )
}