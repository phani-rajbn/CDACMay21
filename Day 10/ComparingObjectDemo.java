import java.util.*;

/*
 * Comparable vs. Comparator
 * U need to compare to objects when U want to place them one behind the other like sorting or any conditional placements.
 * If U want an object to be sorted on one condition, U can have UR class implement an interface called Comparable 
 * If U want Ur objects to be compared on multiple criteria or different members then U should create a new class whose job is to compare UR objects
 * TODO: Iterable vs. Iterator. Custom Collections use these interfaces 
 * */
enum Criteria{ Rating, Title, Director }//User defined type to store const values:
class MovieComparer implements Comparator<Movie>{

	private Criteria condition;
	
	public MovieComparer(Criteria condition) {
		this.condition = condition;
	}
	@Override
	public int compare(Movie m1, Movie m2) {
		switch(condition) {
		case Rating:
			return m1.compareTo(m2);
		case Title:
			return m1.name.compareTo(m2.name);
		case Director:
			return m1.director.compareTo(m2.director);	
		}
		return 0;
	}
}
class Movie implements Comparable<Movie>{
	double rating;
	String name;
	String director;
	
	public Movie(double rate, String name, String director) {
		rating = rate; this.name = name; this.director = director;
	}

	@Override
	public int compareTo(Movie other) {
		//3 possible values: 
		//1 if the current object data is bigger than the other. 
		//-1 if the current object data is smaller than the other
		//0 if they are equal.
		if(this.rating > other.rating)
			return 1;
		else if(this.rating < other.rating)
			return -1;
		else
			return 0;
		//return (int)(this.rating - other.rating);
	}
}

public class ComparingObjectDemo {

	public static void main(String[] args) {
		List<Movie> movies = new ArrayList<Movie>();		
		movies.add(new Movie(6.5, "Radhe", "Prabhu Deva"));
		movies.add(new Movie(8.5, "3 Idiots", "Rajkumar Hirani"));
		movies.add(new Movie(9.5, "Saving Private Ryan", "Steven Speilberg"));
		movies.add(new Movie(8, "Interstellar", "Cristopher Nolen"));
		movies.add(new Movie(7, "First Centurian", "Phaniraj"));
		movies.add(new Movie(6, "Titanic", "James Camaroon"));
		
		////////////////DEFAULT SORTING USING COMPARABLE///////////////////////////////
		Collections.sort(movies);
		System.out.println("Afer sorting:");
		for(Movie m : movies)
			System.out.println(String.format("%s-%f", m.name, m.rating));
		////////////////////USING COMPARATOR//////////////////////////////////////
		System.out.println("Sorting by Title:");
		//movies.sort(new MovieComparer(Criteria.Title));
		Collections.sort(movies, new MovieComparer(Criteria.Director));
		for(Movie m : movies)
			System.out.println(String.format("%s-%f", m.name, m.rating));
		
	}
}

/*
 * PTR:
 * If Sorting of objects is based on natural order then use Comparable interface and if u sort on different properties  of UR class, then use comparator. 
 * */
