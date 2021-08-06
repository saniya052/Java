import java.util.*;

public class Movies  {
	//implements Comparable<Movies>
	private int movieId;
	private String movieNAme;
	private String leadActor;
	private double budget;
 
public Movies(int movieId, String movieNAme, String leadActor, double budget) {
	super();
	this.movieId = movieId;
	this.movieNAme = movieNAme;
	this.leadActor = leadActor;
	this.budget = budget;
}


public int getMovieId() {
	return movieId;
}
public void setMovieId(int movieId) {
	this.movieId = movieId;
}
public String getMovieNAme() {
	return movieNAme;
}
public void setMovieNAme(String movieNAme) {
	this.movieNAme = movieNAme;
}
public String getLeadActor() {
	return leadActor;
}
public void setLeadActor(String leadActor) {
	this.leadActor = leadActor;
}
public double getBudget() {
	return budget;
}
public void setBudget(double budget) {
	this.budget = budget;
}


/*
@Override
public int compareTo(Movies o1) {
	return (int) (o1.getBudget()-this.getBudget());
}
*/
@Override
public String toString() {
	return "Movies [movieId=" + movieId + ", movieNAme=" + movieNAme + ", leadActor=" + leadActor + ", budget=" + budget
			+ "]";
}
 


 
}
