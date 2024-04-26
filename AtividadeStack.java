package atividade;
import java.util.*;
public class AtividadeStack {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Stack<String> livros = new Stack<String>();
		int opcao;
		do {
			System.out.println("""
					_____________________________
					1 - Adicionar Livro na pilha
					2 - Listar todos os Livros
					3 - Retirar Livros da pilha
					0 - Sair
					_____________________________
					
					""");
			
			System.out.print("Digite uma opção: ");
			opcao = leia.nextInt();
			leia.nextLine();
			switch(opcao) {
			case 0:
				System.out.println("Fim do programa!! ");
				break;
			case 1: 
			
				System.out.println("Digite o nome: ");
				livros.push(leia.nextLine());
				
				System.out.println("Plha: \n");
				
				for(String livro : livros) {
					System.out.println(livro);
				}
				System.out.println("\nLivro adicionado!!\n");
				break;
			case 2:
				System.out.println("Lista de Livros na pilha: \n");
				for(String livro : livros) {
					System.out.println(livro);
				}
				break;
			case 3:
				if(livros.isEmpty()) {
					System.out.println("Não tem Livros na pilha!!");
				}else {
					livros.pop();
					System.out.println("Pilha: \n");
					
					for(String livro : livros) {
						System.out.println(livro);
					}
					System.out.println("\nUm Livro foi retirado da pilha!\n");
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
