/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import bean.Ouvrage;
import java.util.List;
import javax.swing.JComboBox;
import service.OuvrageFacade;

/**
 *
 * @author hp
 */
public class JComboBoxUtil {

    public static void initComboBox(JComboBox jComboBox, List list) {
        jComboBox.removeAllItems();
        jComboBox.addItem("--SELECT--");
        for (Object object : list) {
            jComboBox.addItem("" + object.toString());
        }
    }
}
