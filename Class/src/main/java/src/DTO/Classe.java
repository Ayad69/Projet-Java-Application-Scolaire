package src.DTO;

import java.util.ArrayList;

public class Classe {
    private int idClasse;
    private String nomClasse;
    private Prof idProf;
    private ArrayList<Eleve> mesEleves;

    public Classe(String nomClasse, Prof idProf, ArrayList<Eleve> mesEleves) {
        this.nomClasse = nomClasse;
        this.idProf = idProf;
        this.mesEleves = mesEleves;
    }

    public int getIdClasse() {
        return idClasse;
    }
    public void setIdClasse(int idClasse) {
        this.idClasse = idClasse;
    }
    public String getNomClasse() {
        return nomClasse;
    }
    public void setNomClasse(String nomClasse) {
        this.nomClasse = nomClasse;
    }
    public Prof getIdProf() {
        return idProf;
    }
    public void setIdProf(Prof idProf) {
        this.idProf = idProf;
    }
    public ArrayList<Eleve> getMesEleves() {
        return mesEleves;
    }
    public void setMesEleves(ArrayList<Eleve> mesEleves) {
        this.mesEleves = mesEleves;
    }

    @Override
    public String toString() {
        return idProf + " " + nomClasse + " " + idClasse + " " + mesEleves;
    }
}
