package com.advancedcollectionAssignmentMovieList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 * 
 * @author aambewad
 *
 */
public class MovieDetailsList implements Comparable<MovieDetailsList>{

	private ArrayList<MovieDetails> list = new ArrayList<MovieDetails>();
/**
 * 
 * @param movieOne
 * @return
 * here the movies are added one by one to arraylist 
 */
	public boolean addMovie(MovieDetails movieOne) {
		return list.add(movieOne);
		}

	@Override
	public String toString() {
		return "MovieDetailsList [list=" + list + "]";
	}
/**
 * 
 * @param movieOne
 * @return
 * in this method one movie is removed from list
 */
	public boolean removeMovie(MovieDetails movieOne) {
		return list.remove(movieOne);

	}
/**
 * 
 * @param findMovieByName
 * @return
 * In this method Find movie details by movie Name
 */
	public MovieDetails findMovieByMovieName(String findMovieByName) {

		for (MovieDetails details : list) {
			if (details.getMovieName().matches(findMovieByName)) {
				return details;
			}
		}
		return null;

	}
/**
 * 
 * @param stringGenre
 * @return
 * In method movie deatis are found by movie Genre
 */
	public MovieDetails findMovieDetailsByGenre(String stringGenre) {

		for (MovieDetails byGenreDetails : list) {
			if (byGenreDetails.getMovieGenre().matches(stringGenre)) {
				list.add(byGenreDetails);
				return byGenreDetails;
			}
		}
		return null;

	}
	/*@Override
	public int compareTo(MovieDetails objectMovie) {

		MovieDetails details = (MovieDetails)objectMovie;
		return this.movieName.compareTo(objectMovie.getMovieName()) ;
	}*/

	public void removeAllMovies() {
		list.clear();
	}


	@Override
	public int compareTo(MovieDetailsList movieObject) {
		
		return 0;
	}

	public void sortByArgumentsPassed(String sortValue) {
		
		switch (sortValue) {
		case "ByMovieName":
					Collections.sort(list, new MovieDetailsChainingComparator(new MovieNameComparator()));
			break;
		case "ByMovieGenre":
					Collections.sort(list, new MovieDetailsChainingComparator(new MovieByGenre()));
					break;
		case "ByLeadActor":
					Collections.sort(list, new MovieDetailsChainingComparator(new MovieByLeadActor()));
					break;
					
		case "ByLeadActress":
					Collections.sort(list,new MovieDetailsChainingComparator(new MovieByLeadActress()));
		default:
			break;
		}
		
	}

}
