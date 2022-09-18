programa
{
	
	funcao inicio()
	{
		inteiro  A[5] = {0, 0, 0, 0, 0},
			    B[5] = {0, 0, 0, 0, 0},
			 Soma[5] = {0, 0, 0, 0, 0}

	
		para(inteiro x=0; x<5; x++){
			escreva("Vetor A | Coluna: ", x+1, "\n")
			escreva("Digite o valor \n")
				leia(A[x])
		}

		escreva("\n")
		
		para(inteiro x=0; x<5; x++){
			escreva("Vetor B | Coluna: ", x+1, "\n")
			escreva("Digite o valor \n")
				leia(B[x])
			
		}

		escreva("\n \n", "Vetor Soma: \n \n", "| ")
		
		para(inteiro x=0; x<5; x++){
			Soma[x]= A[x] + B[x]
			escreva(Soma[x], " | ")
			
		}
		
		escreva("\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 574; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {Soma, 8, 4, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */