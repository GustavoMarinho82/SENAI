programa
{
	
	funcao inicio()
	{				 //  0, 1,  2,  3, 4
		inteiro Vetor[5] = {1 ,2, 000, 4, 5}

		escreva("Antigo indice 2: ", Vetor[2])
			escreva("\n")

		Vetor[2]= 3
		escreva("Novo indice 2: ", Vetor[2])
			escreva("\n \n")

		   // Inicializou a variavel; número de vezes que vai acontecer; x++ 
		para(inteiro x=0; x<5; x++){
			escreva("Indice ", x, ": ", Vetor[x])
				escreva("\n")}


		cadeia Nome[4] = {"Gustavo","Ornelas","Marinho","Pazeli"}

		escreva("\n \nNome: \n")
		para(inteiro y=0; y<4; y++){
			escreva(Nome[y], " ")}

			
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 563; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */