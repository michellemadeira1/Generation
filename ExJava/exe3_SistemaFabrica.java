package br.com.generation.aulao1;

import java.util.Scanner;

public class exe3_SistemaFabrica {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int segundos, minutos,horas;
		
		System.out.println(" Quantos segundos voce trabalha por dia? ");
		segundos = leia.nextInt();
		
		horas = segundos / 3600;
		minutos = (segundos % 3600)/ 60;
		segundos = (segundos % 3600)% 60;
		
		System.out.println(" Voce trabalhou " + horas + " horas" + " e " + minutos + " minutos e " + segundos + " segundos");
		
		leia.close();
				
		

	}

}
