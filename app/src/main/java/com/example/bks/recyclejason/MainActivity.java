package com.example.bks.recyclejason;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv_view=(RecyclerView)findViewById(R.id.recycle_view);

        //For Linear layout
        /*LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this); // it says recycle view to be Linear List
        rv_view.setLayoutManager(linearLayoutManager)*/;
//For Grid Layout
GridLayoutManager gridLayoutManager =  new GridLayoutManager(this, 2);
rv_view.setLayoutManager(gridLayoutManager);

// For staggedred grid layout
/*
StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.HORIZONTAL);
rv_view.setLayoutManager(staggeredGridLayoutManager);
*/

        rv_view.setAdapter(new MovieListingAdapter(getMovieList()));//error in getMovieList and alt+enter we get below

    }

    private ArrayList<MovieListingDetail> getMovieList() {
        ArrayList<MovieListingDetail> movieList = new ArrayList<>();// creating new custom arraylist
        movieList.add(new MovieListingDetail("Villian", R.drawable.b));
        movieList.add(new MovieListingDetail("Hero", R.drawable.c));
        movieList.add(new MovieListingDetail("Ball", R.drawable.j));
        movieList.add(new MovieListingDetail("AAndrond", R.drawable.k));
        movieList.add(new MovieListingDetail("Lucky", R.drawable.l));
        movieList.add(new MovieListingDetail("Terminator", R.drawable.m));

        return movieList;

    }


}


