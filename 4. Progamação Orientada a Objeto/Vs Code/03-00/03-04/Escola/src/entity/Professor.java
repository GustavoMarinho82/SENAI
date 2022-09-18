package entity; //Feito

public class Professor{

    private Integer codigoP;
    private String nome;
    private String titulacao;

    public Professor(Integer codigoP, String nome, String titulacao ) {
        this.codigoP = codigoP;
        this.nome = nome;
        this.titulacao = titulacao;

        }
            
    public Professor(){
             
    }


    
    public Integer getCodigoP() {
            return codigoP;
        }


        public void setCodigoP(Integer codigoP) {
            this.codigoP = codigoP;
        }


        public String getNome() {
            return nome;
        }


        public void setNome(String nome) {
            this.nome = nome;
        }


        public String getTitulacao() {
            return titulacao;
        }


        public void setTitulacao(String titulacao) {
            this.titulacao = titulacao;
        }


        public String toString() {
            return "Professor [codigoP=" + codigoP + ", nome=" + nome + ", titulacao=" + titulacao + "]";
        }


    
}