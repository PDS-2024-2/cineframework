package br.ufrn.imd.cineframework.models.ticket;

public interface TransferStrategy {

	AbstractTicket transfer(TransferData data);
}
