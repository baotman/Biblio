/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.ReservationItem;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Chaimaa-abd
 */
public class ReservationItemHelper extends AbstractHelper<ReservationItem> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("OUVRAGE", "ouvrage"),
            new AbstractHelperItem("DESCRIPTION", "description")};
    }

    public ReservationItemHelper(JTable jTable, List<ReservationItem> list) {
        super(titres, jTable, list);
    }

//    public AuteurHelper(AbstractHelperItem[] abstractHelperItem, JTable jTable) {
//        super(titres, jTable);
//    }
    public ReservationItemHelper(JTable jTable) {
        super(titres, jTable);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex == 0) {
            return list.get(rowIndex).getOuvrage().getNom();
        } else {
            return super.getValueAt(rowIndex, columnIndex);
        }

    }

}
