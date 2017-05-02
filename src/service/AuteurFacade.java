/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Auteur;
import java.util.List;
import util.SearchUtil;

/**
 *
 * @author farah
 */
public class AuteurFacade extends AbstractFacade<Auteur> {

    public List<Auteur> search(String id, String nom, String prenom) {
        String requette = "SELECT au FROM Auteur au WHERE 1=1 ";
        requette+=SearchUtil.addConstraint("au", "id", "=", id);
        requette+=SearchUtil.addConstraint("au", "nom", "=", nom);
        requette+=SearchUtil.addConstraint("au", "prenom", "=", prenom);
        System.out.println("haaa rekette ==> "+requette);
        return getEntityManager().createQuery(requette).getResultList();
    }
//    public List<Auteur> search(String id, String nom, String prenom) {
//        String requette = "SELECT au FROM Auteur au WHERE 1=1 ";
//        if (id != null && !id.equals("")) {
//            requette += " AND au.id LIKE '%" + id + "%'";
//        }
//        if (nom != null && !nom.equals("")) {
//            requette += " AND au.nom LIKE '%" + nom + "%'";
//        }
//        if (prenom != null && !prenom.equals("")) {
//            requette += " AND au.prenom LIKE '%" + prenom + "%'";
//        }
//        System.out.println("haaa rekette ==> "+requette);
//        return getEntityManager().createQuery(requette).getResultList();
//    }

    public AuteurFacade() {
        super(Auteur.class);
    }

}
