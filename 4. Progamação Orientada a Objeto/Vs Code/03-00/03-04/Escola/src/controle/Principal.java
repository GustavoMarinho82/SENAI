package controle;

import java.util.List;

import negocio.AlunoNegocio;
import entity.Aluno;
import persistence.AlunoDao;

import negocio.ProfessorNegocio;
import entity.Professor;
import persistence.ProfessorDao;

import negocio.TurmaNegocio;
import entity.Turma;
import persistence.TurmaDao;

public class Principal {
    public static void main(String[] args) {

        try {
            AlunoNegocio an = new AlunoNegocio();
            Aluno a = new Aluno();
            AlunoDao ad = new AlunoDao();

            ProfessorNegocio pn = new ProfessorNegocio();
            Professor p = new Professor();
            ProfessorDao pd = new ProfessorDao();

            TurmaNegocio tn = new TurmaNegocio();
            Turma t = new Turma();
            TurmaDao td = new TurmaDao();

            int opc;

            do {

                opc = an.menu();

                if (opc == 1) {
                    int opc2 = an.menu2();

                    if (opc2 == 1) {
                        a = an.lerDados();
                        ad.salvar(a);
                        System.out.println("Gravado com Sucesso!");
                    } else if (opc2 == 2) {
                        p = pn.lerDados();
                        pd.salvar(p);
                        System.out.println("Gravado com Sucesso!");
                    } else if (opc2 == 3) {
                        t = tn.lerDados();
                        td.salvar(t);
                        System.out.println("Gravado com Sucesso!");
                    }

                    else {
                        System.out.println("Opção invalida!");
                    }

                }

                else if (opc == 2) {
                    int opc2 = an.menu2();

                    if (opc2 == 1) {
                        List<Aluno> l = new AlunoDao().listagemGeral();
                        for (int i = 0; i < l.size(); i++) {
                            Aluno a1 = l.get(i);
                            System.out.println(a1);
                        }
                    } else if (opc2 == 2) {
                        List<Professor> l2 = new ProfessorDao().listagemGeral();
                        for (int i = 0; i < l2.size(); i++) {
                            Professor p1 = l2.get(i);
                            System.out.println(p1);
                        }

                    } else if (opc2 == 3) {
                        List<Turma> l3 = new TurmaDao().listagemGeral();
                        for (int i = 0; i < l3.size(); i++) {
                            Turma t1 = l3.get(i);
                            System.out.println(t1);
                        }
                    } else {
                        System.out.println("Opção invalida!");
                    }
                }

                else if (opc == 3) {
                    int opc2 = an.menu2();

                    if (opc2 == 1) {
                        ad.excluirDados();
                        System.out.println("Excluido com Sucesso!");
                    } else if (opc2 == 2) {
                        pd.excluirDados();
                        System.out.println("Excluido com Sucesso!");
                    } else if (opc2 == 3) {
                        td.excluirDados();
                        System.out.println("Excluido com Sucesso!");
                    } else {
                        System.out.println("Opção invalida!");
                    }

                } else if (opc == 4) {
                    int opc2 = an.menu2();

                    if (opc2 == 1) {
                        ad.atualizarDados(a);
                        System.out.println("Dados modificados com sucesso!");
                    } else if (opc2 == 2) {
                        pd.atualizarDados(p);
                        System.out.println("Dados modificados com sucesso!");
                    } else if (opc2 == 3) {
                        td.atualizarDados(t);
                        System.out.println("Dados modificados com sucesso!");
                    } else {
                        System.out.println("Opção inválida!");

                    }
                }

                else if (opc != 5){
                    System.out.println("Opção inválida!");
                }

            } while (opc != 5);
        }

        catch (Exception e) {
            e.printStackTrace();
        }

    }
}