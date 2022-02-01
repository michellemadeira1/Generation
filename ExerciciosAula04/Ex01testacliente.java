package ExerciciosAula04;

public class Ex01testacliente {

	public static  void main(String[] args) {
		
		Ex01Cliente cli = new Ex01Cliente();
		
		cli.nome = " Luana";
		
		cli.email = " lana.lulu.gmail";
		cli.sorte= 239856;
		cli.valorCompra = 200;
		
		System.out.println(cli.nome);
		System.out.println(cli.email);
	    cli.compras();
		cli.sorte();
		

	}

}
