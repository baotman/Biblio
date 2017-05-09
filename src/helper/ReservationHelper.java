/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.Reservation;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author hp
 */
public class ReservationHelper extends AbstractHelper<Reservation> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("ID", "id"),
            new AbstractHelperItem("DATE RESERVATION", "dateResvation"),
            new AbstractHelperItem("ADHERENT", "adherent"),
            new AbstractHelperItem("NBRE OUVRAGE", "nbOuvrage")};
    }

    public ReservationHelper(JTable jTable, List<Reservation> list) {
        super(titres, jTable, list);
    }

//    public AuteurHelper(AbstractHelperItem[] abstractHelperItem, JTable jTable) {
//        super(titres, jTable);
//    }
    public ReservationHelper(JTable jTable) {
        super(titres, jTable);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex == 2) {
            return list.get(rowIndex).getAdherent().getNom();
        } else {
            return super.getValueAt(rowIndex, columnIndex);
        }

    }

}
