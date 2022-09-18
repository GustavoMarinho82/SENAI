public class Empregado implements Pagamento{
    private String firstName;
    private String lastName;
    private String matricula;
    private double salario;

// construtor
public Empregado (String first, String last,String mat,double sal){
    firstName = first;
    lastName = last;
    matricula = mat;
    salario = sal;

}

public String getFirstName() {
    return firstName;
}

public void setFirstName(String firstName) {
    this.firstName = firstName;
}

public String getLastName() {
    return lastName;
}

public void setLastName(String lastName) {
    this.lastName = lastName;
}

public String getMatricula() {
    return matricula;
}

public void setMatricula(String matricula) {
    this.matricula = matricula;

}

public double getSalario() {
    return salario;
}

public void setSalario(double salario) {
    this.salario = salario;
}
 public String toString() {
     return("\nPrimeiro Nome: "+this.getFirstName()+
     "\n" +"Ultimo nome: "+this.getLastName() + "\nMatricula: "+this.getMatricula() +
     "\n" +"Salario: "+this.getSalario());
 }
     public double getTotalPagamento(){
         return getSalario() *10.0;
     }

 }




