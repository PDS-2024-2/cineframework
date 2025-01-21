package br.ufrn.imd.cineframework.models.ticket;

import java.io.Serializable;
import java.util.Set;

import br.ufrn.imd.cineframework.models.AbstractEntity;
import br.ufrn.imd.cineframework.models.combo.Combo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "abstract_ticket")
@Inheritance(strategy = InheritanceType.JOINED) 
public abstract class AbstractTicket extends AbstractEntity implements Serializable {

	@NotNull(message = "O preço não pode ser nulo.")
	@Column(name = "price")
	private Double price;

	@NotNull(message = "O token não pode ser nulo.")
	@Column(name = "token")
	private String token;

	@ManyToMany
	private Set<TicketType> ticketTypes;

	@ManyToMany
	private Set<Combo> combos;

	@Transient
	private TransferStrategy tranferStrategy;

	public void setTranferStrategy(TransferStrategy tranferStrategy) {
		synchronized (this.tranferStrategy) {
			this.tranferStrategy = tranferStrategy;
		}
	}

	public AbstractTicket transfer(TransferData transferData) {
		synchronized (this) {
			return this.tranferStrategy.transfer(transferData);
		}
	}
}
