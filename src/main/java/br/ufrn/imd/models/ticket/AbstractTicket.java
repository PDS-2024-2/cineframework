package br.ufrn.imd.models.ticket;

import br.ufrn.imd.models.combo.Combo;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public abstract class AbstractTicket implements Serializable {

	@NotNull(message = "O preço não pode ser nulo.")
	@Column(name = "price", nullable = false)
	private Double price;

	@NotNull(message = "O token não pode ser nulo.")
	@Column(name = "token", nullable = false)
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

	public void transfer(TransferData transferData) {
		synchronized (this) {
			this.tranferStrategy.transfer(transferData);
		}
	}
}
