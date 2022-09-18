programa
{
	
	funcao inicio()
	{
		inteiro Valor[4][2]= { 	{1,2},
							{3,4},
							{5,6},
							{7,8}	 }
		inteiro Soma=0

		para(inteiro x=0; x<4; x++){
			para(inteiro y=0; y<2; y++){
			
			escreva(Valor[x][y], "\n")
			Soma+=Valor[x][y]
			
		}}
		escreva(Soma)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 154; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */