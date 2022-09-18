programa
{
	
	funcao inicio()
	{
		inteiro v1 [5] = {1, 2, 3, 4, 5}
		inteiro v2 [5] = {1, 6, 7, 8, 5}
		
		inteiro soma=0, igual=0

		para(inteiro x=0; x<5; x++) {
			
			se (v1[x] == v2[x]) {
				igual++}
				
			senao {
				soma+= (v1[x] + v2[x])}
			
			} 

		escreva("Soma dos n° diferentes: ", soma, "\n",
			   "Coordenadas iguais: ", igual, "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 237; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {v1, 6, 10, 2}-{v2, 7, 10, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */