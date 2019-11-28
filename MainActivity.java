package com.example.film;


import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[] movies;
    boolean [] shownMovies;
    TextView tvTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTitle = (TextView) findViewById(R.id.title);
        // загружаем ресурсы
        Resources r = getResources();

        movies = r.getStringArray(R.array.movies);
        shownMovies = new boolean[movies.length];

    }

    public void nextClick(View v) {
        do {
            int k = (int) (Math.random() * movies.length);
            int viwed[] = new int[movies.length];
            viwed[k] += 1;
            TextView out = findViewById(R.id.title);
            if (viwed[k] > 1)
                out.setText(movies[k]);
            else
                continue;
        }while (false);
        // если фильмы закончились, выдать сообщение об этом
        // например, с помощью toast
        // http://developer.alexanderklimov.ru/android/toast.php
    }

    public void resetClick(View v) {
        // очистить shownFilms или создать заново массив
    }
}
