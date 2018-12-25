package com.advancedcollectionAssignmentMovieList;

import java.util.Comparator;

public class MovieByLeadActress implements Comparator<MovieDetails> {

	@Override
	public int compare(MovieDetails leadActressObjectOne, MovieDetails leadActressObjectTwo) {
		
		return leadActressObjectOne.getLeadActress().compareTo(leadActressObjectTwo.getLeadActress()) ;
	}

}
