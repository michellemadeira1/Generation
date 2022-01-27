package atividadeParaEntrega;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
	  Scanner ler = new Scanner(System.in);
	  
	   
	int n,m, o;
	   
	   System.out.println(" Digite numero 1: ");
	  n = ler.nextInt();
	   
	  System.out.println(" Digite numero 2: ");
	  m = ler.nextInt();
	  
	  System.out.println(" Digite  numero 3: ");
	  o = ler.nextInt();
	  
	  if (n < m && m < o) {
		   if (m < o) {
			   System.out.println(n + " - " + m + " - " + o);
			   
		   }
		   else if ( n< o) {
			   System.out.println(n+ " - " + o + " - " + m); 
			   
		   }
		   else {
			   System.out.println(o+ " - " + n + " - " + m);
		   }
		   
	  }
	  
	  
	}

}
