package br.ufrn.imd.models.ticket;

import java.util.List;

import br.ufrn.imd.models.combo.Combo;

public abstract class AbstractTicket {

	private Double price;
	private String token;

	private List<TicketType> ticketTypes;

	private List<Combo> combos;

	private TransferStrategy tranferStrategy;

	public AbstractTicket() {

	}

	public AbstractTicket(Double price, String token, TransferStrategy transferStrategy, List<TicketType> ticketTypes,
			List<Combo> combos) {
		this.ticketTypes = ticketTypes;
		this.combos = combos;
		this.price = price;
		this.token = token;
		this.tranferStrategy = transferStrategy;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public TransferStrategy getTranferStrategy() {
		return tranferStrategy;
	}

	public List<TicketType> getTicketTypes() {
		return ticketTypes;
	}

	public void setTicketTypes(List<TicketType> ticketTypes) {
		this.ticketTypes = ticketTypes;
	}

	public List<Combo> getCombos() {
		return combos;
	}

	public void setCombos(List<Combo> combos) {
		this.combos = combos;
	}

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
