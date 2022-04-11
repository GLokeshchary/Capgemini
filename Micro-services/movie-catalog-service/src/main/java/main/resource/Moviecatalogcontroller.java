package main.resource;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Moviecatalogcontroller {
	
	/*@Autowired
	private WebClient.Builder builder;*/
	
	@Autowired
	MovieInfo movieInfo;
	
	@Autowired
	UserRatingInfo userRatingInfo;
	
	@RequestMapping(value = "/catalog/{userid}")
	public List<Catalog> getCatalog(@PathVariable String userid){
 
		
		UserRating ratings=userRatingInfo.getUserRating(userid);
		return ratings.getUserRating().stream().map((rating)->movieInfo.getCatalogItem(rating))
				                               .collect(Collectors.toList());

		
	}
}
/*Movie movie = builder.build().get().uri("http://localhost:8081/movies/"+rating.getMovieid())
.retrieve().bodyToMono(Movie.class).block();*/
