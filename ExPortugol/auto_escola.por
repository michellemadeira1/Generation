programa
{
	
	funcao inicio()
	{
		cadeia nome
		inteiro idade
		real cpf
		caracter resposta

		          escreva("Nome: ")
		          leia(nome)

		          escreva("Idade: ")
		          leia(idade)

		se (idade >= 18) {

			       escreva("Legal, vamos continuar !\n")
			       
			       escreva("\nCPF [ apenas numeros]\n")
			       leia(cpf)
			       
			       escreva("\nDigite seu email:\n ")
			       leia(nome)

			       escreva("\nDigite seu número de telefone [ apenas números]:\n")
			       leia(resposta)
			       
		            escreva(" \nInscrição concluida com sucesso")
		}

		senao se (idade>=16) {
			       escreva(" você tem autorização? [s | n]: ")
			       leia(resposta)

			se (resposta == 's') {
				
			       escreva(" Vamos prosseguir anexando a documentação. [s | n]:\n ")
                      leia(resposta)
                      escreva(" inscrição concluida com sucesso...Logo entraremos em contato")

               se (resposta == 'n')
                      escreva(" Não podemos continuar..")
		}
		
		
		
		 
}
          

	}
}
	
	
	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1060; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */