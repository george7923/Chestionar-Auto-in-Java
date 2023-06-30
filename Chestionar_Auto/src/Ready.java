import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;

import javax.swing.*;

import javax.imageio.ImageIO;


public class Ready extends JFrame {
	private JLabel r1;
	private JLabel r2;
	private JLabel r3;
	private JButton Ready1;
	private JButton Exit;
	private BufferedImage DRPCIV;
	private JLabel DRPCIV_Image;
	private GestorEvenimente GE;
	
	    Ready() throws IOException {
		super("Atentie incepe Examenul!");
		r1 = new JLabel("Atenție, începe examenul! Testul conține 26 de întrebări și se încheie la expirarea timpului de 30 de minute sau la depășirea a 4 răspunsuri greșite!");
		
		Exit = new JButton("Exit");
			BufferedImage DRPCIV = ImageIO.read(new File("site-logo.png"));
		
		JLabel DRPCIV_Image = new JLabel(new ImageIcon("site-logo.png"));
		Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent c) {
				System.exit(0);
			}
		});
		GE = new GestorEvenimente();
		JPanel P1 = new JPanel(new GridLayout(4,4,4,4));
		JPanel P2 = new JPanel(new GridLayout(3,3,1,1));
		JPanel P3 = new JPanel(new GridLayout(2,2,1,1));
		P1.add(DRPCIV_Image);
		P1.add(r1);
		
		
		
		getContentPane().add(P1,BorderLayout.NORTH);
		
		
		Ready1 = new JButton("READY");
		Ready1.addActionListener(GE);
		P3.add(Ready1);
		P3.add(Exit);
		getContentPane().add(P3,BorderLayout.SOUTH);
		
		
	}
	    private class GestorEvenimente implements ActionListener{
	    	private InterfataExamen Examen;
	    	public void actionPerformed(ActionEvent e) {
	    		if(e.getSource() == Ready1) {
	    			Ready.this.dispose();
	    			Examen = new InterfataExamen();
	    			Examen.setVisible(true);
	    			Examen.setSize(600, 600);
	    			
	    		}
	    	}
	    }
	
	
}
