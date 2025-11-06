package src.DTO;

public class Prof {
    private int idProf;
    private String nomProf;
    private String prenomProf;
    private int ageProf;

    public Prof(String nomProf, String prenomProf, int ageProf) {
        this.nomProf = nomProf;
        this.prenomProf = prenomProf;
        this.ageProf = ageProf;
    }

    public int getIdProf() {
        return idProf;
    }
    public void setIdProf(int idProf) {
       this.idProf = idProf;
    }
    public String getNomProf() {
        return nomProf;
    }
    public void setNomProf(String nomProf) {
        this.nomProf = nomProf;
    }

    public String getPrenomProf() {
        return prenomProf;
    }
    public void setPrenomProf(String prenomProf) {
        this.prenomProf = prenomProf;
    }
    public int getAgeProf() {
        return ageProf;
    }
    public void setAgeProf(int ageProf) {
        this.ageProf = ageProf;
    }

    @Override
    public String toString() {
        return idProf + " " + nomProf + " " + prenomProf + " " + ageProf;
    }

}
