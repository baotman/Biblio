/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Auteur;
import bean.Categorie;
import java.util.List;
import util.SearchUtil;

/**
 *
 * @author farah
 */
public class CategorieFacade extends AbstractFacade<Categorie> {

   
    public CategorieFacade() {
        super(Categorie.class);
    }

}
