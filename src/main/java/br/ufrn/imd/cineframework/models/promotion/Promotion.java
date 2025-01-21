package br.ufrn.imd.cineframework.models.promotion;

import java.time.LocalDateTime;

import br.ufrn.imd.cineframework.models.AbstractEntity;
import br.ufrn.imd.cineframework.models.session.Session;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Promotion extends AbstractEntity {
	private static final long serialVersionUID = 1L;

	private Double discountPercentage;
	private LocalDateTime startDate;
	private LocalDateTime endDate;

	@ManyToOne
	private Session session;

	public Double getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(Double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

}
