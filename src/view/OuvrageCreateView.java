package view;

import bean.Auteur;
import bean.Ouvrage;
import static bean.Ouvrage_.auteur;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import service.AuteurFacade;
import service.OuvrageFacade;
import util.DateUtil;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author farah
 */
public class OuvrageCreateView extends javax.swing.JFrame {
    
    OuvrageFacade ouvrageFacade = new OuvrageFacade();
    AuteurFacade auteurFacade = new AuteurFacade();
    List<Auteur> auteurs;

    /**
     * Creates new form GestionOuvrage
     */
    public OuvrageCreateView() {
        initComponents();
        initcombobox1();
    }
    
    private void initcombobox1() {
        auteurs = auteurFacade.findAll();
        jComboBox1.addItem("--SELECT--");
        for (Auteur auteur1 : auteurs) {
            jComboBox1.addItem(auteur1.getNom() + " " + auteur1.getPrenom() + "(" + auteur1.getId() + ")");
        }
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
        jTextField1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 0, 0));
        jPanel2.setEnabled(false);
        jPanel2.setLayout(null);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nom ouvrage :");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(60, 160, 120, 30);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Date Edition :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(60, 260, 120, 50);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre de page :");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(60, 320, 140, 40);

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
        jPanel2.add(jTextField1);
        jTextField1.setBounds(190, 160, 190, 30);

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Nombre d'exemplaire :");
        jPanel2.add(jLabel22);
        jLabel22.setBounds(50, 370, 130, 30);
        jPanel2.add(jTextField2);
        jTextField2.setBounds(190, 270, 200, 30);
        jPanel2.add(jTextField3);
        jTextField3.setBounds(190, 320, 200, 30);
        jPanel2.add(jTextField4);
        jTextField4.setBounds(180, 380, 210, 30);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" auteur :");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(60, 210, 90, 40);
        jPanel2.add(jTextField5);
        jTextField5.setBounds(190, 110, 190, 30);

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Id:");
        jPanel2.add(jLabel23);
        jLabel23.setBounds(60, 120, 80, 30);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bookaddicon.png"))); // NOI18N
        jButton3.setText("Ajouter");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(70, 450, 180, 50);

        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(190, 210, 190, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Ajouter Ouvrage");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(80, 10, 240, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/book39.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(450, 110, 270, 330);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/deleteicon.png"))); // NOI18N
        jButton4.setText("Close");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(350, 450, 180, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         

        
        ouvrageFacade.create(getParam(true));
        JOptionPane.showMessageDialog(null, "l'ouvrage est bien ajouter ", "Ajout avec succes", JOptionPane.INFORMATION_MESSAGE);
        
       // OuvrageListView ouvrageListView=new OuvrageListView();
        //ouvrageListView.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed
    private Ouvrage getParam(boolean getId) {
        Ouvrage ouvrage = new Ouvrage();
        if (getId) {
            ouvrage.setId(jTextField5.getText());
        }
        ouvrage.setAuteur(auteurs.get(jComboBox1.getSelectedIndex() - 1));
        ouvrage.setNom(jTextField1.getText());
        ouvrage.setDateEdition(DateUtil.parseDate(jTextField2.getText()));
        ouvrage.setNbrPage(Integer.valueOf(jTextField3.getText()));
        ouvrage.setNbrExplaire(Integer.valueOf(jTextField4.getText()));
        return ouvrage;
        
    }
    
    private void setParam(Ouvrage ouvrage) {
        jTextField3.setText(ouvrage.getNbrPage() + "");
        jTextField4.setText(ouvrage.getNbrExplaire() + "");
        jTextField1.setText(ouvrage.getNom() + "");
    }
    
     private Ouvrage getParame(boolean getId) {
        Ouvrage ouvrage = new Ouvrage();
        if (getId) {
            ouvrage.setId(jTextField5.getText());
        }
        ouvrage.setNom(jTextField1.getText());
        ouvrage.setAuteur(auteurs.get(jComboBox1.getSelectedIndex() - 1));
        ouvrage.setDateEdition(DateUtil.parseDate(jTextField2.getText()));
        ouvrage.setNbrPage(new Integer(jTextField3.getText()));
        ouvrage.setNbrExplaire(new Integer(jTextField4.getText()));
        
        return ouvrage;
        
    }

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
            java.util.logging.Logger.getLogger(OuvrageCreateView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OuvrageCreateView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OuvrageCreateView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OuvrageCreateView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OuvrageCreateView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private java.awt.TextField textField3;
    private java.awt.TextField textField4;
    private java.awt.TextField textField5;
    // End of variables declaration//GEN-END:variables
}
