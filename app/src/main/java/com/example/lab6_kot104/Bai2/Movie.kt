package com.example.lab6_kot104.Bai2

data class Movie(
    val title: String,
    val year: String,
    val posterUrl: String,
    val duration: String,
    val releaseDate: String,
    val genre: String,
    val shotDescription: String
) {
    companion object {
        fun getSampleMovies() = listOf(
            Movie(
                "Movie 1",
                "2023",
                "https://images2.thanhnien.vn/528068263637045248/2024/2/20/special-poster-2-mai-17084211313531000860296.jpg",
                "120 phút",
                "2023-05-01",
                "Hành động, Khoa học viễn tưởng",
                "Tóm tắt nội dung phim Movie 1..."
            ),
            Movie(
                "Movie 2",
                "2022",
                "https://thanhnien.mediacdn.vn/uploaded/ngocthanh/2020_12_10/da-04_PBWC.jpg?width=500",
                "90 phút",
                "2022-08-15",
                "Hài, Tâm lý",
                "Tóm tắt nội dung phim Movie 2..."
            ),
            Movie(
                "Movie 3",
                "2024",
                "https://thanhnien.mediacdn.vn/uploaded/ngocthanh/2020_12_10/da-06_RPDB.jpg?width=500",
                "240 phút",
                "2024-03-20",
                "Hành động, Khoa học viễn tưởng",
                "Tóm tắt nội dung phim Movie 3..."
            ),
            Movie(
                "Movie 4",
                "2013",
                "https://upload.wikimedia.org/wikipedia/vi/thumb/4/4f/Ng%C6%B0%E1%BB%9Di_%C4%91%E1%BA%B9p_v%C3%A0_qu%C3%A1i_v%E1%BA%ADt_poster.jpg/220px-Ng%C6%B0%E1%BB%9Di_%C4%91%E1%BA%B9p_v%C3%A0_qu%C3%A1i_v%E1%BA%ADt_poster.jpg",
                "240 phút",
                "2015-04-14",
                "Hành động, Khoa học viễn tưởng",
                "Tóm tắt nội dung phim Movie 4..."
            ),
            Movie(
                "Movie 5",
                "2016",
                "https://gaumedia.vn/wp-content/uploads/2021/06/5-buoc-thiet-ke-poster-phim-5.png",
                "240 phút",
                "2018-06-25",
                "Hành động, Khoa học viễn tưởng",
                "Tóm tắt nội dung phim Movie 5..."
            ),
        )
    }
}