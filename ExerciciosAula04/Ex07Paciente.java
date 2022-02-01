package ExerciciosAula04;

//7) Crie uma classe paciente e apresente os atributos e métodos referentes esta 
//classe, em seguida crie um objeto paciente, defina as instancias deste objeto e 
//apresente as informações deste objeto no console.






public class Ex07Paciente {
   String nome;
   String sex;
   String hosp;
   String medi;
   String plan;
   double data;
   double carte;
   
   void n() {
	   System.out.println(" Nome Paciente: " + nome);
   }
   void se() {
	   System.out.println(" Sexo: " + sex);
   }
   void h() {
	   System.out.println(" Hospital: " + hosp);
   }
   void m() {
	   System.out.println(" Nome do Medico: " + medi);
   }
   void p() {
	   System.out.println(" Plano do paciente: " + plan);
   }
   void da() {
	   System.out.println(" Data de Nascimento: " + data);
   }
   void ca() {
	   System.out.println(" Numero da Carteirinha: " + carte);
   }
}
