package AtividadeExtras;

import java.util.Random;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
	int tamanho=4;
	int [][]n1=new int[tamanho][6];
	int [][]n2 =new int [tamanho][6];
	int [] []m1=new int[tamanho][6];
	int [] []m2= new int[tamanho][6];
	int l,c,soma=0,soma2=0;
	Random random = new Random();
	
	Scanner ler= new Scanner(System.in);
	
	System.out.println(" \n matriz n1   matriz n2 ");
	
	for(l=0;l<tamanho;l++) {
		for(c=0;c<6;c++) {
			n1[l][c]=random.nextInt(50);
			
			n2[l][c]=random.nextInt(50);
			System.out.println("\n "+ n1[l][c] + "             " + n2[1][c]);
		}
		  
	}
	

	System.out.println("\n m1= n1 +n2               m2=n1 - n2\n");
	   for(l=0; l<tamanho; l++) {
		   for(c=0;c< 6; c++) {
			   
			   m1[l][c] = n1[l][c] + n2[l][c];
			   m2[l][c] = n1[l][c] - n2[l][c];
			   
			   System.out.println("\n " + m1[l][c]+ "                         " + m2[l][c]);
					   
		   }
	   }
	   
	
	}

}
