/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.Auteur;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Chaimaa-abd
 */
public class AuteurHelper extends AbstractHelper<Auteur> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("ID  ", "id"),
            new AbstractHelperItem("NOM", "nom"),
            new AbstractHelperItem("PRENOM", "prenom")};
    }

    public AuteurHelper(JTable jTable, List<Auteur> list) {
        super(titres, jTable, list);
    }

//    public AuteurHelper(AbstractHelperItem[] abstractHelperItem, JTable jTable) {
//        super(titres, jTable);
//    }

    public AuteurHelper(JTable jTable) {
        super(titres, jTable);
    }

}
