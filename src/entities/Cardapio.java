package entities;

import java.util.Scanner;

public class Cardapio {

	Scanner sc = new Scanner(System.in);

	private String sobrecoxaFrita = "Sobrecoxa Frita";
	private String batataFrita = "Batata Frita";

	private String pateAlho = "Pate de alho";
	private String pureBatata = "Purê de batata";

	private String cocaLataNormal = "Coca lata 300ml - normal";
	private String aguaGarrafinha = "Água s/ gás garrafinha 300ml";

	private String comidaEscolhida;
	private String molhoEscolhido;
	private String bebidaEscolhida;

	public Cardapio() {
	}
	
	

	public Cardapio(String comidaEscolhida, String molhoEscolhido, String bebidaEscolhida) {
		this.comidaEscolhida = comidaEscolhida;
		this.molhoEscolhido = molhoEscolhido;
		this.bebidaEscolhida = bebidaEscolhida;
	}



	public String getComidaEscolhida() {
		return comidaEscolhida;
	}

	public void setComidaEscolhida(String comidaEscolhida) {
		this.comidaEscolhida = comidaEscolhida;
	}

	public String getMolhoEscolhido() {
		return molhoEscolhido;
	}

	public void setMolhoEscolhido(String molhoEscolhido) {
		this.molhoEscolhido = molhoEscolhido;
	}

	public String getBebidaEscolhida() {
		return bebidaEscolhida;
	}

	public void setBebidaEscolhida(String bebidaEscolhida) {
		this.bebidaEscolhida = bebidaEscolhida;
	}

	public void escolhasCardapio() {

		System.out.print("Comida: \n\t1) Sobrecoxa Frita	\n\t2) Batata Frita");
		int comidaEscolhida = sc.nextInt();
		if (comidaEscolhida == 1) {
			this.comidaEscolhida = sobrecoxaFrita;
		} else
			this.comidaEscolhida = batataFrita;

		System.out.print("Molho: \n\t1) Pate de alho	\n\t2) Purê de batata");
		int molhoEscolhido = sc.nextInt();
		if (molhoEscolhido == 1) {
			this.molhoEscolhido = pateAlho;
		} else
			this.molhoEscolhido = pureBatata;

		System.out.print("Bebida: \n\t1) Coca lata 300ml - normal  \n\t2) Água s/ gás garrafinha 300ml");
		int bebidaEscolhida = sc.nextInt();
		if (bebidaEscolhida == 1) {
			this.bebidaEscolhida = cocaLataNormal;
		} else
			this.bebidaEscolhida = aguaGarrafinha;

	}

	@Override
	public String toString() {
		return "Cardapio [comidaEscolhida=" + comidaEscolhida + ", molhoEscolhido=" + molhoEscolhido
				+ ", bebidaEscolhida=" + bebidaEscolhida + "]";
	}

}
