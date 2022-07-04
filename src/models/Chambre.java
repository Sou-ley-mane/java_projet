package models;

public class Chambre {
    private int id;
    private String numChambre;
    private String numEtage;
    private String typeChambre;

    public Chambre(int id, String numChambre, String numEtage, String typeChambre) {
        this.id = id;
        this.numChambre = numChambre;
        this.numEtage = numEtage;
        this.typeChambre = typeChambre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumChambre() {
        return numChambre;
    }

    public void setNumChambre(String numChambre) {
        this.numChambre = numChambre;
    }

    public String getNumEtage() {
        return numEtage;
    }

    public void setNumEtage(String numEtage) {
        this.numEtage = numEtage;
    }

    public String getTypeChambre() {
        return typeChambre;
    }

    public void setTypeChambre(String typeChambre) {
        this.typeChambre = typeChambre;
    }

}
