package projet_java2;

import javax.swing.*;

public class Frame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Frame() {
		super();
		build();
	}
	
	private void build() {
		setTitle("Mediatheque");
		setSize(500,500);
		setLocationRelativeTo(null);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
