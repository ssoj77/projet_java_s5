/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Date;

/**
 *
 * @author Ssoj
 */
public class ProgrammeurBean {
    private int id;
    private String matricule;
    private String nom;
    private String prenom;
    private String adresse;
    private String pseudo;
    private String responsable;
    private String hobby;
    private Date naissance;
    private Date embauche;
    
    /**
     * 
     */
    public ProgrammeurBean() {
    }
    
    /**
     * Méthode permettant de convertir le programmeur en chaine de caractères
     * @return 
     */
    @Override
    public String toString() {
        String affichage = this.getMatricule() + " " + this.getNom() + " " + this.getPrenom()                            
                            + " " + this.getAdresse() + " " + this.getPseudo() 
                            + " " + this.getResponsable() + " " + this.getHobby()
                            + " " + this.getNaissance()+ " " + this.getEmbauche()                
                            + "\n";
        return affichage;
    }
    
    /**
     * accesseur du nom
     * @return nom
     */
    public String getNom() {
        return nom;
    }
    
    /**
     * modificateur du nom
     * @param nom 
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    /**
     * accesseur du prénom
     * @return 
     */
    public String getPrenom() {
        return prenom;
    }
    
    
    /**
     * modificateur du prénom
     * @param prenom 
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * accesseur de la date de naissance
     * @return 
     */
    public Date getNaissance() {
        return naissance;
    }

    /**
     * modificateur de la date de naissance
     * @param naissance 
     */
    public void setNaissance(Date naissance) {
        this.naissance = naissance;
    }

    /**
     * accesseur du pseudo
     * @return pseudo
     */
    public String getPseudo() {
        return pseudo;
    }

    /**
     * modificateur du pseudo
     * @param pseudo 
     */
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }
    
    /**
     * accesseur de l'adresse
     * @return adresse
     */
    public String getAdresse() {
        return adresse;
    }
    
    /**
     * modificateur de l'adresse
     * @param adresse 
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
    /**
     * accesseur du responsable
     * @return responsable
     */
    public String getResponsable() {
        return responsable;
    }
    
    /**
     * modificateur du responsable
     * @param responsable 
     */
    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }
    
    /**
     * accesseur du hobby
     * @return hobby
     */
    public String getHobby() {
        return hobby;
    }
    
    /**
     * modificateur du hobby
     * @param hobby 
     */
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    /**
     * accesseur de la date d'embauche
     * @return embauche
     */
    public Date getEmbauche() {
        return embauche;
    }

    /**
     * modificateur de la date d'embauche
     * @param embauche 
     */
    public void setEmbauche(Date embauche) {
        this.embauche = embauche;
    }

    /**
     * accesseur du matricule
     * @return matricule
     */
    public String getMatricule() {
        return matricule;
    }

    /**
     * modificateur du matricule
     * @param matricule 
     */
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    /**
     * accesseur de l'id
     * @return 
     */
    public int getId() {
        return id;
    }

    /**
     * modificateur de l'id
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }
    
}
