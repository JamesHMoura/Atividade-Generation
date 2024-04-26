package atividade;

import java.util.*;

public class AtividadeQueue {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Queue<String> clientes = new LinkedList<String>();
		int opcao;
		do {
			System.out.println("""
					_____________________________
					1 - Adicionar Cliente na Fila
					2 - Listar todos os Clientes
					3 - Retirar Clientes da Fila
					0 - Sair
					_____________________________
					
					""");
			System.out.print("Digite uma opção: ");
			opcao = leia.nextInt();
			switch(opcao) {
			case 0:
				System.out.println("Fim do programa!! ");
				break;
			case 1: 
				System.out.println("Digite o nome: ");
				clientes.add(leia.next());
				
				System.out.println("Fila: \n");
				
				for(String cliente : clientes) {
					System.out.println(cliente);
				}
				System.out.println("\nCliente adicionado!!\n");
				break;
			case 2:
				System.out.println("Lista de Clientes na Fila: \n");
				for(String cliente : clientes) {
					System.out.println(cliente);
				}
				break;
			case 3:
				if(clientes.isEmpty()) {
					System.out.println("Não tem clientes na fila!!");
				}else {
					clientes.remove();
					System.out.println("Fila: \n");
					
					for(String cliente : clientes) {
						System.out.println(cliente);
					}
					System.out.println("\nO Cliente foi Chamado!\n");
				}
				break;
			default:
				System.out.println("Digite uma opção válida");
				break;
			}
			
		}while(opcao != 0);
		leia.close();
	}

}
