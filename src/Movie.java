/**
 * @author boratanrikulu
 * If you have any question about the project, you can contact me at http://boratanrikulu.me/contact
 */

package scraper;

public class Movie {

	private int id;
	private String title;
	private String genre;
	private String duration;
	private double rating;
	private String director;
	private String actors;
	private String date;
	private String urlPoster;
	private String summary;
	
	/* constructors */
	public Movie(String title, String genre, String duration, double rating, String director, String actors, String date, String urlPoster, String summary) {
		this.title = title;
		this.genre = genre;
		this.duration = duration;
		this.rating = rating;
		this.director = director;
		this.actors = actors;
		this.date = date;
		this.urlPoster = urlPoster;
		this.summary = summary;
	}

	/* getters */
	public int getID() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getGenre() {
		return genre;
	}
	public String getDuration() {
		return duration;
	}
	public double getRating() {
		return rating;
	}
	public String getDirector() {
		return director;
	}
	public String getActors() {
		return actors;
	}
	public String getDate() {
		return date;
	}
	public String getUrlPoster() {
		return urlPoster;
	}
	public String getSummary() {
		return summary;
	}
	
	/* toString */
	public String toString() {
		return String.format("#  %s [%.1f]\n#\t  Director: %s\n#\t  Actors: %s\n#\t  Genre: %s\n#\t  Duration: %s\n#\t  Date: %s\n#\t  Summary: %s\n#\t  URL of Poster: %s\n#"
			,getTitle(), getRating(), getDirector(), getActors(), getGenre(), getDuration(), getDate(), getSummary(), getUrlPoster());
	}
}