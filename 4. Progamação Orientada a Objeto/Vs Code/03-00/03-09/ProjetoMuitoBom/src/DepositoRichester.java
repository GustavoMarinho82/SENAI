public abstract class DepositoRichester {
    private int ContatinhosDoIgor;
    private int BibliaDoLinux;
    private int FotoIgorBiquine;
    
    
    public DepositoRichester(int contatinhosDoIgor, int bibliaDoLinux, int fotoIgorBiquine) {
        ContatinhosDoIgor = contatinhosDoIgor;
        BibliaDoLinux = bibliaDoLinux;
        FotoIgorBiquine = fotoIgorBiquine;
    }


    public DepositoRichester() {
    }


    public int getContatinhosDoIgor() {
        return ContatinhosDoIgor;
    }


    public void setContatinhosDoIgor(int contatinhosDoIgor) {
        ContatinhosDoIgor = contatinhosDoIgor;
    }


    public int getBibliaDoLinux() {
        return BibliaDoLinux;
    }


    public void setBibliaDoLinux(int bibliaDoLinux) {
        BibliaDoLinux = bibliaDoLinux;
    }


    public int getFotoIgorBiquine() {
        return FotoIgorBiquine;
    }


    public void setFotoIgorBiquine(int fotoIgorBiquine) {
        FotoIgorBiquine = fotoIgorBiquine;
    }



    
}
