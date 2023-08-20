package contactBook.application;

import java.util.Scanner;

import contactBook.entities.Contact;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Contact[] contatos = new Contact[0];
		
		int acao = 0;
		
		do {
			System.out.println();
			System.out.println(menu());
			System.out.println();
			acao = sc.nextInt();
			sc.nextLine();
			
				
			if(acao == 1) {
				//add
				
				System.out.println("DIGITE o nome");
				String name = sc.nextLine();
				
				System.out.println("DIGITE o numero de telefone");
				String number = sc.nextLine();
				
				contatos = add(contatos,name,number);
				
				System.out.println("contato salvo");
				}
				
				
			if(acao == 2) {
				//remove
				System.out.println("qual numero?");
				int n = sc.nextInt();
				n--;
				
				contatos = remove(contatos, n);
				
			}
			

			if(acao == 3) {
				//list
				System.out.println("=====LISTA DE CONTATOS=====");
				list(contatos);
				System.out.println("===========================");
			}

			if(acao != 1 && acao != 2 && acao != 3) {
				//exite
				System.out.println("out");
			}
		}while(acao == 1 || acao == 2 || acao == 3);
		
		
		
		sc.close();
	}

	private static String menu() {
		return "=====MENU CONTATOS=====" 
				+ "\n"
				+ "1 - Adicionar contato"
				+ "\n"
				+ "2 - Remover contato"
				+ "\n"
				+ "3 - Listar contatos"
				+ "\n"
				+ "4 - exit"
				+ "\n"
				+ "=======================";
			
	}

	private static void list(Contact[] obj) {
		int i = 1;
		for(Contact x : obj) {
			
			System.out.println(i + "- " + x);
			System.out.println();
			i++;
		}
		
		
	}
	
	private static Contact[] add(Contact[] contatos,String name, String number) {
		
		int size = contatos.length + 1;
		Contact[] aux = contatos;
		contatos = new Contact[size];
		if(size != 1) {
			for(int i = 0; i < aux.length; i++) {
				String nameAux = aux[i].getName();
				String numberAux = aux[i].getNumber();
				contatos[i] = new Contact(nameAux, numberAux);
			}
		}
		
		contatos[contatos.length - 1 ] = new Contact(name, number);
		return contatos;
	}
	
	private static Contact[] remove(Contact[] contatos,int n) {
	
		contatos[n] = null;
		int size = contatos.length - 1;
		for(int i = n; i < size ; i++) {
			contatos[i] = contatos[i + 1]; 
		}

		Contact[] aux = contatos;
		contatos = new Contact[size];
		if(size != 1) {
			for(int i = 0; i < size; i++) {
				String nameAux = aux[i].getName();
				String numberAux = aux[i].getNumber();
				contatos[i] = new Contact(nameAux, numberAux);
			}
		}
		return contatos;
	}
}
