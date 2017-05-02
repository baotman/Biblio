/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Adherent;
import java.util.ArrayList;
import java.util.List;
import util.SearchUtil;

/**
 *
 * @author farah
 */
public class AdherentFacade extends AbstractFacade<Adherent> {

    public List<Adherent> search(String id, String nom) {
        String requette = "SELECT ad FROM Adherent ad WHERE 1=1";
        requette += SearchUtil.addConstraint("ad", "id", "=", id);
        if (id == null || id.equals("")) {
            requette += SearchUtil.addConstraint("ad", "nom", "LIKE", nom);
        }
        return getEntityManager().createQuery(requette).getResultList();
    }

    public AdherentFacade() {
        super(Adherent.class);
    }

}
