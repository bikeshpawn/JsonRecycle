package com.example.bks.recyclejason;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Bks on 4/4/2017.
 */


public class MovieListingAdapter extends RecyclerView.Adapter<MovieListingAdapter.MovieViewHolder>{

    private ArrayList<MovieListingDetail> movieListingDetailArrayList;// data store garna array banaako

    public MovieListingAdapter(ArrayList<MovieListingDetail> movieListingDetailArrayList) {
        this.movieListingDetailArrayList = movieListingDetailArrayList;
        //movielistingdetailarraylist maa bhayeko value haru sabai yesma pass gara bhaneko..
    }



    public class MovieViewHolder extends RecyclerView.ViewHolder{
        public ImageView img_movie;
        public TextView movie_name;

        public MovieViewHolder(View itemView) {
            super(itemView);

                img_movie = (ImageView) itemView.findViewById(R.id.movie_poster);
                movie_name = (TextView) itemView.findViewById(R.id.movie_name);

        }
    }
    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()). inflate(R.layout.movie_listing, parent, false);
        MovieViewHolder rvh = new MovieViewHolder(layoutView);
        return rvh;
    }

    @Override
    //oncreateviewholder maa pass data pass garnay kaam garcha
    public void onBindViewHolder(MovieViewHolder holder, int position) {
        holder.movie_name.setText(movieListingDetailArrayList.get(position).getMovieName());
        holder.img_movie.setImageResource(movieListingDetailArrayList.get(position).getMoviePosterPath());
    }


    @Override
    public int getItemCount() {
        return movieListingDetailArrayList.size();
    }
}

