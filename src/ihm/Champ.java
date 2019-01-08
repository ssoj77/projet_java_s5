/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihm;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import java.awt.event.FocusListener;
import java.awt.event.KeyListener;

/**
 *
 * @author Ssoj
 */
public class Champ extends JTextField implements FocusListener, KeyListener {
	
        private final String exemple;
	private final Font italic;
	private final Font normal;
        private final String type;
        private int key;

	public Champ(String t, String type) {
		super(t);
                this.type = type;
		this.exemple = t;
		this.setForeground(Color.gray);
		this.italic = new Font(Font.SANS_SERIF,Font.ITALIC,10);
		this.setFont(italic);
		this.normal = new Font(Font.SANS_SERIF,Font.CENTER_BASELINE,10);
		this.addFocusListener(this);
		this.addKeyListener(this);
		this.setEditable(false);
	}

        /**
         * Gère l'action de sélection du champ
         * @param e 
         */
	@Override
    public void focusGained(FocusEvent e) {
    	if (this.getText().equals(this.exemple)) {
    		this.setFont(normal);
    		this.setForeground(Color.black);
    		this.setText("");
    	}
    }

    /**
     * Gère l'action de déselection du champ
     * @param e 
     */
    @Override
    public void focusLost(FocusEvent e) {
        if (this.getText().equals("")) {
            this.setForeground(Color.gray);
            this.setFont(italic);
            this.setText(this.exemple);
        }
    }

    /**
     * Gère l'action de frrappe ur une touche
     * @param e 
     */
    @Override
    public void keyPressed(KeyEvent e) {
        if (type.equals("Texte"))
            return;
        key = e.getExtendedKeyCode();
    	if (key == 8) {
	        if (this.getText().length() != 0 ) {
	    		String text = this.getText();
	    		int end = text.length() - 1;
	    		this.setText(text.substring(0,end));
	        }
	    } 
    	if ((this.getText().length() < 2 && type.equals("Chiffre")) || (this.getText().length() < 5 && type.equals("Chiffre5"))) {
	    	if ((96 <= key) && (key <= 105)) {
	    		this.setText(this.getText()+e.getKeyChar());
	    	}
	    	if (key == 150) 
	    		this.setText(this.getText()+"1");
	    	if (key == 16777449) 
	    		this.setText(this.getText()+"2");
	    	if (key == 152)
	    		this.setText(this.getText()+"3");
	    	if (key == 222)
	    		this.setText(this.getText()+"4");
	    	if (key == 519)
	    		this.setText(this.getText()+"5");
	    	if (key == 45)
	    		this.setText(this.getText()+"6");
	    	if (key == 16777448)
	    		this.setText(this.getText()+"7");
	    	if (key == 523)
	    		this.setText(this.getText()+"8");
	    	if (key == 16777415)
	    		this.setText(this.getText()+"9");
	    	if (key == 16777440)
	    		this.setText(this.getText()+"0");
	    }
    }

        @Override
    public void	keyReleased(KeyEvent e) {

    }

        @Override
    public void keyTyped(KeyEvent e) {

    }
}