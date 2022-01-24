programa
{
	
	funcao inicio()
	{
		
		cadeia nomes [3]
          inteiro cont
          
		para ( cont=0; cont<3; cont++) {

           escreva( cont+1 , "Nome:   ") // cont +1 e so para mostrar para o usuario e nao influencia no respo por tanto nao precisa ter se nao quiser
           leia (nomes[cont])
			
		}

		para (cont=0; cont<3; cont++){// ultilizar so para mostrar os nomes 

          escreva (nomes[cont], ".")
          
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 392; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */