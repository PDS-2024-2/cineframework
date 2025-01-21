package br.ufrn.imd.cineframework.repositories.promotion;

import java.time.LocalDateTime;
import java.util.List;

import br.ufrn.imd.cineframework.models.promotion.Promotion;
import br.ufrn.imd.cineframework.models.session.Session;
import br.ufrn.imd.cineframework.repositories.GenericRepository;

public interface PromotionRepository extends GenericRepository<Promotion> {
	List<Promotion> findBySessionAndStartDateBeforeAndEndDateAfter(Session session, LocalDateTime start,
			LocalDateTime end);

	List<Promotion> findBySession(Session session);
}