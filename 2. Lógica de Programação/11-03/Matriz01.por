programa
{
	
	funcao inicio()
	{
						  //  0     1
		inteiro Matriz[2][2]= { {2,5},{7,10} }

		escreva(Matriz[0][0])
			escreva("   ")
		escreva(Matriz[0][1])
				escreva("\n")
		escreva(Matriz[1][0])
			escreva("   ")
		escreva(Matriz[1][1])
				escreva("\n \n-----------------\n \n")

		
		para(inteiro lin=0; lin<2; lin++){
			para(inteiro col=0; col<2; col++){
				
		escreva(lin," e ", col, "= ")
			escreva(Matriz[lin][col], "\n")
			
		}}	

		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 452; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */