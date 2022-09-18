programa
{
	
	funcao inicio()
	{
	real n
	
		escreva("Descubra se o Número é Positivo ou Negativo \n",
			   "0-Negativo | 1- Positivo \n \n")

		escreva("Digite o número \n")
			leia(n)
		
		escreva("\n", Pos(n))

	}

////////////////////////////////////
	
	funcao inteiro Pos(real n)
	{
		se (n>=0) {retorne 1}
		senao     {retorne 0}

	}
} 
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 343; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */