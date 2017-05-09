/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Auteur;
import bean.ManagerBiblio;
import javax.naming.ldap.ManageReferralControl;

/**
 *
 * @author farah
 */
public class Main {

    public static void main(String[] args) {
      //  initManagerBiblio();

    }
  private static void initManagerBiblio() {
        ManagerBiblioFacade managerBiblioFacade = new ManagerBiblioFacade();
        ManagerBiblio managerBiblio1 = new ManagerBiblio("ana_farah", "farah");
        ManagerBiblio managerBiblio2 = new ManagerBiblio("ana_imane", "imane");
        managerBiblioFacade.create(managerBiblio1);
        managerBiblioFacade.create(managerBiblio2);
  }
    private static void initAuteur() {
        AuteurFacade auteurFacade = new AuteurFacade();
        Auteur auteur1 = new Auteur(12134L, " baotman", "farah");
        Auteur auteur2 = new Auteur(129L, " baotman", "farah");
        auteurFacade.create(auteur2);
        auteurFacade.create(auteur1);
    }
}
