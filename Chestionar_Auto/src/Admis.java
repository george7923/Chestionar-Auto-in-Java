import javax.swing.*;
import javax.swing.Timer;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
public class Admis extends JFrame {
	JLabel Admis;
	JLabel AtiPromovat;
	JButton Exit;
	
	public Admis() {
		super("Admis!");
		Admis = new JLabel("                                                          ADMIS!");
		Admis.setForeground(new Color(0, 128, 0));
		Admis.setFont(new Font("Rockwell Extra Bold", Font.BOLD | Font.ITALIC, 15));
		AtiPromovat = new JLabel("                          Felicitari!     Ati promovat examenul!");
		AtiPromovat.setForeground(new Color(0, 100, 0));
		AtiPromovat.setFont(new Font("Garamond", Font.BOLD, 14));
		JButton Exit = new JButton("Iesire");
		
		Exit.addActionListener(new ActionListener (){
			public void actionPerformed(ActionEvent z) {
				System.exit(0);
			}
			
		});
		/*CeAtiGresit.addActionListener(new ActionListener() {
			private Corecturi JFCorecturi;
			public void actionPerformed(ActionEvent y) {
				if(y.getSource()== CeAtiGresit) {
					Admis.this.dispose();
					JFCorecturi = new Corecturi();
	    			JFCorecturi.setVisible(true);
	    			JFCorecturi.setSize(720, 480);
				}
			}
		});*/
		JPanel P1 = new JPanel(new GridLayout(2,2,1,1));
		JPanel P2 = new JPanel(new GridLayout(1,1,1,1));
		JPanel P3 = new JPanel(new GridLayout(1,1,1,1));
		P1.add(Admis);
		P1.add(AtiPromovat);
		getContentPane().add(P1,BorderLayout.CENTER);
		P2.add(Exit);
		getContentPane().add(P2,BorderLayout.SOUTH);
		
	}
	
}
