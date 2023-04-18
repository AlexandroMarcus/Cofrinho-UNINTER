package trabalhocofrinho;

/*
 * @author Alexandro
 * 
 */

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Cofrinho cofrinho = new Cofrinho();
		while(true) {
			System.out.println("Cofrinho");
			System.out.println("1-Adicionar Moeda");
			System.out.println("2-Remover Moeda");
			System.out.println("3-Listar Moedas");
			System.out.println("4-Calcular total convertido para Real");
			System.out.println("5-Encerrar");
			System.out.println("Escolha a opcao: ");
			
			/*verifica se o dado que foi digitado pelo usuario e um valor entre 0 e 5*/
			int opcao;
			do {
                while (!teclado.hasNextInt()) { //verifica se o valor digitado é um inteiro
                    System.out.println("Erro! Essa opcao nao existe: ");
                    System.out.println("Tente novamente: ");
                    teclado.next(); //limpa o buffer de entrada
                }
                opcao = teclado.nextInt();
                if (opcao <= 0 || opcao > 5) { //verifica se o valor está no intervalo de 1 a 5
                    System.out.println("Erro! Essa opcao nao existe: ");
                    System.out.println("Tente novamente: ");
                }
            } while (opcao <= 0 || opcao > 5); //repete enquanto o valor não estiver entre 1 e 5
			
			switch(opcao) {
			case 1:
			    System.out.println("Voce escolheu a opcao 1 adicionar moeda!");
			    int tipo;
			    do {
			        System.out.println("Escolha o tipo da moeda que deseja adicionar:");
			        System.out.println("1-Real");
			        System.out.println("2-Dolar");
			        System.out.println("3-Euro");
			        while (!teclado.hasNextInt()) { //verifica se o valor digitado é um inteiro
			            System.out.println("Erro! Tipo de moeda invalido.");
			            System.out.println("Escolha o tipo da moeda que deseja adicionar:");
			            System.out.println("1-Real");
			            System.out.println("2-Dolar");
			            System.out.println("3-Euro");
			            teclado.next(); //limpa o buffer de entrada
			        }
			        tipo = teclado.nextInt();
			    } while (tipo <= 0 || tipo > 3);
			    if (tipo == 1) {
			        System.out.println("Digite o valor da moeda que deseja adicionar: ");
			        double valor = teclado.nextDouble();
			        Real real = new Real(valor);
			        cofrinho.adicionar(real); /*adicionando real no cofrinho*/                            
			        break;
			    } else if (tipo == 2) {
			        System.out.println("Digite o valor da moeda que deseja adicionar: ");
			        double valor = teclado.nextDouble();
			        Dolar dolar = new Dolar(valor);
			        cofrinho.adicionar(dolar); /*adicionando dolar no cofrinho*/
			        break;
			    } else if (tipo == 3) {
			        System.out.println("Digite o valor da moeda que deseja adicionar: ");
			        double valor = teclado.nextDouble();
			        Euro euro = new Euro(valor);
			        cofrinho.adicionar(euro); /*adicionando euro no cofrinho*/
			        break;
			    } else {
			        System.out.println("Erro! voce digitou uma opcao invalida");
			        break;
			    }
					
				case 2:
				    System.out.println("Voce escolheu a opcao remover moeda!");
				    System.out.println("Qual moeda voce deseja remover ?");
				    System.out.println("1-Real");
				    System.out.println("2-Dolar");
				    System.out.println("3-Euro");
				    opcao=teclado.nextInt();

				    if(opcao==1) {
				        System.out.println("Digite o valor da moeda que deseja remover: ");
				        double valor = teclado.nextDouble();
				        cofrinho.remover(valor); 
				        break;
				    }
				    else if(opcao==2) {
				        System.out.println("Digite o valor da moeda que deseja remover: ");
				        double valor = teclado.nextDouble();
				        cofrinho.remover(valor);
				        break;
				    }
				    else if(opcao==3){
				        System.out.println("Digite o valor da moeda que deseja remover: ");
				        double valor = teclado.nextDouble();
				        cofrinho.remover(valor);
				        break;
				    }
				    else {
				    	System.out.println("Erro! Essa opcao nao existe: ");
				        break;
				    }
				    
				case 3:
					System.out.println("Listar moedas");
					cofrinho.listagemMoedas();
					break;
				case 4:
					cofrinho.somarMoedas();
					break;
				case 5:
					System.out.println("Encerrando o programa...");
			        teclado.close(); // fechar o objeto Scanner para evitar vazamentos de recursos
			        return; // return; encerra o programa
				default:
					System.out.println("Erro, voce digitou um valor invalido!");
					System.out.println("Tente novamente...");
			}		
					
		}
	}
}
