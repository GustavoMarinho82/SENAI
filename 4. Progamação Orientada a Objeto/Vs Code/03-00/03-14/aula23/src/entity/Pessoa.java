package entity;

public class Pessoa {
    private Integer idpessoa;
    private String nome;
    private String email;
    

    public Pessoa(Integer idpessoa, String nome,String email){
        this.idpessoa = idpessoa;
        this.email = email;
        this.nome = nome;
    }

    public Pessoa() {
    }


    public Integer getIdpessoa() {
        return idpessoa;
    }

    public void setIdpessoa(Integer idpessoa) {
        this.idpessoa = idpessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String toString() {
        return "Pessoa [email=" + email + ", idpessoa=" + idpessoa + ", nome=" + nome + "]";
    }
   
}