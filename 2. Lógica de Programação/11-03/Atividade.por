programa
{
	
	funcao inicio()
	{
		inteiro Matriz[3][4]= {   {0,0,0,0}, {0,0,0,0}, {0,0,0,0}   }


		para(inteiro x=0; x<3; x++){
			para(inteiro y=0; y<4; y++){

	
		escreva("Linha: ", x+1, " | Coluna: ", y+1)
			escreva("\n")
		
		escreva("Digite o valor \n")
			leia(Matriz[x][y])
		
		escreva("\n")		}}



		para(inteiro x=0; x<3; x++){
			para(inteiro y=0; y<4; y++){

			
		se (Matriz[x][y]<0) {Matriz[x][y]=0}
		
		escreva(Matriz[x][y], " | ")
		
		} escreva("\n")	}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 478; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */