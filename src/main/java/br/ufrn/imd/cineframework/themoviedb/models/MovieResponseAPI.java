package br.ufrn.imd.cineframework.themoviedb.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;

public class MovieResponseAPI {
	private int page;
	private List<MovieAPI> results;
	@JsonAlias("total_pages")
	private int totalPages;
	@JsonAlias("total_results")
	private int totalResults;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public List<MovieAPI> getResults() {
		return results;
	}

	public void setResults(List<MovieAPI> results) {
		this.results = results;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public int getTotalResults() {
		return totalResults;
	}

	public void setTotalResults(int totalResults) {
		this.totalResults = totalResults;
	}
}
