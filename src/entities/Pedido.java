package entities;

import java.util.Date;

public class Pedido {

	private Cliente cliente;
	private int numeroDoPedido;
	private String dataDoPedido;
	private String horaDoPedido;
	private String horaCombinada;
	private Cardapio cardapio;

	public Pedido(Cliente cliente, int numeroDoPedido, String dataDoPedido, String horaDoPedido, String horaCombinada,
			Cardapio cardapio) {
		this.cliente = cliente;
		this.numeroDoPedido = numeroDoPedido;
		this.dataDoPedido = dataDoPedido;
		this.horaDoPedido = horaDoPedido;
		this.horaCombinada = horaCombinada;
		this.cardapio = cardapio;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getNumeroDoPedido() {
		return numeroDoPedido;
	}

	public void setNumeroDoPedido(int numeroDoPedido) {
		this.numeroDoPedido = numeroDoPedido;
	}

	public String getDataDoPedido() {
		return dataDoPedido;
	}

	public void setDataDoPedido(String dataDoPedido) {
		this.dataDoPedido = dataDoPedido;
	}

	public String getHoraDoPedido() {
		return horaDoPedido;
	}

	public void setHoraDoPedido(String horaDoPedido) {
		this.horaDoPedido = horaDoPedido;
	}

	public String getHoraCombinada() {
		return horaCombinada;
	}

	public void setHoraCombinada(String horaCombinada) {
		this.horaCombinada = horaCombinada;
	}

	public Cardapio getCardapio() {
		return cardapio;
	}

	public void setCardapio(Cardapio cardapio) {
		this.cardapio = cardapio;
	}

	@Override
	public String toString() {
		return "Pedido [cliente=" + cliente + ", numeroDoPedido=" + numeroDoPedido + ", dataDoPedido=" + dataDoPedido
				+ ", horaDoPedido=" + horaDoPedido + ", horaCombinada=" + horaCombinada + ", cardapio=" + cardapio
				+ "]";
	}

}
