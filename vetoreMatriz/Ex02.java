package AtividadeExtras;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		int []lancado= new int [6];
		int dado,somalanc=0,cont=0,maiorlanc=0,contlanc=0;
		double medialanc;
		
		Scanner ler= new Scanner(System.in);
		
		for(dado=0;dado<6;dado++) {
			System.out.println(" Digite um valor: ");
			lancado[dado]=ler.nextInt();
			
			somalanc=somalanc+lancado[dado];
			
			if(maiorlanc<=lancado[dado]) {
				maiorlanc=lancado[dado];
			}
			cont++;
			
		}
		 medialanc=somalanc/10;
		 
		 for(dado=0;dado<10;dado++) {
			 if(maiorlanc==lancado[dado]) {
				 contlanc++;
			 }
			 
		 }
		 
		 System.out.println(" \n Media de lancamento e: " + medialanc);
         System.out.println("\n Quantas vezes foi jogado o dado: " + cont);
         System.out.println("\n Quantidade do maior lancamento: " + contlanc);
         System.out.println("\n Soma dos valores lancados: " + somalanc);   
	}

}
