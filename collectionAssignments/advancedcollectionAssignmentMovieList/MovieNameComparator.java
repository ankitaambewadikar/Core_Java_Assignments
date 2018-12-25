package com.advancedcollectionAssignmentMovieList;

import java.util.Comparator;

public class MovieNameComparator implements Comparator<MovieDetails> {

	@Override
	public int compare(MovieDetails movieObjectOne, MovieDetails movieObjectTwo) {
		
		return movieObjectOne.getMovieName().compareTo(movieObjectTwo.getMovieName());
	}

}
