package br.com.generation.aulao1;

import java.util.Scanner;

public class exe2_Expressaemdias {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int ano,mes,dias=0;
		 
		System.out.println(" Quantos dias vivenciados voc� tem? ");
		leia.next();
		
		ano = dias/ 365;
		System.out.println(" Voc� tem " + ano + " anos: ");
		
		mes= (dias% 365) /30;
		System.out.println(" Voc� tem " + mes + " meses: ");
		
		dias = (dias % 365)% 30;
		System.out.println(" Voc� tem " + dias + "dias de vida: ");
		
		leia.close();  
	}

}
