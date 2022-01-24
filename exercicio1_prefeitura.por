programa
{
	

	
	funcao inicio()
	{

          real  s=0.0,f,m=0.0,mf=0.0,maiors=0.0,porcen,sf=0,ss=0
		inteiro x,cont=0,y=0,conts=0
		
		escreva("quantos habitantes:  ")
		leia(x)
		
		para(y=1;y<=x;y++){

			escreva("habitante:",y)
			escreva("\nqual o seu salario: ")
			leia(s)
			escreva("quantos filhos: ")
			leia(f)

			
			se(maiors<s){
				maiors=s
			}
			se(s<=100){
				
				conts++
			}
			
			
			sf=sf+f
			ss=ss+s
			cont++
			
		}
		       
		       porcen=(conts*100.0)/cont
		       mf=sf/cont
		       m=ss/cont
		
		      escreva("\n a media do salario dos habitantes é: ",m)
		      escreva("\n a media de filhos dos habitantes é: ",mf)
		      escreva("\n o maior salario é: ",maiors)
		      escreva("\npercentual de pessoas com salário até R$100,00: ",porcen,"%")

	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 14; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */