public abstract class Animal {
    private String fala;

    public String getFala() {
        return fala;
    }

    public void setFala(String fala) {
        this.fala = fala;
    }

    public void falando (String falar) {
        System.out.println(falar);
    }

}
