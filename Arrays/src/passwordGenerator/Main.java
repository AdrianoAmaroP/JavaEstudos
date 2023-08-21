package passwordGenerator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] saved = new String[5];
		
		int count = 0;
		
		do {
			menu();
			
			int acao = sc.nextInt();
			
			if(acao != 1) {
				break;
			}
			
			String password = passwordGenerator();
			
			saved[count] = password;
			System.out.println("\n--SENHAS GERADAS COM SUCESSO--");
			System.out.println(password);
			
			count++;
			
		}while(saved[saved.length - 1] == null);
		
		end();
		
		System.out.println("\n--SENHAS GERADAS--");
		
		for(int i = 0; i < saved.length; i++) {
			
			System.out.println("Senha - " + count + "  " + saved[i]);
		}
		
		
		sc.close();
	}

	private static String passwordGenerator() {
		int sizePassword = 8;
		String password = "";
	    String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	    for (var i = 0; i < sizePassword ; i++) {
	        password += caracteres.charAt((int) Math.floor(Math.random() * caracteres.length()));
	    }
	    return password;
	}

	private static void end() {
		System.out.println("--PROGRAMA ENCERRADO--");

	}

	private static void menu() {
		System.out.println("--DESEJA GERAR UMA SENHA--?");
		System.out.println("       1 - SIM.");
		System.out.println("       2 - NAO");
	}
}
