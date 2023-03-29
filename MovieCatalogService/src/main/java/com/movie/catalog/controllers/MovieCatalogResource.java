package com.movie.catalog.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.movie.catalog.models.CatalogItem;
import com.movie.catalog.models.Movie;
import com.movie.catalog.models.Rating;
import com.movie.catalog.models.UserRating;
import org.springframework.cloud.client.discovery.DiscoveryClient;

@RestController
@RequestMapping(value="/catalog")
@CrossOrigin
public class MovieCatalogResource {
	
	@Autowired
	private RestTemplate restTemplate;
	
//	@Autowired
//	private  DiscoveryClient discoveryClient;
	
//	@Autowired
//	private WebClient.Builder webClientBuilder;
	
	@GetMapping(value="/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){
		//here in url localhost:8081 and 8082 is replaced by rating-data-service and movie-info-service as hardcoding url is bad practice so
		//spring eureka client handles from application name 
		UserRating ratings = restTemplate.getForObject("http://rating-data-service/rating-data/data/users/"+ userId, UserRating.class);
		
		return ratings.getUserRating().stream().map(rating->
		{	
			Movie movie = restTemplate.getForObject("http://movie-info-service/movie-info/movies/" + rating.getMovieId(), Movie.class);

			return new CatalogItem(movie.getName(), "desc", rating.getRating());
		})
		.collect(Collectors.toList());
		
//		Movie movie = webClientBuilder.build()
//		.get()
//		.uri("http://localhost:8080/movie-info/movies/" + rating.getMovieId())
//		.retrieve()
//		.bodyToMono(Movie.class)
//		.block();		
	}
}
