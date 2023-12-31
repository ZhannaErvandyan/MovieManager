package ru.netology;

public class MovieManager {
    private String[] films = new String[0];
    private int limit;

    public MovieManager() {
        this.limit = 10;
    }

    public void MovieManager(int limit) {
        this.limit = limit;
    }

    public void addFilm(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findall() {
        return films;
    }

    public String[] findlast() {
        int resultlength;
        if (films.length < limit) {
            resultlength = films.length;
        } else {
            resultlength = limit;
        }
        String[] tmp = new String[resultlength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];

        }
        return tmp;
    }
}

