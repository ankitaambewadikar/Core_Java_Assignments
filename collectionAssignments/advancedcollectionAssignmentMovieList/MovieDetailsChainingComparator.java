package com.advancedcollectionAssignmentMovieList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MovieDetailsChainingComparator implements Comparator<MovieDetails> {

	private List<Comparator<MovieDetails>> listComparators;
	
	@SafeVarargs
	public MovieDetailsChainingComparator(Comparator<MovieDetails>... comparators) {
        this.listComparators = Arrays.asList(comparators);
    }
	
	@Override
	public int compare(MovieDetails movieobjectOne, MovieDetails movieobjectTwo) {
	       for (Comparator<MovieDetails> comparator : listComparators) {
	            int result = comparator.compare(movieobjectOne, movieobjectTwo);
	            if (result != 0) {
	                return result;
	            }
	        }
	        return 0;
	}

}
