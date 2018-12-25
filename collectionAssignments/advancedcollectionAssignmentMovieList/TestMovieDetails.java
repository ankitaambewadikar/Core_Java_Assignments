package com.advancedcollectionAssignmentMovieList;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

import com.advancedcollectionAssignmentSavingAccount.SavingAccount;
/**
 * 
 * @author aambewad
 *
 */
public class TestMovieDetails {

	private MovieDetails movieOne;
	private MovieDetails movieTwo;
	private MovieDetails movieThree;
	private MovieDetails movieFour;
	private MovieDetails movieFive;
	private MovieDetails movieSix;
	private MovieDetailsList movieList;
	
	
/**
 * 
 */
	@Before
	public void setup() {
		movieList = new MovieDetailsList();
		movieOne = new MovieDetails("Dangal", "Amir Khan", "Fatima khan","Drama-Sport");
		movieTwo = new MovieDetails("Andhadun", "Ayushmaan", "Tabu", "Crime");
		movieThree = new MovieDetails("Sultan", "salman Khan","Anushka Sharam", "Drama-Sport");
		movieFour = new MovieDetails("Twilight", "Robert Pattinson","Kristen Stewart", "thriller");
		movieFive = new MovieDetails("Twilight", "Robert Pattinson","Kristen Stewart", "Drama-Sport");
		movieSix = new MovieDetails("3Idoits", "Amir Khan","Kareena", "Comedy");
		movieList.addMovie(movieOne);
		movieList.addMovie(movieTwo);
		movieList.addMovie(movieThree);
		movieList.addMovie(movieFour);
		movieList.addMovie(movieFive);
		movieList.addMovie(movieSix);
	}

	@Test
	public void testForAddMovieToList() {

		ArrayList<MovieDetails> list = new ArrayList<MovieDetails>();
		boolean movieAdded = movieList.addMovie(movieOne);
		assertEquals(true, movieAdded);
	}

	@Test
	public void testForRemoveMovieByMovieName() {
		boolean removedMovie = movieList.removeMovie(movieOne);
		assertEquals(true, removedMovie);

	}

	@Test
	public void testForFindMovieDetailsByMovieName() {
		
		MovieDetails temp = movieList.findMovieByMovieName("Andhadun");
		//System.out.println(temp);
		// assertEquals("MovieDetails [movieName=Andhadun, leadActor=Ayushmaan, leadActress=Tabu, movieGenre=Crime]",temp);

	}

	@Test
	public void testForFindMovieByGenre() {

		MovieDetails tempGenre = movieList.findMovieDetailsByGenre("Drama-Sport");
		//System.out.println(tempGenre);
	}

	@Test
	public void testForRemoveAllMovies() {

		movieList.removeAllMovies();
		//System.out.println(movieList);
		}
	@Test
	public void testForSortOnGivenArgumentByMovieName(){
		
		movieList.sortByArgumentsPassed("ByMovieName");
		//System.out.println(movieList.toString());
		
	}
	@Test
	public void testForSortOnGivenArgumentByGenre(){
		
		movieList.sortByArgumentsPassed("ByMovieGenre");
		//System.out.println(movieList.toString());
	}
	@Test
	public void testForSortOnGivenArgumentByLeadActor(){
		
		movieList.sortByArgumentsPassed("ByLeadActor");
		//System.out.println(movieList.toString());
	}
	@Test
	public void testForSortOnGivenArgumentByLeadActress(){
		
		movieList.sortByArgumentsPassed("ByLeadActress");
		//System.out.println(movieList.toString());
	}
	

}
