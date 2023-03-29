package com.rating.data.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rating.data.models.Rating;
import com.rating.data.models.UserRating;

@RestController
@RequestMapping(value="/data")
public class RatingResource {
	
//	@GetMapping(value = "{movieId}")
//	public Rating getRating(@PathVariable("movieId") String movieId) {
//		return new Rating(movieId, 4);
//	}
	
	@GetMapping(value = "users/{userId}")
	public UserRating getRating(@PathVariable("userId") String userId) {
		List<Rating> ratings = Arrays.asList(
				new Rating("4567", 4),
				new Rating("5678", 3)
		);
		UserRating userRating = new UserRating();
		userRating.setUserRating(ratings);
		return userRating;
		
	}

}
