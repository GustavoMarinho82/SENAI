/* 
01 - Faça um programa que receba um número e exiba a função 
do colaborador, de acordo com a escolha do usuário.	

Cod | Função
01   Administrador
02   Suporte
03   Coordenador
04   Técnico

*/

programa 
{ 	 	
	
	funcao inicio()
	{
		
		inteiro Cod
		 		
			escreva("Descubra a Função pelo Código \n") 			
			escreva("Digite o código \n")
				leia(Cod) 	

					
			escreva("\n", "A função é: ") 
				
		se 	    (Cod==1) 	{escreva("Administrador")} 
		senao se (Cod==2)   {escreva("Suporte")} 	
		senao se (Cod==3)   {escreva("Coordenador")} 	
		senao se (Cod==4)   {escreva("Técnico")} 		
		senao 			{escreva("ERRO")} 		
		
			escreva("\n") 		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 194; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */