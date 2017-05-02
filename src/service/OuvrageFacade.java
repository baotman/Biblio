/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;
import bean.Ouvrage;
import java.util.ArrayList;
import java.util.List;
import util.SearchUtil;

/**
 *
 * @author hp
 */
public class OuvrageFacade extends AbstractFacade<Ouvrage> {
public List<Ouvrage> search(String input, String choix) {
        String requette = "SELECT ad FROM Ouvrage ad WHERE 1=1";
        List<Ouvrage> ouvrages = new ArrayList<>();
        
        if (choix.equals("identifiant") ) {
            requette += SearchUtil.addConstraint("ad", "id", "=", input);
            ouvrages= getEntityManager().createQuery(requette).getResultList();
        } else if (choix.equals("auteur")) {
            requette += SearchUtil.addConstraint("ad", "nom", "=", input);
            ouvrages= getEntityManager().createQuery(requette).getResultList();
        } else if (choix.equals("tout afficher")) {
            ouvrages = findAll() ;
        }
        return ouvrages ;
    }
    public OuvrageFacade() {
          super(Ouvrage.class);
    }
    
}
