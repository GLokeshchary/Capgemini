package main.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@Service
public class MovieInfo {
	
	@Autowired
	private RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "getFallBackCatalogItem", commandProperties = {
			   @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000"),
			   @HystrixProperty(name="circuitBreaker.requestVolumeThreshold",value="5"),
			   @HystrixProperty(name="circuitBreaker.errorThresholdPercentage",value = "50"),
			   @HystrixProperty(name="circuitBreaker.sleepWindowInMilliseconds",value = "5000")
	})
	public Catalog getCatalogItem(Rating rating) {
		Movie movie =  restTemplate.getForObject("http://movie-info-service/movies/"+rating.getMovieid(), Movie.class);
		return new Catalog(movie.getName(), "desc", rating.getRatings());
	}
	
	//fallback for movie-info-service
	public Catalog getFallBackCatalogItem(Rating rating) 
	{
		return new Catalog("Movie name not found", " ", rating.getRatings());
	}
}
