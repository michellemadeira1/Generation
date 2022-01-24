programa
{

// matriz em codigo matriz 3:3

	
	funcao inicio()
	{
           inteiro matriz [3] [3], linha, coluna // aqui eu defino a quantidade de colunas e linhas que eu quero linha primeiro e coluna depois 
           
           
           para (linha=0; linha<3; linha++) {// para preencher a linha


           	para (coluna=0; coluna<3; coluna++){ // esse preenche a coluna 
           	
           	escreva ("Posicao [", linha, "] [ ",coluna," ]: ")  // vai mostra a linha e coluna pro usuario o valor que sera atribuido na matriz
           	leia(matriz[linha] [coluna])
           	
           	}
           }
           
               limpa()

               para(linha=0; linha<3; linha++) {
               	para(coluna=0; coluna<3; coluna++)

               	  escreva("{" , matriz[linha] [coluna], "}" ) 
               	
               }
            
		        escreva("\n")//? onde entra esse escreva?
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 925; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */