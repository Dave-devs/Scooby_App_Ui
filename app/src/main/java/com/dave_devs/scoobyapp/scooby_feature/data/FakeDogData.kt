package com.dave_devs.scoobyapp.scooby_feature.data

import com.dave_devs.scoobyapp.R
import com.dave_devs.scoobyapp.scooby_feature.domain.model.Dog
import com.dave_devs.scoobyapp.scooby_feature.domain.model.Vet

object FakeDogData {
    private val vet = Vet("Dave_devs", "UI/UX Designer/Developer", R.drawable.dave_devs)
    val dogList = listOf(
        Dog(
            id = 0,
            name = "Charlie",
            gender = "Male",
            color = "White|Black|Brown",
            breed = "Pug",
            weight = 9.8,
            age = "2.3yrs",
            data = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc nec nisi in enim eleifend dapibus ut non nibh. Morbi quis convallis arcu, fringilla tempor sem.",
            image = R.drawable.dog0,
            location = "250m away",
            vet = vet
        ),
        Dog(
            id = 1,
            name = "Nadia",
            gender = "Female",
            color = "Black",
            breed = "Coated Retriever",
            weight = 9.8,
            age = "2.3yrs",
            data = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc nec nisi in enim eleifend dapibus ut non nibh. Morbi quis convallis arcu, fringilla tempor sem.",
            image = R.drawable.dog1,
            location = "250m away",
            vet = vet
        ),
        Dog(
            id = 2,
            name = "Monet",
            gender = "Male",
            color = "Brown",
            breed = "Appenzeller",
            weight = 9.8,
            age = "2.3yrs",
            data = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc nec nisi in enim eleifend dapibus ut non nibh. Morbi quis convallis arcu, fringilla tempor sem.",
            image = R.drawable.dog2,
            location = "250m away",
            vet = vet
        ),
        Dog(
            id = 3,
            name = "Feret",
            gender = "Female",
            color = "Black|Cream",
            breed = "Dandie",
            weight = 9.8,
            age = "2.3yrs",
            data = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc nec nisi in enim eleifend dapibus ut non nibh. Morbi quis convallis arcu, fringilla tempor sem.",
            image = R.drawable.dog3,
            location = "250m away",
            vet = vet
        ),
        Dog(
            id = 4,
            name = "Spiky",
            gender = "Male",
            color = "White|Black|Brown",
            breed = "Danish Dog",
            weight = 9.8,
            age = "2.3yrs",
            data = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc nec nisi in enim eleifend dapibus ut non nibh. Morbi quis convallis arcu, fringilla tempor sem.",
            image = R.drawable.dog4,
            location = "250m away",
            vet = vet
        ),
        Dog(
            id = 5,
            name = "Jenny",
            gender = "Female",
            color = "White|Brown",
            breed = "Bernese",
            weight = 9.8,
            age = "2.3yrs",
            data = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc nec nisi in enim eleifend dapibus ut non nibh. Morbi quis convallis arcu, fringilla tempor sem.",
            image = R.drawable.dog5,
            location = "250m away",
            vet = vet
        ),
        Dog(
            id = 6,
            name = "Axel",
            gender = "Male",
            color = "White|Brown",
            breed = "Foxhound",
            weight = 9.8,
            age = "2.3yrs",
            data = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc nec nisi in enim eleifend dapibus ut non nibh. Morbi quis convallis arcu, fringilla tempor sem.",
            image = R.drawable.dog6,
            location = "250m away",
            vet = vet
        ),
        Dog(
            id = 7,
            name = "Banshee",
            gender = "Female",
            color = "White|Brown",
            breed = "Dachshund",
            weight = 9.8,
            age = "2.3yrs",
            data = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc nec nisi in enim eleifend dapibus ut non nibh. Morbi quis convallis arcu, fringilla tempor sem.",
            image = R.drawable.dog7,
            location = "250m away",
            vet = vet
        ),
        Dog(
            id = 8,
            name = "Xander",
            gender = "Male",
            color = "White",
            breed = "Klee Kai",
            weight = 9.8,
            age = "2.3yrs",
            data = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc nec nisi in enim eleifend dapibus ut non nibh. Morbi quis convallis arcu, fringilla tempor sem.",
            image = R.drawable.dog8,
            location = "250m away",
            vet = vet
        ),
        Dog(
            id = 9,
            name = "Opal",
            gender = "Female",
            color = "Brown",
            breed = "Golden Retriever",
            weight = 9.8,
            age = "2.3yrs",
            data = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc nec nisi in enim eleifend dapibus ut non nibh. Morbi quis convallis arcu, fringilla tempor sem.",
            image = R.drawable.dog9,
            location = "250m away",
            vet = vet
        )
    )
}