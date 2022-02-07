package br.com.generation.healthyday;

import java.util.Scanner;

public class CalculadoraHealthyDay {

	public static void main(String[] args) throws InterruptedException {

		//Inserindo Scanner
		Scanner leia = new Scanner(System.in);
		
		//Declarando vari�veis
		String nome = "";
		int idade = 0;
		int sexo = 0;
		double peso = 0.0;
		double altura = 0;
		int qtdeAgua = 0;
		int qtdeRefeicoes = 0;
		int objetivo = 0;
		int ativFisica = 0;
		double imc = 0.0;
		double tmb = 0.0;
		double tdee = 0.0;
		double tdeeFinal = 0.0;
		int aguaNecessaria = 0;
		int aguaRestante = 0;
		
		//Chamando objeto
		Pessoa p = new Pessoa (nome, idade, sexo, peso, altura, qtdeAgua, qtdeRefeicoes, objetivo, ativFisica, imc, tmb, tdee, tdeeFinal, aguaNecessaria, aguaRestante);
		
		
		//In�cio da entrada de dados
		System.out.println("===================================================");
		System.out.println("============                           ============");
		System.out.println("============        HEALTHY DAY        ============");
		System.out.println("============                           ============");
		System.out.println("===================================================");
		System.out.print("Nome: ");
		nome = leia.next();
		p.setNome(nome);
		
		System.out.println("Sexo \n[1] Feminino \n[2] Masculino ");
		sexo = leia.nextInt();
		while (sexo != 1 & sexo != 2) {
			System.out.println("Valor inv�lido! Escolha entre: \n[1] Feminino ou \n[2] Masculino ");
			sexo = leia.nextInt();
		}
		p.setSexo(sexo);
		
		System.out.print("Idade: ");
		idade = leia.nextInt();
		p.setIdade(idade);
		
		System.out.print("Altura [cm]: ");
		altura = leia.nextInt();
		p.setAltura(altura);
		
		System.out.print("Peso [kg]: ");
		peso = leia.nextInt();
		p.setPeso(peso);
		
		System.out.println("Qual seu n�vel de Atividade F�sica? \n[1] Leve (sedent�rio, pouco movimento) \n[2] Moderado (3 a 5x/semana) \n[3] Intenso (2x por dia)  ");
		ativFisica = leia.nextInt();
		while (ativFisica < 1 || ativFisica > 3) {
			System.out.println("Valor inv�lido! Escolha entre: \n[1] Leve (sedent�rio, pouco movimento) \n[2] Moderado (3 a 5x/semana) \n[3] Intenso (2x por dia)  ");
			ativFisica = leia.nextInt();
		}
		p.setAtivFisica(ativFisica);
		
		System.out.println("Qual seu objetivo? \n[1] Perder peso \n[2] Manter Peso \n[3] Ganhar peso ");
		objetivo = leia.nextInt();
		while (objetivo < 1 || objetivo > 3) {
			System.out.println("Valor inv�lido! Escolha entre: \n[1] Perder peso \n[2] Manter o peso \n[3] Ganhar peso ");
			objetivo = leia.nextInt();
		}
		p.setObjetivo(objetivo);
		
		System.out.print("Qual a quantidade aproximada de �gua que voc� bebe por dia em [ml]? \nEx.: 2 litros equilavem a 2000 ml | 1 copo de requeij�o = 200 ml: ");
		qtdeAgua = leia.nextInt();
		p.setQtdeAgua(qtdeAgua);
		
		System.out.print("Quantas refei��es voc� faz por dia, normalmente? ");
		qtdeRefeicoes = leia.nextInt();
		p.setQtdeRefeicoes(qtdeRefeicoes);
		
		//C�lculo IMC
		imc = p.calcularImc(peso, altura);
		p.setImc(imc);
		
		//C�lculo TMB
		if (sexo == 1) {
			tmb = p.calcularTmbFeminino(peso, altura, idade);
			p.setTmb(tmb);
		}
		else if (sexo == 2) {
			tmb = p.calcularTmbMasculino(peso, altura, idade);
			p.setTmb(tmb);
		}
		
		//C�lculo TDEE
		if (ativFisica == 1) {
			tdee = p.calcularTdeeLeve(tmb);
			p.setTdee(tdee);
		}
		else if (ativFisica == 2) {
			tdee = p.calcularTdeeModerado(tmb);
			p.setTdee(tdee);
		}
		else if (ativFisica == 3) {
			tdee = p.calcularTdeeIntenso(tmb);
			p.setTdee(tdee);
		}
		
		//C�lculo TDEE Final
		if (objetivo == 1) {
			tdeeFinal = p.calcularTdeeFinalPerderPeso(tdee);
			p.setTdeeFinal(tdeeFinal);
		}
		else if (objetivo == 2) {
			tdeeFinal = tdee;
			p.setTdeeFinal(tdeeFinal);
		}
		else if (objetivo == 3) {
			tdeeFinal = p.calcularTdeeFinalGanharPeso(tdee);
			p.setTdeeFinal(tdeeFinal);
		}
		
		//C�lculo consumo de �gua
		aguaNecessaria = (int) p.calcularAgua(peso);
		p.setAguaNecessaria(aguaNecessaria);
		
		aguaRestante = (int) p.calcularAguaRestante(qtdeAgua, aguaNecessaria);
		p.setAguaRestante(aguaRestante);
		
		//Relat�rio
		Thread.sleep(1000);
		System.out.println();
		System.out.println("====================================================================================================================");
		System.out.println();
		System.out.println("SEUS RESULTADOS:");
		System.out.println();
		System.out.println("====================================================================================================================");
		System.out.println();
		
		if (p.getSexo() == 1) {
			System.out.println("Nome: " + p.getNome() + ", " + p.getIdade() + " anos, feminino");
		}
		else {
			System.out.println("Nome: " + p.getNome() + ", " + p.getIdade() + " anos, masculino");
		}
		System.out.println("Peso: " + p.getPeso() + " kg | Altura: " + p.getAltura() + " cm");
		
		System.out.println();
		
		if (p.getObjetivo() == 1) {
			System.out.println("Objetivo: PERDER PESO");
		}
		else if (p.getObjetivo() == 2) {
			System.out.println("Objetivo: MANTER PESO");
		}
		else if (p.getObjetivo() == 3) {
			System.out.println("Objetivo: GANHAR PESO");
		}
		
		if (p.getAtivFisica() == 1) {
			System.out.println("N�vel de atividade: LEVE");
		}
		else if (p.getAtivFisica() == 2) {
			System.out.println("N�vel de atividade: MODERADO");
		}
		else if (p.getAtivFisica() == 3) {
			System.out.println("N�vel de atividade: INTENSO");
		}
		
		System.out.println("====================================================================================================================");
		System.out.println();
		Thread.sleep(1000);
		
		if (p.getImc() < 18.5) {
			System.out.printf("Seu �ndice de Massa Corporal (IMC) � %.2f" , p.getImc());
			System.out.println(" kg/m2. Esse valor est� na faixa de MAGREZA (abaixo de 18,5 kg/m2).");
		}
		else if (p.getImc() >= 18.5 & p.getImc() <= 24.9) {
			System.out.printf("Seu �ndice de Massa Corporal (IMC) � %.2f" , p.getImc());
			System.out.println(" kg/m2. Esse valor est� na faixa considerada NORMAL (entre 18,5 e 24,9 kg/m2).");
		}
		else if (p.getImc() > 25 & p.getImc() <= 29.9) {
			System.out.printf("Seu �ndice de Massa Corporal (IMC) � %.2f" , p.getImc());
			System.out.println(" kg/m2. Esse valor est� na faixa de SOBREPESO (entre 25 e 29,9 kg/m2).");
		}
		else {
			System.out.printf("Seu �ndice de Massa Corporal (IMC) � %.2f" , p.getImc());
			System.out.println(" kg/m2. Esse valor est� na faixa de OBESIDADE (acima de 30 kg/m2).");
		}
		
		System.out.println();
		
		System.out.println("� Taxa Metab�lica Basal (TMB) �: " + p.getTmb() + " kcal");
		System.out.println("� Gasto Cal�rico Total Di�rio (TDEE): " + p.getTdee() + " kcal");
		
		System.out.println();
		
		if (p.getObjetivo() == 1) {
			
			System.out.println("� Como seu objetivo � PERDER PESO, voc� deve diminuir seu Gasto Cal�rico Di�rio (TDEE) para " + p.getTdeeFinal() + " kcal.");
	
			if (p.getImc() < 18.5) {
				System.out.println("OBS: Seu �ndice de Massa Corporal (IMC) indicou MAGREZA. Recomendamos a busca por uma profissional para melhor acompanhamento.");
			}
			
		}
		else if (p.getObjetivo() == 2) {
			
			System.out.println("� Como seu objetivo � MANTER O PESO, voc� deve manter seu Gasto Cal�rico Di�rio (TDEE) em " + p.getTdeeFinal() + " kcal.");
		
		}
		else if (p.getObjetivo() == 3) {

			System.out.println("� Como seu objetivo � GANHAR PESO, voc� deve aumentar seu Gasto Cal�rico Di�rio (TDEE) para " + p.getTdeeFinal() + " kcal.");
			
			if (p.getImc() > 30){
				System.out.println("OBS: Seu �ndice de Massa Corporal (IMC) indicou OBESIDADE. Recomendamos a busca por uma profissional para melhor acompanhamento.");
			}
			
		}
		
		System.out.println();
		
		if (p.getQtdeAgua() < p.getAguaNecessaria()) {
			System.out.println("� Sua quantidade di�ria de consumo de �gua � de " + p.getQtdeAgua() + " ml. A quantidade recomendada para voc� � de " + p.getAguaNecessaria() + " ml, portanto tente beber mais " + p.getAguaRestante() + " ml todos os dias.");
		}
		else {
			System.out.println("� Sua quantidade di�ria de consumo de �gua � de " + p.getQtdeAgua() + " ml. Seu consumo est� dentro do recomendado para voc�, que � de " + p.getAguaNecessaria() + " ml. Continue assim!");
		}
		
		System.out.println();
		
		if (p.getQtdeRefeicoes() > 6) {
			System.out.println("� Voc� faz " + p.getQtdeRefeicoes() + " refei��es por dia, o que est� ACIMA do recomendado (5 a 6 refei��es).");
		}
		else if (p.getQtdeRefeicoes() >= 5) {
			System.out.println("� Voc� faz " + p.getQtdeRefeicoes() + " refei��es por dia, o que est� DENTRO do recomendado (5 a 6 refei��es).");
		}
		else {
			System.out.println("� Voc� faz " + p.getQtdeRefeicoes() + " refei��es por dia, o que est� ABAIXO do recomendado (5 a 6 refei��es).");
		}
		
		System.out.println("====================================================================================================================");
		System.out.println();
		Thread.sleep(1000);
		
		System.out.println("DEZ PASSOS PARA UMA ALIMENTA��O ADEQUADA E SAUD�VEL:\n"
				+ "1.  Fazer de alimentos in natura ou minimamente processados a base da alimenta��o\n"
				+ "2.  Utilizar �leos, gorduras, sal e a��car em pequenas quantidades ao temperar e cozinhar alimentos e criar prepara��es culin�rias\n"
				+ "3.  Limitar o consumo de alimentos processados\n"
				+ "4.  Evitar o consumo de alimentos ultraprocessados\n"
				+ "5.  Comer com regularidade e aten��o, em ambientes apropriados e, sempre que poss�vel, com companhia\n"
				+ "6.  Fazer compras em locais que ofertem variedades de alimentos in natura ou minimamente processados\n"
				+ "7.  Desenvolver, exercitar e partilhar habilidades culin�rias\n"
				+ "8.  Planejar o uso do tempo para dar � alimenta��o o espa�o que ela merece\n"
				+ "9.  Dar prefer�ncia, quando fora de casa, a locais que servem refei��es feitas na hora\n"
				+ "10. Ser cr�tico quanto a informa��es, orienta��es e mensagens sobre alimenta��o veiculadas em propagandas comerciais\n"
				+ "\n"
				+ "Fonte: Guia Alimentar Para a Popula��o Brasileira (Minist�rio da Sa�de, 2014).\n"
				+ "Dispon�vel em: http://bvsms.saude.gov.br/bvs/publicacoes/guia_alimentar_populacao_brasileira_2ed.pdf");
		
		System.out.println("====================================================================================================================");
		Thread.sleep(1000);
		System.out.println("\nPara informa��es mais precisas e acompanhamento adequado, procure profissionais da sa�de.");
		System.out.println("====================================================================================================================");
		System.out.println("\nObrigado por utilizar o HEALTHY DAY!");
		System.out.println("Generation, 2022");
		System.out.println();
		
		leia.close();

	}

}

