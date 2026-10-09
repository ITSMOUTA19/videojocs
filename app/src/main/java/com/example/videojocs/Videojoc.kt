package com.example.videojocs

data class Videojoc( // creamos data class de Videojoc
    val nom: String,
    val genere: String,
    val plataforma: String,
    val any: Int,
    val puntuacio: Double,
    val preu: Double,
)

val videojocs = listOf( // creamos la lista de videojuegos gg
    Videojoc(
        nom = "GTA V",
        genere = "Acció",
        plataforma = "PC",
        any = 2013,
        preu = 29.99,
        puntuacio = 9.5
    ),

    Videojoc(
        nom = "Minecraft",
        genere = "Sandbox",
        plataforma = "PC",
        any = 2011,
        preu = 19.99,
        puntuacio = 9.0
    ),

    Videojoc(
        nom = "FIFA 25",
        genere = "Esports",
        plataforma = "PS5",
        any = 2024,
        preu = 69.99,
        puntuacio = 8.5
    ),

    Videojoc(
        nom = "Red Dead Redemption 2",
        genere = "Acció",
        plataforma = "PC",
        any = 2018,
        preu = 59.99,
        puntuacio = 9.8
    ),

    Videojoc(
        nom = "Fortnite",
        genere = "Battle Royale",
        plataforma = "PC",
        any = 2017,
        preu = 0.0,
        puntuacio = 8.8
    ),

    Videojoc(
        nom = "Call of Duty",
        genere = "Shooter",
        plataforma = "PS5",
        any = 2024,
        preu = 69.99,
        puntuacio = 8.7
    ),

    Videojoc(
        nom = "The Last of Us",
        genere = "Acció",
        plataforma = "PS5",
        any = 2022,
        preu = 49.99,
        puntuacio = 9.6
    ),

    Videojoc(
        nom = "God of War",
        genere = "Acció",
        plataforma = "PS5",
        any = 2018,
        preu = 39.99,
        puntuacio = 9.7
    ),

    Videojoc(
        nom = "Forza Horizon 5",
        genere = "Carreres",
        plataforma = "Xbox",
        any = 2021,
        preu = 59.99,
        puntuacio = 9.2
    ),

    Videojoc(
        nom = "Rocket League",
        genere = "Esports",
        plataforma = "PC",
        any = 2015,
        preu = 0.0,
        puntuacio = 8.9
    ),

    Videojoc(
        nom = "Cyberpunk 2077",
        genere = "RPG",
        plataforma = "PC",
        any = 2020,
        preu = 49.99,
        puntuacio = 8.6
    ),

    Videojoc(
        nom = "Elden Ring",
        genere = "RPG",
        plataforma = "PS5",
        any = 2022,
        preu = 59.99,
        puntuacio = 9.7
    ),

    Videojoc(
        nom = "Resident Evil 4",
        genere = "Terror",
        plataforma = "PS5",
        any = 2023,
        preu = 49.99,
        puntuacio = 9.4
    ),

    Videojoc(
        nom = "Gran Turismo 7",
        genere = "Carreres",
        plataforma = "PS5",
        any = 2022,
        preu = 69.99,
        puntuacio = 9.0
    ),

    Videojoc(
        nom = "Valorant",
        genere = "Shooter",
        plataforma = "PC",
        any = 2020,
        preu = 0.0,
        puntuacio = 8.7
    ),

    Videojoc(
        nom = "League of Legends",
        genere = "MOBA",
        plataforma = "PC",
        any = 2009,
        preu = 0.0,
        puntuacio = 9.1
    ),

    Videojoc(
        nom = "Hogwarts Legacy",
        genere = "RPG",
        plataforma = "PS5",
        any = 2023,
        preu = 59.99,
        puntuacio = 8.9
    ),

    Videojoc(
        nom = "Assassin's Creed Valhalla",
        genere = "Acció",
        plataforma = "PC",
        any = 2020,
        preu = 39.99,
        puntuacio = 8.5
    ),

    Videojoc(
        nom = "Mario Kart 8",
        genere = "Carreres",
        plataforma = "Switch",
        any = 2014,
        preu = 49.99,
        puntuacio = 9.3
    ),

    Videojoc(
        nom = "Pokémon Scarlet",
        genere = "RPG",
        plataforma = "Switch",
        any = 2022,
        preu = 59.99,
        puntuacio = 8.2
    )
)