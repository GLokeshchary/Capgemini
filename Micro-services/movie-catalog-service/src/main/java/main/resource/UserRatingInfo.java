package main.resource;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class UserRatingInfo {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "getFallBackUserRating")
	public UserRating getUserRating(String userid) {
		return restTemplate.getForObject("http://rating-service/users/"+userid, UserRating.class);
	}
	
	//fallback for rating-info-service
	public UserRating getFallBackUserRating(String userid) 
	{
		UserRating rating=new UserRating();
		rating.setUserId(userid);
		rating.setUserRating(Arrays.asList(new Rating("0",0)));
		return rating;
	}
}
