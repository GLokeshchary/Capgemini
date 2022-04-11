package main.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Movieinfocontroller {
	
	
	
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/movies/{movieid}")
	public Movie getMovieinfo(@PathVariable String movieid) {
		//MovieSummary moviesummary = restTemplate.getForObject("https://api.themoviedb.org/3/movie/"+movieid+"?api_key="+apikey, MovieSummary.class);
		return new Movie(movieid, "rrr","desc");
		
	}
}