package com.example.assignment2.utils;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class ApiClient {
    private static final OkHttpClient client = new OkHttpClient();
    private static final String API_KEY = "39ceac9";
    private static final String BASE_URL = "https://www.omdbapi.com/?apikey=" + API_KEY;

    public static void getMovies(String query, Callback callback) {
        String url = BASE_URL + "&s=" + query;
        Request request = new Request.Builder().url(url).build();
        client.newCall(request).enqueue(callback);
    }

    public static void getMovieDetails(String imdbId, Callback callback) {
        String url = BASE_URL + "&i=" + imdbId;
        Request request = new Request.Builder().url(url).build();
        client.newCall(request).enqueue(callback);
    }
}
