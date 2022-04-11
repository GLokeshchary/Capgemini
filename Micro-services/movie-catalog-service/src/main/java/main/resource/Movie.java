package main.resource;

public class Movie {
	private String movieid;
	private String name;
	private String description;
	public Movie() {
		// TODO Auto-generated constructor stub
	}
	public Movie(String movieid, String name,String description) {
		super();
		this.movieid = movieid;
		this.name = name;
		this.description=description;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMovieid() {
		return movieid;
	}
	public void setMovieid(String movieid) {
		this.movieid = movieid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
