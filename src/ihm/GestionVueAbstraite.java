/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Ssoj
 */
public abstract class GestionVueAbstraite extends JFrame implements ActionListener {
    /**
     * initialise la vue
     */
    public abstract void init();
    /**
     * observateur
     * @param e 
     */
    @Override
    public abstract void actionPerformed(ActionEvent e);
}
