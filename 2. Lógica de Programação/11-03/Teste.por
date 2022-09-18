programa
{
	
	funcao inicio()
	{
		inteiro Matriz[3][2]= {   {2,2}, {2,2}, {2,2}   }

		inteiro R=1

		para(inteiro x=0; x<3; x++){
			para(inteiro y=0; y<2; y++){
				
			R*=Matriz[x][y]
			escreva(R, "\n")}}

		escreva("\n")
		escreva("Resultado: ", R, "\n")

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 242; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */