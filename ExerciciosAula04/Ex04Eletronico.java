package ExerciciosAula04;
// 4-Crie uma classe produto eletr�nico e apresente os atributos e m�todos referentes 
//esta classe, em seguida crie um objeto produto eletr�nico, defina as instancias
//deste objeto e apresente as informa��es deste objeto no console.


public class Ex04Eletronico {

	String nome;
	String marca;
	String modelo;
	String cor;
	int anofabri; 
	
	void no() {
		System.out.println(" Nome do produto: " + nome);
	}
	void ma() {
		System.out.println(" Marca do produto: " + marca);
	}
	void co() {
		System.out.println(" Cor do produto: " + cor);
	}
	void an() {
		System.out.println(" Ano de fabrica��o: " + anofabri);
	}
	void mo() {
		System.out.println("Modelo do produto: " + modelo);
	}
}
