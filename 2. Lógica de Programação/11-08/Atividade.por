programa
{
	
	funcao inicio()
	{
	inteiro idade

		escreva("Veja a categoria do lutador \n")
		escreva("Digite a idade do lutador \n")
			leia(idade)

		escreva("\n", Categoria(idade))
	}


/////////////////////////////////////////////////////////

	funcao cadeia Categoria(inteiro idade)
	{
		se 	    (idade>=5)    {retorne "Infantil A"}
		senao se (idade>=8)    {retorne "Infantil B"}
		senao se (idade>=11)   {retorne "Juvenil A"}
		senao se (idade>=14)   {retorne "Juvenil B"}
		senao se (idade>=18)   {retorne "Adulto"}
		senao 			   {retorne "ERRO"}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 560; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */