package src;
import Test.TestEleveDAO;
import src.DTO.Eleve;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Eleve deux = new Eleve(2,"Geek","Leo",20);

        TestEleveDAO testDAO = new TestEleveDAO();
       testDAO.createEleve(deux);



    }
}