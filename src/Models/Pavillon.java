package Models;

public class Pavillon {

    // les variables c aracteristiques
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int nbreEtage;

    public int getNbreEtage() {
        return nbreEtage;
    }

    private String numPavillon;

    public String getNumPavillon() {
        return numPavillon;
    }

    // Constructeur

    public Pavillon(int id, int nbreEtage, String numPavillon) {
        this.id = id;
        this.nbreEtage = nbreEtage;
        this.numPavillon = numPavillon;
    }

    @Override
    public String toString() {
        return "Pavillon [id=" + id + ", nbreEtage=" + nbreEtage + ", numPavillon=" + numPavillon + "]";
    }
}
