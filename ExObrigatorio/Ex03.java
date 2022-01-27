package atividadeParaEntrega;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		   Scanner ler = new Scanner(System.in);
			   
			int inf = 14, juv= 17 , adl= 25, a=0;
			  
			System.out.println(" Digite sua idade: ");
			a=ler.nextInt();
			
			if(a <= inf && a <= juv && a <=adl );{
			
			 if( a<= inf )
			System.out.println("10 a 14  Voce e infantil ");
			
			 else if (a <= juv) 
				System.out.println(" 15 a 17  Voce e juvenil ");
			
			 else if ( a <= adl)  
			System.out.println(" 18 a 25 Voce e adulto ");
		 
		
			}

	}

}
