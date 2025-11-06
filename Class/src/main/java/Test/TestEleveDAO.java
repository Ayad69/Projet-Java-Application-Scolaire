package Test;

import src.DAO.EleveDAO;
import src.DTO.Eleve;

public class TestEleveDAO {
        public void createEleve(Eleve obj){
            EleveDAO eleveDAO = new EleveDAO();
            eleveDAO.create(obj);
        }

        public void deleteEleve(Eleve obj){
            EleveDAO eleveDAO = new EleveDAO();
            eleveDAO.delete(obj);
            System.out.println("eleve deleted successfully "+ obj.getNomEleve()+" "+obj.getPrenomEleve());
        }

}
