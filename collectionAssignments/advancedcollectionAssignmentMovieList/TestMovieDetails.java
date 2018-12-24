package com.advancedcollectionAssignmentMovieList;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

public class TestMovieDetails {

	private MovieDetails movieOne;
	private MovieDetails movieTwo;
	private MovieDetails movieThree;
	private MovieDetails movieFour;
	private MovieDetails movieFive;
	private MovieDetailsList movieList;

	@Before
	public void setup(){
		movieList = new MovieDetailsList();
		movieOne = new MovieDetails("Dangal", "Amir Khan", "Fatima khan", "Drama-Sport");
		movieTwo = new MovieDetails("Andhadun", "Ayushmaan", "Tabu", "Crime");
		movieThree = new  MovieDetails("Sultan", "salman Khan", "Anushka Sharam", "Drama-Sport");
		movieFour = new  MovieDetails("Twilight", "Robert Pattinson", "Kristen Stewart", "thriller");
		movieFive = new  MovieDetails("Twilight", "Robert Pattinson", "Kristen Stewart", "Drama-Sport");

	}

	@Test
	public void testForAddMovieToList() {

		/*List<MovieDetails> expectedmovieList = new ArrayList<>();
		
		expectedmovieList.add(new MovieDetails("Dangal", "Amir Khan", "Fatima khan","Drama-Sport"));
		expectedmovieList.add(new MovieDetails("Andhadun", "Ayushmaan", "Tabu", "Crime")); 
		expectedmovieList.add(new MovieDetails("Sultan", "salman Khan", "Anushka Sharam", "Drama-Sport"));
		expectedmovieList.add(new MovieDetails("Twilight","Robert Pattinson", "Kristen Stewart", "thriller"));
		 */
		ArrayList<MovieDetails> list = new  ArrayList<MovieDetails>();
		movieList.addMovie(movieOne);
		movieList.addMovie(movieTwo);
		movieList.addMovie(movieThree);
		movieList.addMovie(movieFour);
		movieList.addMovie(movieFive);
		System.out.println(movieList);
		movieList.removeMovie(movieOne);

		MovieDetails temp = null;
		temp =movieList.findMovieByMovieName("Andhadun");
		System.out.println(temp);
		MovieDetails tempGenre = movieList.findMovieDetailsByGenre("Drama-Sport");
		System.out.println(tempGenre);
		//System.out.println(movieList);
		//assertEquals(true,moviePresent);
	}

}
