package projet_java2;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Frame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frmMed;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new java.lang.Runnable() {
			public void run() {
				try {
					Frame window = new Frame();
					window.frmMed.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Frame() {
		super();
		build();
	}
	
	private void build() {
		frmMed = new JFrame();
		setTitle("Mediatheque");
		setSize(500,500);
		setLocationRelativeTo(null);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frmMed.getContentPane().setLayout(null);
	}

}
