package br.ufrn.imd.cineframework.repositories.feedback;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.ufrn.imd.cineframework.models.feedback.Feedback;
import br.ufrn.imd.cineframework.repositories.GenericRepository;

@Repository
public interface FeedbackRepository extends GenericRepository<Feedback> {
	List<Feedback> findByMovieId(Long movieId);

	List<Feedback> findByUserId(Long userId);

	Feedback findByTicketId(Long ticketId);
}
