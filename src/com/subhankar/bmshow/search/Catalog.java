package com.subhankar.bmshow.search;

import com.subhankar.bmshow.movie.Movie;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Catalog implements Search {
    HashMap<String, List<Movie>> movieTitles;
    HashMap<String, List<Movie>> movieLanguages;
    HashMap<String, List<Movie>> movieGenres;
    HashMap<Date, List<Movie>> movieReleaseDates;
    HashMap<String, List<Movie>> movieCities;

    public List<Movie> searchByTitle(String title) {
        return movieTitles.get(title);
    }

    public List<Movie> searchByLanguage(String language) {
        return movieLanguages.get(language);
    }

    //...

    public List<Movie> searchByCity(String cityName) {
        return movieCities.get(cityName);
    }

    @Override
    public List<Movie> searchByGenre(String genre) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Movie> searchByReleaseDate(Date releaseDate) {
        // TODO Auto-generated method stub
        return null;
    }
}
