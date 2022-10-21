package org.test.movies.model;

public class MovieTheatre {

 String movieName;
 String movieStartTime;
 String movieEndTime;
 double movieTicketPrice;
	public MovieTheatre() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MovieTheatre(String movieName, String movieStartTime, String movieEndTime, double movieTicketPrice) {
		super();
		this.movieName = movieName;
		this.movieStartTime = movieStartTime;
		this.movieEndTime = movieEndTime;
		this.movieTicketPrice = movieTicketPrice;
	}
	@Override
	public String toString() {
		return "MovieTheatre [movieName=" + movieName + ", movieStartTime=" + movieStartTime + ", movieEndTime="
				+ movieEndTime + ", movieTicketPrice=" + movieTicketPrice + "]";
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieStartTime() {
		return movieStartTime;
	}
	public void setMovieStartTime(String movieStartTime) {
		this.movieStartTime = movieStartTime;
	}
	public String getMovieEndTime() {
		return movieEndTime;
	}
	public void setMovieEndTime(String movieEndTime) {
		this.movieEndTime = movieEndTime;
	}
	public double getMovieTicketPrice() {
		return movieTicketPrice;
	}
	public void setMovieTicketPrice(double movieTicketPrice) {
		this.movieTicketPrice = movieTicketPrice;
	}
	
	
}
