programa
{
	
	funcao inicio()
	{
	
	inteiro c
	real s, n

		escreva("Descubra seu Novo Salário \n")
		escreva("Digite o código do seu cargo \n")
			leia(c)
		escreva("Digite o seu salário \n")
			leia(s)

		escreva("\n")
		
		escolha(c){
			caso 101:
				n=s*1.05
				pare
			caso 102:
				n=s*1.07
				pare
			caso 103:
				n=s*1.10
				pare

			caso contrario:
				n=s*1.15
		}
			
		escreva("Seu antigo salário é: R$", s, "\n")
		escreva("Seu novo salário é: R$", n, "\n")
		escreva("Você recebeu um aumento de: R$", n-s, "\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 538; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */