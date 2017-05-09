/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Categorie;
import bean.Ouvrage;
import java.util.ArrayList;
import java.util.List;
import util.SearchUtil;

/**
 *
 * @author hp
 */
public class OuvrageFacade extends AbstractFacade<Ouvrage> {

    public List<Ouvrage> search(String id, String nom, Categorie categorie) {
        String requette = "SELECT ad FROM Ouvrage ad WHERE 1=1";

        requette += SearchUtil.addConstraint("ad", "id", "=", id);
        requette += SearchUtil.addConstraint("ad", "nom", "LIKE", nom);
        if (categorie != null && categorie.getId() != null) {
            requette += SearchUtil.addConstraint("ad", "categorie.id", "=", categorie.getId());
        }

        return getEntityManager().createQuery(requette).getResultList();

    }

    public List<Ouvrage> findByCategorie(Categorie categorie) {
        return search(null, null, categorie);
    }
 
    

    public OuvrageFacade() {
        super(Ouvrage.class);
    }

}
