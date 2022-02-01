package Atividade01;

public class TesteTodosA {
	
	
	//1- Crie uma hierarquia de classes conforme abaixo com os seguintes atributos 
	//e comportamentos (observe a tabela), utilize os seus conhecimentos e distribua 
	//as características de forma que tudo o que for comum a todos os animais fique na classe Animal: 


	public static void main(String[] args) {
		
	Animal ca = new Animal();
	 
	ca.setNome(" cavalo, cachorro, preguica");
	ca.setSom(" sim ");
	ca.setIdade(20);
	ca.setCorrer(" cavalo e cachorro");
	ca.setSubir(" Preguica ");
		
	
	System.out.println(" Nome dos animais: " + ca.getNome());
	System.out.println(" Eles emitem som ? " + ca.getSom());
	System.out.println(" A idade deles e : " + ca.getIdade());
	System.out.println(" Animais que correm : " + ca.getCorrer());
	System.out.println(" Animal que sobe em arvores: " + ca.getSubir());
	
	

	}

}
