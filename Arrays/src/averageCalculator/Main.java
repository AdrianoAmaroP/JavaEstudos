package averageCalculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("=========================");
		System.out.println("calcuradora de media");
		System.out.println("=========================");
		
		System.out.println();
		System.out.println("DIGITE QUANTOS NUMEROS VAI CALCURA :");
		
		Scanner scanner = new Scanner(System.in);
		
		int quantity = scanner.nextInt();
		Double[] arrayAVG = new Double[quantity];
		
		System.out.println();
		System.out.println("AGORA DIGITE TODOS OS NUMEROS QUE DESEJA CALCULAR");
		
		Double all = 0.0;
		
		for(int i = 0; i < arrayAVG.length; i++ ) {
			Double value = scanner.nextDouble();
			arrayAVG[i] = value;
			all += value;
		}
		
		Double avg = all / arrayAVG.length;
		
		System.out.println();
		System.out.println("=========================");
		System.out.println("A MEDIA : " + avg);		
		System.out.println("=========================");


		scanner.close();
		
	}
}
