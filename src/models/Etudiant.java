package models;

import java.time.LocalDateTime;

public class Etudiant extends Personne {
    private String matricule;
    private String telephone;
    private String adresse;
    private LocalDateTime dateNaissance;

    public Etudiant(int id, String nom, String prenom, String email) {
        super(id, nom, prenom, email);
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public LocalDateTime getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDateTime date) {
        this.dateNaissance = date;
    }

}
