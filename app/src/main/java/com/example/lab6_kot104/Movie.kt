package com.example.lab6_kot104

data class Movie(
    val title: String,
    val year: String,
    val posterUrl: String
) {
    companion object {
        fun getSampleMovies() = listOf(
            Movie("Movie 1", "2023", "https://images2.thanhnien.vn/528068263637045248/2024/2/20/special-poster-2-mai-17084211313531000860296.jpg"),
            Movie("Movie 2", "2022", "https://thanhnien.mediacdn.vn/uploaded/ngocthanh/2020_12_10/da-04_PBWC.jpg?width=500")
        )
    }
}