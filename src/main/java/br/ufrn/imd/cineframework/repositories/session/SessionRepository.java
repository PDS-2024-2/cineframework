package br.ufrn.imd.cineframework.repositories.session;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.ufrn.imd.cineframework.models.movie.Movie;
import br.ufrn.imd.cineframework.models.session.Session;
import br.ufrn.imd.cineframework.repositories.GenericRepository;

@Repository
public interface SessionRepository extends GenericRepository<Session> {

	@Query("SELECT s FROM Session s WHERE s.movie.id = :movieId AND s.date = :date")
	List<Session> findByMovieIdAndDate(@Param("movieId") Integer movieId, @Param("date") LocalDate date);

	@Query("select s from Session s where s.date >= ?1")
	List<Session> findSessionsForNextFiveDays(LocalDate date);

	List<Session> findByMovie(Movie movie);
}
