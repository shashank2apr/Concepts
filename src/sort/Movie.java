package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Movie implements Comparable<Movie> {
	private String name;
	private float rating;
	private int year;
	
	public Movie(String name,float rating, int year){
		this.name = name;
		this.rating=rating;
		this.year=year;
	}
	
	public String getName(){
		return this.name;
	}

	public int getYear(){
		return this.year;
	}
	
	public float getRating(){
		return rating;
	}
	
	@Override
	public int compareTo(Movie movie){
		if(this.year > movie.year)
			return 1;
		else if(this.year < movie.year)
			return -1;
		else
			return 0;
	}
	
	@Override
	public String toString(){
		return "["+ "year = " + year + ", rating = " + rating + ", Name = " + name + "]";
	}
	
	public static void main(String[] args) {
		
		List<Movie> list = new ArrayList<Movie>();
		
		list.add(new Movie("Bourne Identity", 8.1f, 2002));
		list.add(new Movie("Bourne Legacy", 6.5f, 2012));
		list.add(new Movie("Bourne Ultimatum", 7.6f, 2007));
		list.add(new Movie("Bourne Supremacy", 8.5f, 2004));
		
		System.out.println(list);
		
		//Collections.sort(list,new NameComparator());
		
		//Java 8
		Collections.sort(list,Comparator.comparing(Movie::getName));
		
		System.out.println(list);
		
		
	}
	
}

class RatingComparator implements Comparator<Movie>{
	
	@Override
	public int compare(Movie m1, Movie m2){
		if(m1.getRating() > m2.getRating()){
			return 1;
		} else if(m1.getRating() < m2.getRating()){
			return -1;
		} else{
			return 0;
		}
	}	
}

class NameComparator implements Comparator<Movie>{
		
		@Override
		public int compare(Movie m1, Movie m2){
			return m1.getName().compareTo(m2.getName());
			}

}
