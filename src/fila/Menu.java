package fila;

import java.util.Scanner;
import model.Cliente;
import java.util.LinkedList;
import java.util.Queue;

public class Menu {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		Queue<Cliente> fila = new LinkedList<>(); 
		
		String nome, senha;
		Integer opcao;
		
		
		while(true) {
		System.out.println("                SENHA DE ATENDIMENTO				 ");
		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("            1 - Nova Senha                           ");
		System.out.println("            2 - Listar todas as Senhas               ");
		System.out.println("            3 - Chamar senha 						 ");
		System.out.println("            4 - Sair		 						 ");
		System.out.println("*****************************************************");
		System.out.println("                                                     ");  
		
		opcao = scan.nextInt();
		
			if(opcao == 4) {
				System.out.println("Sistema Encerrado");
				scan.close();
				System.exit(0);
			}
			
			switch(opcao) {
			case 1: 
				System.out.println("Primero nome: ");
				nome = scan.next();
				System.out.println("Senha(apenas 2 numeros, ex: 01): ");
				senha = scan.next();
				
				Cliente novo = new Cliente(nome, senha);
				
				fila.add(novo);		
				
				System.out.println("Senha  " + novo.getSenha() + " retirada com sucesso!");
				break;
			case 2:
				if(fila.isEmpty()) {
				   System.out.println("Fila vazia, não há senha a ser chamada!");
				} else {
				   System.out.println("Senhas aguardando" + fila);
				}
				break;
			case 3:
				System.out.println("A senha da vez é: " + fila.peek());
				fila.remove();
				break;
			default:
			
				
			}
			
			
				
	
			
		}
		
		
		
	}

}
