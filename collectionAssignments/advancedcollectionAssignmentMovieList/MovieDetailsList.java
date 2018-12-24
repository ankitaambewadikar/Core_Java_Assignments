package com.advancedcollectionAssignmentMovieList;

import java.util.ArrayList;

public class MovieDetailsList {

	 private ArrayList<MovieDetails> list = new  ArrayList<MovieDetails>();

	public ArrayList<MovieDetails> addMovie(MovieDetails movieOne) 
	{
		list.add(movieOne);
		return list;
		
	}

	@Override
	public String toString() {
		return "MovieDetailsList [list=" + list + "]";
	}

	public void removeMovie(MovieDetails movieOne) 
	{
		 list.remove(movieOne);
		
	}

	public MovieDetails findMovieByMovieName(String findMovieByName) {
		
		for(MovieDetails details : list)
		{
			if(details.getMovieName().matches(findMovieByName))
			{
				return details;
			}
		}
		return null;
		
	}

	public MovieDetails findMovieDetailsByGenre(String stringGenre) {

		for(MovieDetails byGenreDetails : list){
			if(byGenreDetails.getMovieGenre().matches(stringGenre)){
				System.out.println("hii");
				list.add(byGenreDetails);
				return byGenreDetails;
			}
		}
		return null;
		
	}



}
