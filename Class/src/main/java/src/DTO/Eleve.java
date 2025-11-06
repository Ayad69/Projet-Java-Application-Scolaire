package src.DTO;

public class Eleve {
    private int idEleve;
    private String nomEleve;
    private String prenomEleve;
    private int ageEleve;

    public Eleve(String nomEleve, String prenomEleve, int ageEleve) {
        this.nomEleve = nomEleve;
        this.prenomEleve = prenomEleve;
        this.ageEleve = ageEleve;
    }

    public int getIdEleve() {
        return idEleve;
    }

    public void setIdEleve(int idEleve) {
        this.idEleve = idEleve;
    }

    public String getNomEleve() {
        return nomEleve;
    }

    public void setNomEleve(String nomEleve) {
        this.nomEleve = nomEleve;
    }

    public String getPrenomEleve() {
        return prenomEleve;
    }

    public void setPrenomEleve(String prenomEleve) {
        this.prenomEleve = prenomEleve;
    }

    public int getAgeEleve() {
        return ageEleve;
    }

    public void setAgeEleve(int ageEleve) {
        this.ageEleve = ageEleve;
    }

    @Override
    public String toString() {
        return idEleve + " " + nomEleve + " " + prenomEleve + " " + ageEleve;
    }
}
