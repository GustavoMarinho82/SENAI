programa
{
	
	funcao inicio()
	{
	real hora
	real Salario_B, imposto, Salario_F
	
		escreva("Descubra seu Salário Decrescido do Imposto \n")
		escreva("Digite o n° de horas trabalhadas \n")
			leia(hora)

 
		Salario_B  =  Salario_Bruto(hora)
		imposto    =  Imposto(Salario_B)
		Salario_F  =  Salario_Final(Salario_B, imposto)

		
		escreva("\n")
			
		escreva("Salário bruto: R$", Salario_B, "\n",
			   "Imposto: R$", imposto, "\n", "\n",
			   "Salário final: R$", Salario_F, "\n", "\n")
	}

//////////////////////////////////////////////

funcao real Salario_Bruto(real hora){
	
	real Salario_B
		
		Salario_B = hora * 36.30
		retorne (Salario_B)
	}


funcao real Imposto(real Salario_B){
	
	real imposto

		imposto=Salario_B*0.03
		retorne(imposto)
	}


funcao real Salario_Final(real Salario_B, real imposto){
	
	real Salario_F

		Salario_F = Salario_B - imposto
		retorne (Salario_F)
	
	}

	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 909; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */