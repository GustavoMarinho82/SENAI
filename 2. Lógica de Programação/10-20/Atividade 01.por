programa
{
	
	funcao inicio()
	{
	
	real s
	caracter p

		escreva("Descubra seu Novo Salário \n")
		escreva("Digite o seu plano de trabalho (em maiusculo)\n")
			leia(p)
		escreva("Digite o seu salário \n")
			leia(s)

		escreva("\n")

		escolha(p){
			caso 'A':
				escreva("Seu novo salário é: R$", s*1.10)
			pare
			caso 'B':
				escreva("Seu novo salário é: R$", s*1.15)
			pare
			caso 'C':
				escreva("Seu novo salário é: R$", s*1.20)

			caso contrario: 
				escreva("Plano inválido")
			}

		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 447; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */