programa
{
	
	funcao inicio()
	{
	inteiro m, n, Soma=0
		
		escreva("Descubra a Soma dos Números entre Dois Números Positivos \n")
		escreva("Digite o número maior \n")
			leia(m)
		escreva("Digite o número menor \n")
			leia(n)
		
		m--
		para (m;m>n;m--) 
		{Soma+=m}


		escreva("\n")
		escreva("A Soma é: ", Soma)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 334; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {m, 6, 9, 1}-{n, 6, 12, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */