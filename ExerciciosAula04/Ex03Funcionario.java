package ExerciciosAula04;

//3) Crie uma classe funcionário e apresente os atributos e métodos referentes esta
//classe, em seguida crie um objeto funcionário, defina as instancias deste objeto e 
//apresente as informações deste objeto no console.

 

public class Ex03Funcionario {

	 String nome ;
	 String setor;
	 int maquina;
	 int entrada;
	 int saida;
	 

	 
	 
	 void nom() {
		 System.out.println(" Nome funcionario: " + nome);
	 }
	 void seto() {
		 System.out.println(" Setor: " + setor);
	 }
	 void maq() {
		 System.out.println(" Numero da maquina: " + maquina);
	 }
	 void ent() {
		 System.out.println(" Horario de entrada: " + entrada);
	 }
	  void sai() {
		  System.out.println(" Horario de saida: " + saida);
	  }
	 }
