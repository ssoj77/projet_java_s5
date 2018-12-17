/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Ssoj
 */
public interface ActionBD {
    
     /**
     * Lance la requête la récupère passée en paramètre et retourne le ResultSet
     * correspondant à cette requête
     *
     * @param req La requête SQL que l'on souhaite exécuter
     * @return rs Une variable de type ResultSet
     */
    public abstract ResultSet getResultSet(String req);
    
    /**
     * Cette méthode récupère toutes les infos d'un programmeur et retourne une
     * liste de l'ensemble des programmeurs
     *
     * @return listeProgrammeurs Une variable de type ArryList
     */
    public abstract ArrayList getProgrammeurs();
    
    /**
     * Cette méthode récupère toutes les infos d'un programmeur et retourne ce
     * programmeur sous la forme d'un Java Bean Cette méthode est utilisée pour
     * rechercher un progammeur via son nom
     *
     * @param nom Le nom saisi par l'utilisateur pour lancer la recherche
     * @return prog Une variable de type ProgrammeurBean
     *
     */
    public abstract ProgrammeurBean getProgrammeur(String nom);
    
    /**
     * Cette méthode permet de construire la chaîne de caractères qui sera
     * affichée lorsqu'on choisit Programmeur - Afficher - Tous
     *
     * @return listeProg Une variable de type String
     *
     */
    public abstract String afficherProgrammeurs();
    
    /**
     * Cette méthode permet de libérer les ressources liées à la base de données
     * *
     */
    public abstract void fermerRessources();
    
    /**
     * Cette méthode permet d'enregistrer un programmeur dans la base de données
     * et retourne une variable de type int pour dire si la requête s'est bien passé
     * @param matricule
     * @param nom
     * @param prenom
     * @param adresse
     * @param hobby
     * @param responsable
     * @param naissance
     * @param pseudo
     * @param embauche
     * @return statut une variable de type int
     */
    public abstract int ajouterProgrammeur(String matricule, String nom, String prenom, String adresse, String pseudo, String responsable, 
            String hobby, Date naissance, Date embauche);
    
    
    /**
     * Cette méthode permet de modifier un programmeur dans la base de données
     * et retourne une variable de type int pour dire si la requête s'est bien passé
     * @param matricule le matricule du programmeur à modifier
     * @return statut une variable de type int
     */
    public abstract int modifierProgrammeur(int matricule);
}
