/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.Ouvrage;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author farah
 */
public class OuvrageHelper extends AbstractHelper<Ouvrage> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("ID  ", "id"),
            new AbstractHelperItem("NOM", "nom"),
            new AbstractHelperItem("dateEdition", "dateEdition"),
            new AbstractHelperItem("nbrPage", "nbrPage"),
            new AbstractHelperItem("nbrExplaire", "nbrExplaire"),
            new AbstractHelperItem("Categorie", "categorie")
        };
    }

    public OuvrageHelper(JTable jTable, List<Ouvrage> list) {
        super(titres, jTable, list);
    }

    public OuvrageHelper(JTable jTable) {
        super(titres, jTable);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex == 5) {
            return list.get(rowIndex).getCategorie().getNom();
        } else {
            return super.getValueAt(rowIndex, columnIndex);
        }

    }

}
