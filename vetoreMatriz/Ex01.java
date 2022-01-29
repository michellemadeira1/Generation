package AtividadeExtras;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		int []valores= new int [5];
		int l,maiorp=0;
		
		Scanner ler= new Scanner(System.in);
		
		for(l=0;l<5;l++) {
			System.out.println(" Digite um valor: ");
			valores[1]=ler.nextInt();
			
			if(maiorp<valores[1]) {
			    maiorp=valores[1];
		}

	}
             for(l=0;l<5;l++) {
            	 System.out.println(" Posicao " +1 + " valor" + valores[1]);
             }
              System.out.println(" Omaior valor e: " + maiorp);
}
}
