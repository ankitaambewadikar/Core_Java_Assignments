package com.advancedcollectionAssignmentMovieList;

import java.util.Comparator;

public class MovieByLeadActor implements Comparator<MovieDetails> {

	@Override
	public int compare(MovieDetails leadActorObjectOne, MovieDetails leadActorObjectTwo) {
		
		return leadActorObjectOne.getLeadActor().compareTo(leadActorObjectTwo.getLeadActor()) ;
	}

}
