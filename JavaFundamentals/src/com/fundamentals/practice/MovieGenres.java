package com.fundamentals.practice;

public enum MovieGenres {
    COMEDY("PG-13"), DRAMA("TV-14"), SUSPENSE("TV-17"), SCIFI("PG"), ACTION("TV-16"), HORROR("R");

    private final String rating;

    private MovieGenres(String rating) {
        this.rating = rating;
    }

    public String getRating() {
        return rating;
    }
}
