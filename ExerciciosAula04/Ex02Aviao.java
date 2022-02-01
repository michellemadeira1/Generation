package ExerciciosAula04;

//2- Crie uma classe e apresente os atributos e metodos referente esta classe , 
// em seguida crie um objeto aviao, defina as instancias deste objeto e apresente
// as informacoes no console.

public class Ex02Aviao {
    String nome;
    String aviao;
    int poltrona;
    int horario;
   
    
    void banco() {
    	System.out.println(" O numero da sua poltrona e:   " + poltrona);
    }
    
    void hora() {
    	System.out.println(" Horario de embarque:   " + horario);
    }
    void nom() {
    	System.out.println(" Nome passageiro:   " + nome);
    }
    void avi() {
    	System.out.println(" Marca aviao:  " + aviao);
    }
}
