package entities;

import java.util.Scanner;

public class Cliente {

	private String nomeCliente;
	private String cpfCliente;
	private String endreçoCliente;

	Scanner sc = new Scanner(System.in);
		
	public Cliente() {
	}

	public Cliente(String nomeCliente, String cpfCliente, String endreçoCliente) {
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.endreçoCliente = endreçoCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEndreçoCliente() {
		return endreçoCliente;
	}

	public void setEndreçoCliente(String endreçoCliente) {
		this.endreçoCliente = endreçoCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public void cadastroCliente() {

		System.out.print("Nome do cliente: ");
		this.nomeCliente = sc.nextLine();

		System.out.print("CPF do cliente: ");
		this.cpfCliente = sc.nextLine();

		System.out.print("Endereço p/ entrega: ");
		this.endreçoCliente = sc.nextLine();

	}

	@Override
	public String toString() {
		return "Cliente [nomeCliente=" + nomeCliente + ", cpfCliente=" + cpfCliente + ", endreçoCliente="
				+ endreçoCliente + "]";
	}

}
