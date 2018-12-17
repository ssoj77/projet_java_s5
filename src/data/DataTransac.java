/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Connection;
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
                prog.setPrenom(rs.getString("PRENOM"));
                prog.setNom(rs.getString("NOM"));
                prog.setAnNaissance(rs.getInt("ANNAISSANCE"));
                prog.setSalaire(rs.getFloat("SALAIRE"));
                prog.setPrime(rs.getFloat("PRIME"));
                prog.setPseudo(rs.getString("PSEUDO"));
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
                prog.setPrenom(rs.getString("PRENOM"));
                prog.setNom(rs.getString("NOM"));
                prog.setNaissance(rs.getDate("DATE_NAISS"));
                prog.setSalaire(rs.getFloat("SALAIRE"));
                prog.setPrime(rs.getFloat("PRIME"));
                prog.setPseudo(rs.getString("PSEUDO"));
            }
        } catch (SQLException sqle) {
            Logger.getLogger(DataTransac.class.getName()).log(Level.SEVERE, null, sqle);
        }
        return prog;
    }

    @Override
    public String afficherProgrammeurs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void fermerRessources() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int ajouterProgrammeur() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int modifierProgrammeur(int matricule) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
