import java.util.Scanner;

/////////////////////////////////COMMON LAYER->HELPER FUNCTIONS /////////////////////////////////////////
class MyUI{
	static Scanner sn = new Scanner(System.in);
	
	//Object is the universal data type and can hold any kind of data in it...
	public static void Print(Object msg) {
		System.out.println(msg);
	}
	
	public static String getString(String question) {
		System.out.println(question);
		String input =  sn.nextLine();0
		return input;
	}
	
	public static int getNumber(String question) {
		return Integer.parseInt(getString(question));
	}
}

class MovieException extends Exception{
	public MovieException() {
		// TODO Auto-generated constructor stub
	}
	
	public MovieException(String msg) {
		super(msg);
	}
}
////////////////////////////////////////User Interface Layer///////////////////////////////////////////
class ConsoleApp{
	//const in Java....
	final static String menu = "~~~~~~~~~~~~~~~~~Movie Database~~~~~~~~~~~~~~~~~~~\nTO ADD A REVIEW--------->PRESS 1\nTO FIND REVIEWS---------------->PRESS 2\nPS: Any other key is considered as EXIT";
	
	static IMovieReview component = new MovieReviewImpl();
	
	public static void main(String[] args) {
		boolean processing = true;
		do{
			String choice = MyUI.getString(menu);
			processing = processMenu(choice);
		}while(processing == true);
	}

	private static boolean processMenu(String choice) {
		switch(choice) {
		case "1":
			insertReviewHelper();
			return true;
		case "2":
			displayAllReviews();
			return true;
		default:
			return false;
		}
	}

	private static void displayAllReviews() {
		String movie = MyUI.getString("Enter the name of the movie to view its reviews");
		try {
			Review[] data = component.getAllReviews(movie);
			for(Review r : data) {
				if(r != null)
					MyUI.Print(String.format("%s has a rating of %ld\nThe Review: \n%s", r.movie, r.Rating(), r.review));
			}
		} catch (MovieException e) {
			System.err.println(e.getMessage());
		} catch(Exception ex) {
			System.err.println("Unknown Error!, Please try again");
		}
		
	}

	private static void insertReviewHelper() {
		//Create the Review object by taking inputs
		String name = MyUI.getString("Enter the Movie name to Review");
		int rating = MyUI.getNumber("Enter the Rating as 1 to 10 for this movie");
		String review = MyUI.getString("Enter a Review about this movie in UR own words\nPS: No bad mouthing or obsense meaning to be included");
		Review myReview = new Review(name, rating, review);
		//Call the interface object's method to insert the review...
		try {
			component.AddReview(myReview);
		}catch(MovieException ex) {
			System.err.println(ex.getMessage());
		}catch(Exception ex) {
			System.err.println("Unknown Error!, Please try again");
		}
	}
}
//////////////////////////////////////////Entities////////////////////////////////////////
class Review{
	String movie;
	int rating;
	String review;
	
	public Review(String movie, int rating, String review) {
		this.movie = movie;
		this.rating = rating;
		this.review = review;
	}
	
	public double Rating() {
		return rating;
	}
}
///////////////////////////////////////////DAL LAYER//////////////////////////////////////////
interface IMovieReview{
	void AddReview(Review review) throws MovieException;
	Review[] getAllReviews(String movieName) throws MovieException;
}

class MovieReviewImpl implements IMovieReview{

	private Review[] allReviews  = new Review[10];
	//Limitation of the array: size is fixed...
	@Override
	public void AddReview(Review review) throws MovieException {
		for(int i =0; i < 10; i++) {
			if(allReviews[i] == null) {
				allReviews[i] = new Review(review.movie, review.rating, review.review);
				return;//exit the function..
			}else continue;
		}
		throw new MovieException("No more reviews could be added to the System");	
	}

	@Override
	public Review[] getAllReviews(String movieName) throws MovieException {	
		Review [] temp = new Review[10];//Same size..
		int index  =0;
		for(Review r : allReviews) {
			if((r != null) && (r.movie.contains(movieName))) {
				temp[index] = r;
				index++;
			}else continue;
		}
		boolean has = false;
		for(Review r : temp) {
			if(r != null)
				has = true;
		}
		if(!has)
			throw new MovieException("No movie found to display reviews");
		return temp;
	}
}


