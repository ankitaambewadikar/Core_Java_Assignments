package com.advancedcollectionAssignmentMovieList;

import java.util.Comparator;

public class MovieByGenre implements Comparator<MovieDetails> {

	@Override
	public int compare(MovieDetails genreObjectOne, MovieDetails genreObjectTwo) {
		
		return genreObjectOne.getMovieGenre().compareTo(genreObjectTwo.getMovieGenre());
	}

}
