programa
{
	 
	funcao inicio()
	{
	inteiro n
	
		escreva("Descubra o Fatorial de um Número \n")
		escreva("Digite o número \n")
			leia(n)

		escreva("\n", "Fatorial: ", Fatorial(n))
	}

/////////////////////////////////////////////////////
  
	funcao inteiro Fatorial(inteiro n)
	{
	inteiro fator=1

		para(inteiro x=1; x<=n; x++){
			fator*=x}

		retorne (fator)
	
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 247; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */