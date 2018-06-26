/**
 * @author boratanrikulu
 * If you have any question about the project, you can contact me at http://boratanrikulu.me/contact
 */

package scraper;

import java.util.ArrayList;

public class ScraperTest {

	public static void main(String[] args) {
		ArrayList<Movie> movies = new IMDbScraper().getMovies();

		System.out.println("###\n#");
		for(Movie movie : movies) {
			System.out.println(movie.toString());
		}
		System.out.println("###");
	}
}
