/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihm;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import data.DataTransac;
import data.ProgrammeurBean;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Pierre
 */
public class Vue extends GestionVueAbstraite {

    // Déclaration des attributs
    // L'initialisation se fera "en local" dans des méthodes
    private JMenuItem afficherTous, modifier, supprimer, ajouter, quitter;
    private JMenu menuProgrammeur, menuAction, submenuAjouter;
    private JMenuBar barMenu;   
    private JTextArea zoneAffichageProgrammeurs;
    private JPanel pane;
    private JScrollPane scroll;
    private String contenuTextArea;
    private DataTransac dt;
    private VueModification vm;
    
    /**
     * initialise la fenêtre
     */
    @Override
    public void init() {
        pane = new JPanel(); // Création d'un panel pour gérer les widgets
        zoneAffichageProgrammeurs = new JTextArea();
        //Bar de menu [Programmeur][Action]
        barMenu = new JMenuBar();
        menuProgrammeur = new JMenu("Programmeur");
        //a group of JMenuItems
        submenuAjouter = new JMenu("Afficher");
        afficherTous = new JMenuItem("Tous");
        submenuAjouter.add(afficherTous);
        menuProgrammeur.add(submenuAjouter);
        modifier = new JMenuItem("Modifier");
        menuProgrammeur.add(modifier);
        supprimer = new JMenuItem("Supprimer");
        menuProgrammeur.add(supprimer);       
        ajouter = new JMenuItem("Ajouter");
        menuProgrammeur.add(ajouter);

        menuAction = new JMenu("Action");
        quitter = new JMenuItem("Quitter");
        menuAction.add(quitter);
        
        barMenu.add(menuProgrammeur);   
        barMenu.add(menuAction);        
        setJMenuBar(barMenu);

        zoneAffichageProgrammeurs = new JTextArea(15, 55);
        scroll = new JScrollPane(zoneAffichageProgrammeurs);
        pane.add(scroll);

        afficherTous.addActionListener(this);
        modifier.addActionListener(this);
        supprimer.addActionListener(this);
        ajouter.addActionListener(this);
        quitter.addActionListener(this);
        /**
         * Par défaut, notre frame n'est pas visible
         * Il faut donc forcer la visibilité à "true"
         */
        this.setVisible(true);
        this.setTitle("GesProg");
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Fermeture fenêtre = arrêt de l'application 
        setBounds(10, 10, 680, 380);
        setLocationRelativeTo(null);
        setResizable(false);

        this.add(pane); // Ajout du panel à notre frame de base
    }
    
    /**
     * Obervateur du menu de la fenêtre
     * @param event 
     */
    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == afficherTous) {            
            pane.removeAll();
            zoneAffichageProgrammeurs = new JTextArea(15, 55);
            scroll = new JScrollPane(zoneAffichageProgrammeurs);
            pane.add(scroll);
            getContentPane().revalidate();
            dt = new DataTransac();
            contenuTextArea = dt.afficherProgrammeurs();
            zoneAffichageProgrammeurs.setText(contenuTextArea);
            pane.add(scroll);
            pane.repaint();
            dt.fermerRessources();
//        } else if (event.getSource() == btnRechercher) {
//            dt = new DataTransac();
//            progrBean = dt.getProgrammeur(this.champNom.getText());
//            if (progrBean == null) {
//                JOptionPane.showMessageDialog(this, "Programmeur introuvable", "Echec", JOptionPane.ERROR_MESSAGE);
//            } else {
//                contenuTextArea = progrBean.toString();
//                zoneAffichageProgrammeurs.setText(contenuTextArea);
//            }
        } else if (event.getSource() == quitter){
            Object[] options = {"Oui",
                    "Non"};
            int n = JOptionPane.showOptionDialog(this,
                "Voulez vous quitter ?",
                "Vérification",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,     //do not use a custom Icon
                options,  //the titles of buttons
                options[0]); //default button title
            if(n == JOptionPane.YES_OPTION){
                if (dt != null) {
                    dt.fermerRessources();
                }
                System.exit(0);
            }
        } else if (event.getSource() == modifier) {
            pane.removeAll();
            vm = new VueModification(this);
            vm.modifier();
            pane.add(vm); 
            getContentPane().revalidate();
        } else if (event.getSource() == supprimer) {
            pane.removeAll();
            vm = new VueModification(this);
            vm.supprimer();
            pane.add(vm); 
            getContentPane().revalidate();
        } else if (event.getSource() == ajouter) {
            pane.removeAll();
            vm = new VueModification(this);
            vm.ajouter();
            pane.add(vm);            
            getContentPane().revalidate();
        }
            
        
    }
    
    /**
     * Permet de réinitialiser la vue
     */
    public void reinit() {
        dispose();
    }

}
