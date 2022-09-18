/*  2 – Utilizando o Para / For, faça um programa que leia
duas notas de 6 alunos, calcule e mostre:
a) A média aritmética das duas notas de cada aluno:
b) Verifique situação da nota e escreva.
	<3 [ Reprovado ]
	>=3 e <7 [Recuperação]
	>7 [Aprovado]
c) O total de alunos aprovados
d) O total de alunos de Recuperação
d) O total de Alunos reprovados
e) A média da Classe  */

programa
{
	
	funcao inicio()
	{
	real n1, n2, media, mediaClasse=0.0
	
	inteiro qtd=1
	inteiro TRepr=0, TRecu=0, TApro=0



	para(inteiro x=1;x<=6;x++) {
		escreva("Digite a nota 1 do ", qtd, "° aluno \n")
			leia(n1)
		escreva("Digite a nota 2 do ", qtd, "° aluno \n")
			leia(n2)

	media = (n1+n2)/2


		escreva ("\n","O ", qtd, "° aluno está: ")

	se (media<3){escreva("Reprovado")                    TRepr++}
		senao se (media<7){escreva("em Recuperação")    TRecu++}
			senao {escreva("Aprovado")                 TApro++}
			
		escreva("\n", "\n", "\n")
		qtd++
		mediaClasse+=media
		
		}

	escreva("Total de Aprovados: ", TApro, "\n")
	escreva("Total de Recuperação: ", TRecu, "\n")
	escreva("Total de Reprovados: ", TRepr, "\n", "\n")

	mediaClasse/=(qtd-1)
	escreva("A média da Classe foi de: ", mediaClasse, "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1142; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */