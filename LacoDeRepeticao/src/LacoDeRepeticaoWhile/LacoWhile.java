package LacoDeRepeticaoWhile;

import java.util.Scanner;

public class LacoWhile {

	public static void main(String[] args) {
		int x,soma=0;
		
		do {
		Scanner lendo =new Scanner(System.in);
		System.out.println("digite um number: ");
		x=lendo.nextInt();
		soma=soma+x;

		}while(x!=0);
		
		System.out.println("a some é "+soma);

}
}
