import javax.swing.*;
import javax.swing.Timer;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
public class Picat extends JFrame {
	JLabel Picat;
	JLabel AtiPicatExamenul;
	JButton Exit;
	
	public Picat() {
		super("Picat!");
		Picat = new JLabel("                                                          PICAT!");
		Picat.setForeground(new Color(178, 34, 34));
		Picat.setFont(new Font("Perpetua Titling MT", Font.BOLD | Font.ITALIC, 16));
		AtiPicatExamenul = new JLabel("                                   Ati picat examenul!");
		AtiPicatExamenul.setForeground(new Color(220, 20, 60));
		AtiPicatExamenul.setFont(new Font("Garamond", Font.BOLD, 15));
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
					Picat.this.dispose();
					JFCorecturi = new Corecturi();
	    			JFCorecturi.setVisible(true);
	    			JFCorecturi.setSize(720, 480);
				}
			}
		});*/
		JPanel P1 = new JPanel(new GridLayout(2,2,1,1));
		JPanel P2 = new JPanel(new GridLayout(1,1,1,1));
		JPanel P3 = new JPanel(new GridLayout(1,1,1,1));
		P1.add(Picat);
		P1.add(AtiPicatExamenul);
		getContentPane().add(P1,BorderLayout.CENTER);
		P2.add(Exit);
		getContentPane().add(P2,BorderLayout.SOUTH);
	}
	
}
