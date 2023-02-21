package com.dave_devs.scoobyapp.scooby_feature.domain.model

data class Dog(
    val id: Int,
    val name: String,
    val gender: String,
    val color: String,
    val breed: String,
    val weight: Double,
    val age: String,
    val data: String,
    val image: Int,
    val location: String,
    val vet: Vet
)