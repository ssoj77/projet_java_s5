/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihm;

import data.DataTransac;
import data.ProgrammeurBean;
import java.awt.Component;
import java.awt.Dimension;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Ssoj
 */
public class VueModification extends javax.swing.JPanel {

    private DataTransac dt;
    private ProgrammeurBean prog;
    private JLabel mode;
    private Vue vue;

    /**
     * Creates new form VueModification
     */
    public VueModification(Vue v) {
        this.vue = v;
        initComponents(); 
        initMode();
    }
    
    /**
     * active/désactive des composants pour correspondre à la vue ajouter
     */
    public void ajouter(){
        mode.setText("ajouter");
        Component[] components = getComponents();

        for (Component component : components) {
            component.setEnabled(true);
        }
        jButton_rechercher.setEnabled(false);
        jButton_reinit.setEnabled(true);
        jButton_valider.setEnabled(true);
        jButton_annuler.setEnabled(true);
        jPanel2.setEnabled(true);
    }
    
    /**
     * active/désactive des composants pour correspondre à la vue modifier
     */
    public void modifier(){   
        mode.setText("modifier");
        Component[] components = getComponents();

        for (Component component : components) {
            component.setEnabled(true);
        }
        jButton_rechercher.setEnabled(true);
        jButton_reinit.setEnabled(false);
        jButton_valider.setEnabled(false);
        jButton_annuler.setEnabled(true);
        jPanel2.setEnabled(true);
    }
    
    /**
     * active/désactive des composants pour correspondre à la vue supprimer
     */
    public void supprimer(){
        mode.setText("supprimer");
        Component[] components = getComponents();

        for (Component component : components) {
            component.setEnabled(false);
        }
        jButton_rechercher.setEnabled(false);
        jButton_reinit.setEnabled(false);
        jButton_valider.setEnabled(true);
        jButton_annuler.setEnabled(true);
        jPanel2.setEnabled(false);

    }
    
    /**
     * Remet tous les champs de la vue à vide
     */
    private void reinitText(){
        jTextField_matricule.setText("");
        jTextField_nom.setText("");
        jTextField_prenom.setText("");
        jTextField_responsable.setText("");
        jTextField_hobby.setText("");
        jTextField_adresse.setText("");
        jTextField_pseudo.setText("");
        DateFormat dateFormat = new SimpleDateFormat("dd");
        jTextField_dnJour.setText("jour");
        jTextField_deJour.setText("jour");
        dateFormat = new SimpleDateFormat("yyyy");         
        jTextField_dnAnnee.setText("annee");
        jTextField_deAnnee.setText("annee");
        dateFormat = new SimpleDateFormat("MM");  
        jComboBox_dnMois.setSelectedIndex(0); //Index commence à 0
        jComboBox_deMois.setSelectedIndex(0);
        this.repaint();
    }
   
    
 /*   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jButton_rechercher = new javax.swing.JButton();
        jButton_reinit = new javax.swing.JButton();
        jButton_valider = new javax.swing.JButton();
        jButton_annuler = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_nom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField_adresse = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_responsable = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField_hobby = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField_prenom = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_pseudo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField_dnJour = new javax.swing.JTextField();
        jTextField_dnAnnee = new javax.swing.JTextField();
        jComboBox_dnMois = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jTextField_deJour = new javax.swing.JTextField();
        jComboBox_deMois = new javax.swing.JComboBox<>();
        jTextField_deAnnee = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField_matricule = new javax.swing.JTextField();

        jButton_rechercher.setText("Rechercher");
        jButton_rechercher.setEnabled(false);
        jButton_rechercher.setFocusable(false);
        jButton_rechercher.setRequestFocusEnabled(false);
        jButton_rechercher.setRolloverEnabled(false);
        jButton_rechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_rechercherActionPerformed(evt);
            }
        });

        jButton_reinit.setText("Réinitialiser");
        jButton_reinit.setEnabled(false);
        jButton_reinit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_reinitActionPerformed(evt);
            }
        });

        jButton_valider.setText("Valider");
        jButton_valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_validerActionPerformed(evt);
            }
        });

        jButton_annuler.setText("Annuler");
        jButton_annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_annulerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_rechercher)
                .addGap(18, 18, 18)
                .addComponent(jButton_reinit)
                .addGap(18, 18, 18)
                .addComponent(jButton_valider)
                .addGap(18, 18, 18)
                .addComponent(jButton_annuler)
                .addGap(101, 101, 101))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_rechercher)
                    .addComponent(jButton_reinit)
                    .addComponent(jButton_valider)
                    .addComponent(jButton_annuler))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setEnabled(false);

        jLabel1.setText("Nom");

        jLabel2.setText("Adresse");

        jLabel3.setText("Responsable");

        jLabel4.setText("Hobby");

        jLabel5.setText("Prénom");

        jLabel6.setText("Pseudo");
        jLabel6.setMaximumSize(new java.awt.Dimension(40, 14));
        jLabel6.setPreferredSize(new java.awt.Dimension(40, 14));

        jLabel7.setText("Date de Naiss");
        jLabel7.setMaximumSize(new java.awt.Dimension(75, 14));
        jLabel7.setMinimumSize(new java.awt.Dimension(75, 14));
        jLabel7.setPreferredSize(new java.awt.Dimension(75, 14));

        jTextField_dnJour.setText("jour");

        jTextField_dnAnnee.setText("annee");

        jComboBox_dnMois.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jLabel8.setText("Date embauche");

        jTextField_deJour.setText("jour");

        jComboBox_deMois.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jTextField_deAnnee.setText("annee");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField_adresse, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField_hobby, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField_responsable, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField_dnJour, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_deJour, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jComboBox_deMois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_deAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jComboBox_dnMois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_dnAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_pseudo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(141, 141, 141))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jTextField_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_adresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_pseudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_dnJour, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTextField_responsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_dnAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox_dnMois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_deJour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_deMois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_deAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField_hobby, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(37, 37, 37))
        );

        jPanel1.setBackground(new java.awt.Color(65, 65, 65));

        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Matricule");

        jTextField_matricule.setText("0");
        jTextField_matricule.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jTextField_matricule, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField_matricule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
*/
    /**
     * initialise la vue dans le cas de la modification, de la suppression ou de l'ajout
     */
    private void initComponents() {
        jPanel3 = new javax.swing.JPanel();
        jButton_rechercher = new javax.swing.JButton();
        jButton_reinit = new javax.swing.JButton();
        jButton_valider = new javax.swing.JButton();
        jButton_annuler = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_nom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField_adresse = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_responsable = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField_hobby = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField_prenom = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_pseudo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField_dnJour = new Champ("jour","Chiffre");
        jTextField_dnAnnee = new Champ("ann\u00E9e","Chiffre");
        jComboBox_dnMois = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jTextField_deJour = new Champ("jour","Chiffre");
        jComboBox_deMois = new javax.swing.JComboBox<>();
        jTextField_deAnnee = new Champ("ann\u00E9e","Chiffre");
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField_matricule = new Champ("0","Chiffre5");;

        jButton_rechercher.setText("Rechercher");
        jButton_rechercher.setEnabled(false);
        jButton_rechercher.setFocusable(false);
        jButton_rechercher.setRequestFocusEnabled(false);
        jButton_rechercher.setRolloverEnabled(false);
        jButton_rechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_rechercherActionPerformed(evt);
            }
        });

        jButton_reinit.setText("Réinitialiser");
        jButton_reinit.setEnabled(false);
        jButton_reinit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_reinitActionPerformed(evt);
            }
        });

        jButton_valider.setText("Valider");
        jButton_valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_validerActionPerformed(evt);
            }
        });

        jButton_annuler.setText("Annuler");
        jButton_annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_annulerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_rechercher)
                .addGap(18, 18, 18)
                .addComponent(jButton_reinit)
                .addGap(18, 18, 18)
                .addComponent(jButton_valider)
                .addGap(18, 18, 18)
                .addComponent(jButton_annuler)
                .addGap(101, 101, 101))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_rechercher)
                    .addComponent(jButton_reinit)
                    .addComponent(jButton_valider)
                    .addComponent(jButton_annuler))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setEnabled(false);

        jLabel1.setText("Nom");

        jLabel2.setText("Adresse");

        jLabel3.setText("Responsable");

        jLabel4.setText("Hobby");

        jLabel5.setText("Prénom");

        jLabel6.setText("Pseudo");
        jLabel6.setSize(new Dimension(60,15));

        jLabel7.setText("Date de Naiss");
        jLabel7.setMaximumSize(new java.awt.Dimension(75, 14));
        jLabel7.setMinimumSize(new java.awt.Dimension(75, 14));
        jLabel7.setPreferredSize(new java.awt.Dimension(75, 14));

        

        

        jComboBox_dnMois.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jLabel8.setText("Date embauche");

        

        jComboBox_deMois.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField_adresse, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField_hobby, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField_responsable, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField_dnJour, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_deJour, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jComboBox_deMois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField_deAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jComboBox_dnMois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField_dnAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_pseudo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(141, 141, 141))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jTextField_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_adresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_pseudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_dnJour, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTextField_responsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_dnAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox_dnMois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_deJour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_deMois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_deAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField_hobby, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(37, 37, 37))
        );

        jPanel1.setBackground(new java.awt.Color(65, 65, 65));

        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Matricule");

        
        jTextField_matricule.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jTextField_matricule, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField_matricule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }
  
    /**
     * Observateur du bouton rechercher
     * @param evt 
     */
    private void jButton_rechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_rechercherActionPerformed
        dt = new DataTransac();
           prog = dt.getProgrammeur(jTextField_matricule.getText()); 
           if(prog != null){
                jTextField_nom.setText(prog.getNom());
                jTextField_prenom.setText(prog.getPrenom());
                jTextField_responsable.setText(prog.getResponsable());
                jTextField_hobby.setText(prog.getHobby());
                jTextField_adresse.setText(prog.getAdresse());
                jTextField_pseudo.setText(prog.getPseudo());
                DateFormat dateFormat = new SimpleDateFormat("dd");
                jTextField_dnJour.setText(dateFormat.format(prog.getNaissance()));
                jTextField_deJour.setText(dateFormat.format(prog.getEmbauche()));
                dateFormat = new SimpleDateFormat("yyyy");         
                jTextField_dnAnnee.setText(dateFormat.format(prog.getNaissance()));
                jTextField_deAnnee.setText(dateFormat.format(prog.getEmbauche()));
                dateFormat = new SimpleDateFormat("MM");  
                jComboBox_dnMois.setSelectedIndex(Integer.valueOf(dateFormat.format(prog.getNaissance())) - 1); //Index commence à 0
                jComboBox_deMois.setSelectedIndex(Integer.valueOf(dateFormat.format(prog.getEmbauche())) - 1);
                jButton_valider.setEnabled(true);
           } else {
                JOptionPane.showMessageDialog(this, "Programmeur introuvable", "Echec", JOptionPane.ERROR_MESSAGE);
                jButton_valider.setEnabled(false);
                reinitText();
           }
           
           dt.fermerRessources();
    }//GEN-LAST:event_jButton_rechercherActionPerformed

    /**
     * Observateur du bouton annuler
     * @param evt 
     */
    private void jButton_annulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_annulerActionPerformed
        vue.reinit();
        vue = new Vue();
        vue.init();
    }//GEN-LAST:event_jButton_annulerActionPerformed
/**
 * Cette méthode permet de contrôler l'action créée par le déclanchement du bouton valider
 * @param evt ActionEvent
 */
    private void jButton_validerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_validerActionPerformed
        if (controleChamp() == 1) {
            JOptionPane.showMessageDialog(this, "Vous devez remplir tous les champs !", 
						"Erreur !", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String dn = jTextField_dnAnnee.getText() + "-" + jComboBox_dnMois.getSelectedItem() + "-" + jTextField_dnJour.getText();
        String de = jTextField_deAnnee.getText() + "-" + jComboBox_deMois.getSelectedItem() + "-" + jTextField_deJour.getText();
        dt = new DataTransac();
        switch(mode.getText()){
            case "ajouter" :
                        dt.ajouterProgrammeur(jTextField_matricule.getText(), jTextField_nom.getText(), jTextField_prenom.getText(), jTextField_adresse.getText(), 
                               jTextField_pseudo.getText(), jTextField_responsable.getText(), jTextField_hobby.getText(), dn, de);
                        JOptionPane.showConfirmDialog((Component)this,
						(Object)"L'insertion a \u00E9t\u00E9 effectu\u00E9.", 
						"Succes",JOptionPane.DEFAULT_OPTION);
                        break;
            case "modifier" :
                        dt.modifierProgrammeur(prog.getId(), jTextField_matricule.getText(), jTextField_nom.getText(), jTextField_prenom.getText(), jTextField_adresse.getText(), 
                               jTextField_pseudo.getText(), jTextField_responsable.getText(), jTextField_hobby.getText(), dn, de);
                        JOptionPane.showConfirmDialog((Component)this,
						(Object)"La modification a \u00E9t\u00E9 effectu\u00E9.", 
						"Succes",JOptionPane.DEFAULT_OPTION);
                        break;
            case "supprimer" :
                        dt.supprimerProgrammeur(jTextField_matricule.getText());
                        JOptionPane.showConfirmDialog((Component)this,
						(Object)"La suppression a \u00E9t\u00E9 effectu\u00E9.", 
						"Succes",JOptionPane.DEFAULT_OPTION);
                        break;            
        }
    }//GEN-LAST:event_jButton_validerActionPerformed

    /**
     * Observateur du bouton réinitialiser
     * @param evt 
     */
    private void jButton_reinitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_reinitActionPerformed
        reinitText();
    }//GEN-LAST:event_jButton_reinitActionPerformed

    /**
     * Cette méthode vérifie l'intégrité des champs
     * @return int information sur la véracité des champs
     */
    private int controleChamp() {
        switch(mode.getText()) {
            case "modifier":
            case "ajouter":
                if (jTextField_matricule.getText().equals("0"))
                    return 1;
                if (jTextField_nom.getText().equals(""))
                    return 1;
                if (jTextField_prenom.getText().equals(""))
                    return 1;
                if (jTextField_adresse.getText().equals(""))
                    return 1;
                if (jTextField_pseudo.getText().equals(""))
                    return 1;
                if (jTextField_responsable.getText().equals(""))
                    return 1;
                if (jTextField_hobby.getText().equals(""))
                    return 1;
                if (jTextField_dnAnnee.getText().equals("année"))
                    return 1;
                if (jTextField_dnJour.getText().equals("jour"))
                    return 1;
                if (jTextField_deAnnee.getText().equals("année"))
                    return 1;
                if (jTextField_deJour.getText().equals("jour"))
                    return 1;
                break;
            case "supprimer":
                if (jTextField_matricule.getText().equals("0"))
                    return 1;
        }
        return 0;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_annuler;
    private javax.swing.JButton jButton_rechercher;
    private javax.swing.JButton jButton_reinit;
    private javax.swing.JButton jButton_valider;
    private javax.swing.JComboBox<String> jComboBox_deMois;
    private javax.swing.JComboBox<String> jComboBox_dnMois;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField_adresse;
    private javax.swing.JTextField jTextField_deAnnee;
    private javax.swing.JTextField jTextField_deJour;
    private javax.swing.JTextField jTextField_dnAnnee;
    private javax.swing.JTextField jTextField_dnJour;
    private javax.swing.JTextField jTextField_hobby;
    private javax.swing.JTextField jTextField_matricule;
    private javax.swing.JTextField jTextField_nom;
    private javax.swing.JTextField jTextField_prenom;
    private javax.swing.JTextField jTextField_pseudo;
    private javax.swing.JTextField jTextField_responsable;
    // End of variables declaration//GEN-END:variables

    private void initMode() {
        mode = new JLabel();
        mode.setVisible(false);
    }
}
