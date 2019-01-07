/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import myutil.Constante;

/**
 *
 * @author Ssoj
 */
public class DataTransac implements ActionBD {
    
    private Connection dbConn;
    private Statement stmt;
    private PreparedStatement pstmt;
    private ResultSet rs;
    private ArrayList<ProgrammeurBean> listeProgrammeurs;
    private ProgrammeurBean prog;
    
    public DataTransac() {
        try {
            dbConn = DriverManager.getConnection(Constante.URL, Constante.USER, Constante.MDP);
        } catch (SQLException sqle) {
            Logger.getLogger(DataTransac.class.getName()).log(Level.SEVERE, null, sqle);
        }
    }
    
    @Override
    public ResultSet getResultSet(String req) {
        try {
            stmt = dbConn.createStatement();
            rs = stmt.executeQuery(req);
        } catch (SQLException sqle) {
            Logger.getLogger(DataTransac.class.getName()).log(Level.SEVERE, null, sqle);
        }
        return rs;
    }

    @Override
    public ArrayList getProgrammeurs() {
        rs = this.getResultSet(Constante.REQUETE_TOUS);
        listeProgrammeurs = new ArrayList<>();

        try {
            while (rs.next()) {
                prog = new ProgrammeurBean();
                prog.setId(rs.getInt("ID"));
                prog.setMatricule(rs.getString("MATRICULE"));
                prog.setPrenom(rs.getString("PRENOM"));
                prog.setNom(rs.getString("NOM"));
                prog.setAdresse(rs.getString("ADRESSE"));
                prog.setPseudo(rs.getString("PSEUDO"));
                prog.setResponsable(rs.getString("RESPONSABLE"));
                prog.setHobby(rs.getString("HOBBY"));
                prog.setNaissance(rs.getDate("DATE_NAISS"));
                prog.setEmbauche(rs.getDate("DATE_EMB"));
                listeProgrammeurs.add(prog);
            }
        } catch (SQLException sqle) {
            Logger.getLogger(DataTransac.class.getName()).log(Level.SEVERE, null, sqle);
        }
        return listeProgrammeurs;
    }

    @Override
    public ProgrammeurBean getProgrammeur(String nom) {
        try {
            pstmt = dbConn.prepareStatement(Constante.REQUETE_UNIQUE);
            pstmt.setString(1, nom);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                prog = new ProgrammeurBean();
                prog.setId(rs.getInt("ID"));
                prog.setMatricule(rs.getString("MATRICULE"));
                prog.setPrenom(rs.getString("PRENOM"));
                prog.setNom(rs.getString("NOM"));
                prog.setAdresse(rs.getString("ADRESSE"));
                prog.setPseudo(rs.getString("PSEUDO"));
                prog.setResponsable(rs.getString("RESPONSABLE"));
                prog.setHobby(rs.getString("HOBBY"));
                prog.setNaissance(rs.getDate("DATE_NAISS"));
                prog.setEmbauche(rs.getDate("DATE_EMB"));
                
            }
        } catch (SQLException sqle) {
            Logger.getLogger(DataTransac.class.getName()).log(Level.SEVERE, null, sqle);
        }
        return prog;
    }

    @Override
    public String afficherProgrammeurs() {
        String listeProg = "";

        listeProgrammeurs = this.getProgrammeurs();
        for (ProgrammeurBean progr : listeProgrammeurs) {
            listeProg = listeProg + progr;
        }

        return listeProg;
    }

    @Override
    public void fermerRessources() {
        if (dbConn != null) {
            try {
                dbConn.close();
                if (stmt != null) {
                    stmt.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (rs != null) {
                    rs.close();
                }
                dbConn = null;
            } catch (SQLException ex) {
                Logger.getLogger(DataTransac.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public int ajouterProgrammeur(String matricule, String nom, String prenom, String adresse, String pseudo, String responsable, 
            String hobby, Date naissance, Date embauche) {
         
        try {
            pstmt = dbConn.prepareStatement(Constante.REQUETE_INSERTION);
            pstmt.setString(1,matricule);
            pstmt.setString(2, nom);
            pstmt.setString(3, prenom);
            pstmt.setString(4, adresse);
            pstmt.setString(5, pseudo);
            pstmt.setString(6, responsable);
            pstmt.setString(7, hobby);
            pstmt.setDate(8, naissance);
            pstmt.setDate(9, embauche);
            rs = pstmt.executeQuery();
            
        } catch (SQLException ex) {
            Logger.getLogger(DataTransac.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        }
        return 0;
    }

    
   
    @Override
   public int modifierProgrammeur(int id, int matricule, String nom, String prenom, String adresse, String pseudo, String responsable, String hobby, Date naissance,
            Date embauche) {      
        try {
            pstmt = dbConn.prepareStatement(Constante.REQUETE_MODIF);
            pstmt.setInt(1, matricule);
            pstmt.setString(2, nom);
            pstmt.setString(3, prenom);
            pstmt.setString(4, adresse);
            pstmt.setString(5, pseudo);
            pstmt.setString(6, responsable);
            pstmt.setString(7, hobby);
            pstmt.setDate(8, naissance);
            pstmt.setDate(9, embauche);
            pstmt.setInt(10, id);
            
            rs = pstmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DataTransac.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        }
        return 0;
    }
    
}
