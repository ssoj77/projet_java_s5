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
    private String nom;
    private String prenom;
    private String adresse;
    private String pseudo;
    private String reponsable;
    private String hobby;
    private Date naissance;
    private Date embauche;
    private float salaire;
    private float prime;
    

    public ProgrammeurBean() {
    }

    @Override
    public String toString() {
        String affichage = "Prénom : " + this.getPrenom()
                            + " Nom : " + this.getNom()
                            + " Adresse : " + this.getAdresse()
                            + " Pseudo : " + this.getPseudo()
                            + " Naissance : " + this.getNaissance().toString()
                            + " Salaire : " + this.getSalaire() 
                            + " Prime : " + this.getPrime()
                            
                            + "\n";

        return affichage;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getNaissance() {
        return naissance;
    }

    public void setNaissance(Date naissance) {
        this.naissance = naissance;
    }

    public float getSalaire() {
        return salaire;
    }

    public void setSalaire(float salaire) {
        this.salaire = salaire;
    }

    public float getPrime() {
        return prime;
    }

    public void setPrime(float prime) {
        this.prime = prime;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }
}
