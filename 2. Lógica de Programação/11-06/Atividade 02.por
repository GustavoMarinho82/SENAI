programa
{
	
	funcao inicio()
	{
	inteiro v1, v2
	
		escreva("Descubrea Soma dos Valores entre Dois Números \n")
		
		escreva("Digite o 1° valor \n")
			leia(v1)
		escreva("Digite o 2° valor \n")
			leia(v2)
			
		
		se (v1>0 e v2>0){
			escreva ("\n", "Soma dos Valores: ", SomaInterno(v1, v2))}
		senao {
			escreva ("\n", "ERRO - Insira valores positivos")}

		escreva("\n")
	}

////////////////////////////////////////////////////////

	funcao inteiro SomaInterno(inteiro v1, inteiro v2) 
	{
	inteiro Soma=0
	
		para(v1=v1+1; v1<v2; v1++) {

		Soma+= v1
			escreva("Número: ", v1, " | ",
				   "Soma: ", Soma, "\n")
			
			}
		retorne (Soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 82; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */