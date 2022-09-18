package entity; //Feito


public class Turma{

    private Integer codigoT;
    private String sala;
    private String horario;

    public Turma(Integer codigoT, String sala, String horario) {
        this.sala = sala;
        this.codigoT = codigoT;
        this.horario = horario;

        }
            

        public Turma(){
            
        
    }


        public Integer getCodigoT() {
            return codigoT;
        }


        public void setCodigoT(Integer codigoT) {
            this.codigoT = codigoT;
        }


        public String getSala() {
            return sala;
        }


        public void setSala(String sala) {
            this.sala = sala;
        }


        public String getHorario() {
            return horario;
        }


        public void setHorario(String horario) {
            this.horario = horario;

            
        }



        public String toString() {
            return "Turma [codigoT=" + codigoT + ", horario=" + horario + ", sala=" + sala + "]";
        }

   
}