package main.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RatingsController {

	@GetMapping("ratings/{movieid}")
	public Rating getRating(@PathVariable String movieid) {
		return new Rating(movieid, 4);
		
	}
	
	@GetMapping("users/{userid}")
	public UserRating getUserRating(@PathVariable String userid) {
		List<Rating> ratings=Arrays.asList(new Rating("100", 4),
                                           new Rating("200", 3));
		UserRating userRatings = new UserRating();
		userRatings.setUserRating(ratings);
		return userRatings;
		
	}
}
