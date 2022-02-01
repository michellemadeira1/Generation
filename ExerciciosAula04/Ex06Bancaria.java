package ExerciciosAula04;

//6) Crie uma classe conta bancaria e apresente os atributos e métodos 
// esta classe, em seguida crie um objeto conta bancaria, defina as instancias
//deste objeto e apresente as informações deste objeto no console.


public class Ex06Bancaria {

	 String nome;
	 String ba;
	 double cpf;
	 double conta;
	 double agencia;
	 double telefone;
	 
	 void no() {
		 System.out.println(" Nome Cliente: "  + nome);
	 }
	 void b() {
		 System.out.println(" Nome Banco: " + ba);
	 }
	 void cp() {
		 System.out.println(" CPF: " + conta );
	 }
	 void con() { 
		 System.out.println(" Numero Conta: " + conta);
	 }
	 void ag() {
		 System.out.println(" Numero Agencia: " + agencia);
	 }
	 void t() {
		 System.out.println(" Numero de telefone: " + telefone);
	 }
}
