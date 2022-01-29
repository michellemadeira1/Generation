package AtividadeExtras;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
	
	 int tamanho=3;
	 int [] [] v= new int[tamanho][6];
	 int l,c,soma=0,soma2=0;
	 
	  Scanner ler= new Scanner(System.in);
	 
	 for(l=0; l<tamanho;l++) {
		 for(c=0;c<3;c++) {
			 
			 System.out.println(" Valor:  ");
			v[l][c]=ler.nextInt();
			 
			 if (l==c) {
				 soma2=soma2+v[l][c];
			 }
			  soma=soma+v[l][c];
		 }
	 }
		
		for(l=0;l<tamanho;l++) {
			for(c=0;c<3;c++) {
				System.out.print("[" + v[l][c] + "]");
			}
			
			System.out.println();
		}
                 System.out.println(" A soma total dos vetores e: " + soma);
                 System.out.println(" A soma da primeira linha e: " + soma2);
	}
          
}
