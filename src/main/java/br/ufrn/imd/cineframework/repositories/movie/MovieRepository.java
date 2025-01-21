package br.ufrn.imd.cineframework.repositories.movie;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.ufrn.imd.cineframework.models.movie.Movie;
import br.ufrn.imd.cineframework.repositories.GenericRepository;

public interface MovieRepository extends GenericRepository<Movie> {

	@Query("SELECT f FROM Movie f WHERE f.genre = :genre")
	List<Movie> findByGenre(@Param("genre") String genre);

	@Query("SELECT f FROM Movie f WHERE f.title LIKE %:title%")
	List<Movie> findByTitleLike(@Param("title") String title);
}
