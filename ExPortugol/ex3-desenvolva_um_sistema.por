programa
{
	inclua biblioteca Matematica-->mat
	funcao inicio()
	{
		real a,b,c,d,r1,r2,r3,r4

		escreva("Digite um numero a : ")
		leia(a)
		
		escreva("Digite um numero b : ")
		leia(b)
		
		escreva("Digite um numero c : ")
		leia(c)
		
		escreva("Digite um numero d : ")
		leia(d)

		r1=mat.potencia(a,2)
		r2=mat.potencia(b,2)
		r3=mat.potencia(c,2)
		r4=mat.potencia(d,2)

		se(r3>=1000){
			escreva("esse é o valor ao quadrado de c ",r3)
		}
		senao{
			escreva("\nesse é o valor ao quadrado de a ",r1)
			escreva("\nesse é o valor ao quadrado de b ",r2)
			escreva("\nesse é o valor ao quadrado de c ",r3)
			escreva("\nesse é o valor ao quadrado de d ",r4)
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 679; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */