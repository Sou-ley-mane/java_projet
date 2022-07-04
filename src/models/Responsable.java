package models;

public class Responsable extends Personne {
    private String password;

    public Responsable(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
