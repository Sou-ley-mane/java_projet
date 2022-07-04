package models;

public class Pavillon {
    private int id;
    private String numero;
    private int nbeEtage;

    public Pavillon(int id, String numero, int nbeEtage) {
        this.id = id;
        this.numero = numero;
        this.nbeEtage = nbeEtage;
    }

    // public Pavillon(String numero, int nbeEtage) {
    // this.numero = numero;
    // this.nbeEtage = nbeEtage;
    // }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getNbeEtage() {
        return nbeEtage;
    }

    public void setNbeEtage(int nbeEtage) {
        this.nbeEtage = nbeEtage;
    }

    @Override
    public String toString() {
        return "Pavillon [id=" + id + ", nbeEtage=" + nbeEtage + ", numero=" + numero + "]";
    }

}
