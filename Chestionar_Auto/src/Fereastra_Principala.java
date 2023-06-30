import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Fereastra_Principala extends JFrame {
	private JButton SignUp,LogIn;
	private JLabel Text,TextIncurajare,Exit;
	private GestorEvenimente GE;
	public Fereastra_Principala() {
		super("Bine ati venit!");
		JLabel Text = new JLabel("                                                         Noi suntem solutia pentru 26/26!");
		Text.setFont(new Font("Yu Gothic Medium", Font.BOLD, 10));
		GE = new GestorEvenimente();
		Text.setForeground(new Color(0, 128, 0));
		Text.setBackground(new Color(128, 0, 0));
		Text.setVerticalAlignment(SwingConstants.TOP);
		SignUp = new JButton("SignUp");
		SignUp.addActionListener(GE);
		
		LogIn = new JButton("LogIn");
		LogIn.addActionListener(GE);
		JButton Exit = new JButton("Iesire");
		Exit.addActionListener(GE);
		JPanel p1 = new JPanel(new GridLayout(2,2,1,1));
		JPanel p2 = new JPanel(new GridLayout(1,3,1,1));
		JLabel TextIncurajare_1 = new JLabel("                                WELCOME!");
		TextIncurajare_1.setBackground(new Color(0, 0, 0));
		TextIncurajare_1.setForeground(new Color(233, 150, 122));
		TextIncurajare_1.setFont(new Font("Arial Black", Font.BOLD, 19));
		TextIncurajare_1.setVerticalAlignment(SwingConstants.BOTTOM);
		
		p1.add(TextIncurajare_1);
		p1.add(Text);
		getContentPane().add(p1,BorderLayout.CENTER);
		p2.add(SignUp);
		p2.add(LogIn);
		p2.add(Exit);
		getContentPane().add(p2,BorderLayout.SOUTH);
		
	}
	private class GestorEvenimente implements ActionListener{
		private SignUp sgn;
		private InterfataLogin log;
		
		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==SignUp) {
				Fereastra_Principala.this.dispose();
				SignUp sgn = new SignUp();
				sgn.setVisible(true);
				sgn.setSize(300, 400);
			
		}else if(e.getSource()==LogIn) {
			Fereastra_Principala.this.dispose();
			InterfataLogin log = new InterfataLogin();
			log.setVisible(true);
			log.setSize(300,400);
		}else {
				System.exit(0);
			
		}
	}
	}
	public static void main(String[] args) {
		Fereastra_Principala Fereastra = new Fereastra_Principala();
		Fereastra.setSize(620,670);
		Fereastra.setVisible(true);
		Fereastra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

