package Test;

import src.DTO.Classe;
import src.DTO.Eleve;
import src.DTO.Prof;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

       TestConnexion test = new TestConnexion();
       test.testCon();



        Eleve eleve = new Eleve("Hassani","Ayad",20);
        Eleve eleve2 = new Eleve("Geek","Leo",20);
        Prof prof = new Prof("Plantefeve","Romain",45);
        ArrayList<Eleve> eleves = new ArrayList<Eleve>();
        eleves.add(eleve);
        eleves.add(eleve2);
        Classe classe = new Classe("3eme",prof,eleves);
        System.out.println(classe.toString());
    }
}
