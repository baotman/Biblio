/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.Adherent;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Chaimaa-abd
 */
public class AdherentHelper extends AbstractHelper<Adherent> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("ID  ", "id"),
            new AbstractHelperItem("NOM", "nom"),
            new AbstractHelperItem("PRENOM", "prenom"),
          new AbstractHelperItem("NUMTEL", "numTel"),
          new AbstractHelperItem("Date naissance", "dateNaissance"),
             new AbstractHelperItem("Adresse", "adresse"),
    };
    }

    public AdherentHelper(JTable jTable, List<Adherent> list) {
        super(titres, jTable, list);
    }

//    public AuteurHelper(AbstractHelperItem[] abstractHelperItem, JTable jTable) {
//        super(titres, jTable);
//    }

    public AdherentHelper(JTable jTable) {
        super(titres, jTable);
    }

}
