/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.ManagerBiblio;

/**
 *
 * @author farah
 */
public class ManagerBiblioFacade extends AbstractFacade<ManagerBiblio> {

    public ManagerBiblioFacade() {
        super(ManagerBiblio.class);
    }

    public int seConnecter(ManagerBiblio managerBiblio) {
        ManagerBiblio loadedManagerBiblio = find(managerBiblio.getLogin());
        if (loadedManagerBiblio == null) {
            return -1;
        } else if (!loadedManagerBiblio.getPassword().equals(managerBiblio.getPassword())) {
            return -2;
        }
        return 1;
    }

}
