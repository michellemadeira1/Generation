package LacoDeRepeticaoWhile2;

import java.util.Scanner;

public class LacoWhile2 {

	public static void main(String[] args) {
		int idade=0,cont1=0,cont2=0, cont3=0;
		
		Scanner ler=new Scanner(System.in);
		
		
		
		while(idade!= -99) {
			System.out.println("qual é a sua idade? ");
			idade=ler.nextInt();
			
			if(idade<21 && idade>=0) {
				cont1++;
			}
			else if(idade>=50 && idade>=0) {
				cont2++;
			}
			else if(idade>=22 && idade <= 49) {
				cont3++;

			}
		}
		System.out.println("pessoas com 21 ou menos :"+cont1);
		System.out.println("pessoas com mais de 50 :"+cont2);
		System.out.println("pessoas entre 22 a 49 :"+cont3);

	}
}
