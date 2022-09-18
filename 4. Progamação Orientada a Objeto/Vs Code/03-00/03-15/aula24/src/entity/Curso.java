package entity;

public class Curso {
    private int idcurso;
    private String nomeC;
    

//Construtores
    public Curso(int idcurso, String nomeC) {
        this.idcurso = idcurso;
        this.nomeC = nomeC;
    }

    public Curso() {}

    
//Getters e Setters
    public int getIdcurso() {
        return idcurso;
    }
    public void setIdcurso(int idcurso) {
        this.idcurso = idcurso;
    }

    public String getNomeC() {
        return nomeC;
    }
    public void setNomeC(String nomeC) {
        this.nomeC = nomeC;
    }


//toString
    @Override
    public String toString() {
        return "Curso [idcurso=" + idcurso + ", nomeC=" + nomeC + "]";
    }
    
}