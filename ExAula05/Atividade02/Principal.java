package Atividade02;

public class Principal {

	// 2 - Implemente um programa que crie os 3 tipos de animais definidos no exercício 
	//anterior e invoque o método que emite o som de cada um de forma polimórfica, 
	//isto é, independente do tipo de animal.

	
	
	public static void main(String[] args) {
		
          Cachorro ca = new Cachorro();
          Cavalo cav = new Cavalo();
          Preguica pe = new Preguica();
          System.out.println(" Som cachorro: ");
          somCachorro(ca);
          System.out.println(" Som cavalo: ");
          somCachorro(cav);
          System.out.println(" Som preguica: ");
          somCachorro(pe);
	}
        
	 
	static void somCachorro( Cachorro cach) {
		System.out.println(cach.som());
		
	}
}
