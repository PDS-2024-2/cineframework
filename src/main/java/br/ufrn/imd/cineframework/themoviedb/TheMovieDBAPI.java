package br.ufrn.imd.cineframework.themoviedb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import br.ufrn.imd.cineframework.themoviedb.models.MovieResponseAPI;

@Service
public class TheMovieDBAPI {

	@Value("${themoviedb.auth}")
	private String auth;
	@Value("${themoviedb.url}")
	private String urlString;
	
	@Autowired
	private RestTemplate restTemplate;

	public MovieResponseAPI filter(String query, Integer page) {
		String url = UriComponentsBuilder.fromHttpUrl(urlString)
				.queryParam("include_adult", "false")
				.queryParam("page", page)
				.queryParam("language", "pt-BR")
				.queryParam("query", query).toUriString();

		HttpHeaders headers = new HttpHeaders();
		headers.set("Authorization", "Bearer " + auth);
		headers.set("Accept", "application/json");

		HttpEntity<String> entity = new HttpEntity<>(headers);

		ResponseEntity<MovieResponseAPI> response = restTemplate.exchange(url, HttpMethod.GET, entity,
				MovieResponseAPI.class);

		return response.getBody();
	}
}
