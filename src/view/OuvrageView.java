package view;
import bean.Auteur;
import bean.Ouvrage;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import service.AuteurFacade;
import service.OuvrageFacade;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author farah
 */
public class OuvrageView extends javax.swing.JFrame {
    OuvrageFacade ouvrageFacade = new OuvrageFacade();
    AuteurFacade auteurFacade = new AuteurFacade();

    /**
     * Creates new form GestionOuvrage
     */
    public OuvrageView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        textField3 = new java.awt.TextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        textField4 = new java.awt.TextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        textField5 = new java.awt.TextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        jLabel2.setText("Nom ouvrage :");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 20, 80, 20);

        jLabel4.setText("Date Edition :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 160, 90, 30);

        jLabel5.setText("Nombre de page :");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 210, 90, 30);

        jPanel3.setLayout(null);

        jLabel7.setText("M/Mme :");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(10, 20, 70, 20);

        jLabel8.setText("Nom :");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(10, 50, 28, 14);

        jLabel9.setText("Prénom :");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(10, 90, 60, 20);

        jLabel10.setText("Date naissance :");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(10, 120, 100, 20);

        jLabel11.setText("tel :");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(10, 150, 100, 20);

        textField3.setText("textField1");
        jPanel3.add(textField3);
        textField3.setBounds(70, 20, 60, 20);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 0, 0);

        jPanel4.setLayout(null);

        jLabel12.setText("M/Mme :");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(10, 20, 70, 20);

        jLabel13.setText("Nom :");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(10, 50, 28, 14);

        jLabel14.setText("Prénom :");
        jPanel4.add(jLabel14);
        jLabel14.setBounds(10, 90, 60, 20);

        jLabel15.setText("Date naissance :");
        jPanel4.add(jLabel15);
        jLabel15.setBounds(10, 120, 100, 20);

        jLabel16.setText("tel :");
        jPanel4.add(jLabel16);
        jLabel16.setBounds(10, 150, 100, 20);

        textField4.setText("textField1");
        jPanel4.add(textField4);
        textField4.setBounds(70, 20, 60, 20);

        jPanel5.setLayout(null);

        jLabel17.setText("M/Mme :");
        jPanel5.add(jLabel17);
        jLabel17.setBounds(10, 20, 70, 20);

        jLabel18.setText("Nom :");
        jPanel5.add(jLabel18);
        jLabel18.setBounds(10, 50, 28, 14);

        jLabel19.setText("Prénom :");
        jPanel5.add(jLabel19);
        jLabel19.setBounds(10, 90, 60, 20);

        jLabel20.setText("Date naissance :");
        jPanel5.add(jLabel20);
        jLabel20.setBounds(10, 120, 100, 20);

        jLabel21.setText("tel :");
        jPanel5.add(jLabel21);
        jLabel21.setBounds(10, 150, 100, 20);

        textField5.setText("textField1");
        jPanel5.add(textField5);
        textField5.setBounds(70, 20, 60, 20);

        jPanel4.add(jPanel5);
        jPanel5.setBounds(0, 0, 0, 0);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(0, 0, 0, 0);

        jButton1.setText("Ajouter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(20, 330, 90, 40);

        jButton2.setText("Modifier");
        jPanel2.add(jButton2);
        jButton2.setBounds(130, 330, 90, 40);

        jButton3.setText("Suprimer");
        jPanel2.add(jButton3);
        jButton3.setBounds(250, 330, 100, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(360, 170, 390, 140);

        jLabel1.setText("Recherche par:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(380, 30, 90, 14);
        jPanel2.add(jTextField1);
        jTextField1.setBounds(130, 20, 180, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "identifiant", "auteur", "tout afficher", "" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(530, 20, 110, 30);

        jButton4.setText("Rechercher");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(390, 110, 140, 23);

        jButton5.setText("Actualiser");
        jPanel2.add(jButton5);
        jButton5.setBounds(480, 350, 140, 40);

        jLabel22.setText("Nombre d'exemplaire :");
        jPanel2.add(jLabel22);
        jLabel22.setBounds(0, 270, 120, 20);
        jPanel2.add(jTextField2);
        jTextField2.setBounds(130, 160, 180, 40);
        jPanel2.add(jTextField3);
        jTextField3.setBounds(130, 210, 190, 30);
        jPanel2.add(jTextField4);
        jTextField4.setBounds(130, 260, 190, 30);
        jPanel2.add(jTextField5);
        jTextField5.setBounds(360, 70, 320, 30);

        jLabel3.setText("Prenom auteur:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 120, 100, 20);
        jPanel2.add(jTextField6);
        jTextField6.setBounds(130, 60, 180, 30);

        jLabel6.setText("Nom auteur :");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(13, 54, 90, 40);
        jPanel2.add(jTextField7);
        jTextField7.setBounds(130, 110, 180, 30);

        jMenu1.setText("Gestion Des Ouvrages");
        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed
private Ouvrage getParam() {
        Ouvrage ouvrage = new Ouvrage();
        try {
            ouvrage.setNom(jTextField1.getText());
            
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyyy");
            ouvrage.setDateEdition(simpleDateFormat.parse(jTextField2.getText()));
            ouvrage.setNbrPage(Integer.valueOf(jTextField3.getText()));
            ouvrage.setNbrExplaire(Integer.valueOf(jTextField4.getText()));

        } catch (ParseException ex) {
        }
        return ouvrage;

    }
private Auteur getParame(){
    Auteur auteur = new Auteur();
    auteur.setNom(jTextField6.getText());
    auteur.setPrenom(jTextField7.getText());
    return auteur;
    
}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        auteurFacade.create(getParame());
        ouvrageFacade.create(getParam());
        
        JOptionPane.showMessageDialog(null, " ouvrage  bien ajouter", "Ajout avec succes", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OuvrageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OuvrageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OuvrageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OuvrageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OuvrageView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private java.awt.TextField textField3;
    private java.awt.TextField textField4;
    private java.awt.TextField textField5;
    // End of variables declaration//GEN-END:variables
}
