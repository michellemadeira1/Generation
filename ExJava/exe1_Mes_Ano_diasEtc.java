package br.com.generation.aulao1;

import java.util.Scanner;

public class exe1_Mes_Ano_diasEtc {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int ano,mes,dias,idade,res;
		
		
		System.out.println(" Qual é sua idade?  ");
		idade = leia.nextInt();
		
		System.out.println(" Você tem " + idade + "anos:  ");
		res = idade * 365;
		
		System.out.println(" Você tem "+ res + " dias vivenciados: ");
		res = idade * 12;
		
		System.out.println(" Voce tem "+ res + " meses vivenciados: ");
		
		leia.close();

	}

}
