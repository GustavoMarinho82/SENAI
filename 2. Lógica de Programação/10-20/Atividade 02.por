programa
{
	
	funcao inicio()
	{
	
	inteiro c

		escreva("Descubra o Preço do Lanche \n")
		escreva("Digite o código do lanche \n")
			leia(c)

		escreva("\n")
		
		escolha(c){
			caso 100:
				escreva("Seu lanche é: Cachorro-Quente \n", "Preço: R$1,20")
			pare
			caso 101:
				escreva("Seu lanche é: Cheeseburger \n", "Preço: R$1,30")
			pare
			caso 102:
				escreva("Seu lanche é: Refrigerante \n", "Preço: R$2,00")
			pare
			caso 103:
				escreva("Seu lanche é: Hambúrger \n", "Preço: R$1,00")
			pare

			caso contrario: 
				escreva("Código inválido")
			}

			escreva("\n")

	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 252; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */