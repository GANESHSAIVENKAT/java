public class MoviesRunner{
public static void main(String[] args){
Movies movies = new Movies();
int length = movies.getlength();
		System.out.println("length is:"+length);
		movies.createbyMoviename("Radhaeshyam");
		movies.createbyMoviename("Jersy");
		movies.createbyMoviename("Eega");
		movies.createbyMoviename("Kalki");
		movies.createbyMoviename("Turn");
		movies.moviereadby();
		System.out.println("----------update--------");
		movies.movieupdateby("Radhaeshyam","Kalki");
		movies.moviereadby();
		System.out.println("----------delete--------");
		movies.moviedeleteby("Jersy");
		movies.moviereadby();
		System.out.println("----------search--------");
		String movie = movies.searchByMovieNames("Radhaeshyam");
		System.out.println(movie);
		movies.moviereadby();
 }
}
