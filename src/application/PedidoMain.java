package application;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Cardapio;
import entities.Cliente;
import entities.Pedido;

public class PedidoMain {

	public static void main(String[] args) {

		Date hoje = new Date();

		String horaFormatada = DateFormat.getTimeInstance(DateFormat.SHORT).format(hoje);

		String dataFormatada = DateFormat.getDateInstance(DateFormat.SHORT).format(hoje);

		Cardapio objCardapio = new Cardapio();
		
		Cliente objCliente = new Cliente();

		Scanner sc = new Scanner(System.in);

		List<Pedido> listDePedidos = new ArrayList<>();

		char opcaoPorNovoPedido = 's';

		int contadorDePedidos = 0;

		do {
			
			//cadastro cliente
			objCliente.cadastroCliente();
						
			System.out.print("Hora p/ entrega: ");
			String horaEntrega = sc.nextLine();

			// cardapio
			objCardapio.escolhasCardapio();

			Cliente novoCliente = new Cliente(objCliente.getNomeCliente(), objCliente.getCpfCliente(), objCliente.getEndreçoCliente());

			Cardapio novoCardapio = new Cardapio(objCardapio.getComidaEscolhida(), objCardapio.getMolhoEscolhido(),
					objCardapio.getBebidaEscolhida());

			Pedido novoPedido = new Pedido(novoCliente, contadorDePedidos++, dataFormatada, horaFormatada, horaEntrega,
					novoCardapio);

			listDePedidos.add(novoPedido);

			System.out.println();
			System.out.println("Deseja fazer um novo pedido (S/N)? ");

			opcaoPorNovoPedido = sc.next().charAt(0);

			sc.nextLine();

		} while (opcaoPorNovoPedido == 'S' || opcaoPorNovoPedido == 's');

		System.out.println();
		System.out.println("*** FIM DO CADASTRO DO PEDIDO ***");
		System.out.println();

		for (Pedido lista : listDePedidos) {
			System.out.println(lista);
		}
		sc.close();

		System.out.println();

		for (int i = 0; i < listDePedidos.size(); i++) {
			System.out.println("======================================");
			System.out.println("====== RESTAURANTE FRANGO FRITO ======");
			System.out.println("======================================");
			System.out.println("ENTREGA Nº    " + listDePedidos.get(i).getNumeroDoPedido());
			System.out.println("======================================");
			System.out.println("======== ENTREGUE PELA LOJA ==========");
			System.out.println("======================================");
			System.out.println(
					listDePedidos.get(i).getDataDoPedido() + " \t\t\t " + listDePedidos.get(i).getHoraDoPedido());
			System.out.println("Hr combinada\t\t\t " + listDePedidos.get(i).getHoraCombinada());
			System.out.println("--------------------------------------");
			System.out.println("Cliente: " + listDePedidos.get(i).getCliente().getNomeCliente());
			System.out.println("CPF: " + listDePedidos.get(i).getCliente().getCpfCliente());
			System.out.println("--------------------------------------");
			System.out.println(listDePedidos.get(i).getCliente().getEndreçoCliente());
			System.out.println("Ribeirão Preto/SP");
			System.out.println("======================================");
			System.out.println("Qtde. Produto");
			System.out.println("======================================");
			System.out.println("1 - " + listDePedidos.get(i).getCardapio().getComidaEscolhida());
			System.out.println("\t+ " + listDePedidos.get(i).getCardapio().getMolhoEscolhido());
			System.out.println("\t+ " + listDePedidos.get(i).getCardapio().getBebidaEscolhida());
			System.out.println("Observação: ");
			System.out.println("======================================");
			System.out.println("====== Obrigado por seu pedido! ====== ");
			System.out.println("======================================");
			
		
			System.out.println();
			
			System.out.println("*********** fim da impressão do pedido ***********");
			
			System.out.println();
			System.out.println();
		}

	}

}
