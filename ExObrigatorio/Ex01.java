package atividadeParaEntrega;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		int a,b,c;
		
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println(" Digite o primeiro  numero: ");
			a = (int) entrada.nextInt();
			
			System.out.println(" Digite o segundo numero: ");
			b = (int) entrada.nextInt();
			
			System.out.println(" Digite o terceiro numero: ");
			c = (int) entrada.nextInt();
		}
		
		if (a > b && a > c) {
		System.out.println(" O maior numero e: " + a );
		}
		
		else if (b > a && b > c) {
			System.out.println(" O maior numero e: " + b);
		}
		
		else if (c > a && c > b) {
			System.out.println(" O numero maior e: " + c);
		}
		else {
			System.out.println(" O maior valor de A e:" + a + " O maior valor de B e: " + b + "O maior valor de C e: " + c);
			
		}
	}

}
