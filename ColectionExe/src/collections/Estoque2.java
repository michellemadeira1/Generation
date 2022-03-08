package collections;

import java.util.ArrayList;
import java.util.Scanner;
public class Estoque2 {
	



		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int x;
			
			Scanner leia = new Scanner(System.in);
			
			ArrayList<String> estoque = new ArrayList();
		
			do
			{
				System.out.println("\n-------------------------------");
				System.out.println("\n(1) Deseja adicionar produtos do estoque?");
				System.out.println("\n(2) Deseja remover produtos do estoque?");
				System.out.println("\n(3) Atualizar produtos do estoque?");
				System.out.println("\n(4) Mostrar todos os produtos do estoque?");
				System.out.println("\n(0) Deseja encerrar o programa?");
				System.out.println("\nDigite sua opção: ");
				x = leia.nextInt();
				
				switch(x)
				{
				case 1:
					leia.nextLine();
					System.out.println("\n adicionar ao estoque: ");
					String produto = leia.nextLine();
					estoque.add(produto);
					break;
				case 2:
					leia.nextLine();
					System.out.println("\nremover do estoque: ");
					String produto1 = leia.nextLine();
					if(estoque.contains(produto1))
					{
						estoque.remove(produto1);
					}
					else
					{
						System.out.println("\n não existe no meu estoque!!!");
					}
					break;
				case 3:
					leia.nextLine();
					System.out.println("\nQual sera o produto que quer atualizar: ");
					String verifica = leia.nextLine();
					System.out.println("\nnome do produto que entrará no lugar de "+verifica+": ");
					String novo = leia.nextLine();
					if(estoque.contains(verifica))
					{
						estoque.remove(verifica);
						estoque.add(novo);
					}
					else
					{
						System.out.println("\nnão existe no meu estoque!!!");
					}
					break;
				case 4:
					System.out.println("\nMostrando os produtos do estoque...");
					System.out.println(estoque);
					break;
					default:
						System.out.println("\nFinalizou o programa...");
					
				}
			}while(x!=0);
		}

	}
