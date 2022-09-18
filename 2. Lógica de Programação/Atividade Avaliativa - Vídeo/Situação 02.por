/*
02 - Faça um programa que receba o salário de um funcionário, 
calcule e mostre o novo salário, acrescido da bonificação e 
do auxilio escolar.

Salário     |  Bonificação                 Salário  |  Auxilio

~1100             12%                       ~1100       150
1100 - 2200       5%                        1100~       100
2200~           Nenhuma

*/


programa
{
	
	funcao inicio()
	{
		
		real s
	
			escreva("Digite o seu salário \n")
				leia(s)

			escreva("\n")

			
		se (s<=1100) {
			escreva("Seu novo salário é: R$", s*1.12,
				   "\n", "E seu auxilio é de R$150,00")}
				   
		senao se (s>1100 e s<=2200) {
			escreva("Seu novo salário é: R$", s*1.05,
				   "\n", "E seu auxilio é de R$100,00")}
				   
		senao {
			escreva("Você não recebeu nenhuma bonificação", 
				   "\n", "E seu auxilio é de R$100,00")}


			escreva("\n")		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 814; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */