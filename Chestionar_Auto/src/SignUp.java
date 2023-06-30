import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp extends JFrame {
	private JLabel InsertUser, InsertPass,InsertEmail,TermeniSiConditii;
	private JTextField Username,Email;
	private JPasswordField Parola;
	private JComboBox CategoriePermis;
	private JButton SignIn,Exit;
	private GestorEvenimente GE;
	private static JCheckBox Termeni;
	public SignUp() {
		super("SignUp: Create your account");
		 InsertUser = new JLabel("Username:");
		 InsertPass = new JLabel("Password:");
		 InsertEmail = new JLabel("Email");
		 TermeniSiConditii = new JLabel("Sunteti de acord cu termenii si conditiile!");
		 Username = new JTextField(5);
		 Parola = new JPasswordField(5);
		 Email = new JTextField(5);
		GE = new GestorEvenimente();
		String[] Categorii = {"Categoria B","Categoria A","Categoria C","Categoria D","Categoria Tr"};
		 CategoriePermis = new JComboBox(Categorii);
		 SignIn = new JButton("SignIn");
		SignIn.addActionListener(GE);
		 Exit = new JButton ("Iesire");
		
		 Termeni = new JCheckBox ("Click aici ca sunteti de acord cu prelucrarea datelor personale",false);
		Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent c) {
				System.exit(0);
			}

			
		});
		JPanel p1 = new JPanel(new GridLayout(4,2,1,1));//Prima - nr linii, 2nd - coloane, 3rd,4th - distanta dintre linii si coloane
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel(new GridLayout(1,1,1,1));
		JPanel p4 = new JPanel(new GridLayout(1,1,1,1));
		
		p1.add(InsertUser);
		p1.add(Username);
		p1.add(InsertEmail);
		p1.add(Email);
		
		p1.add(InsertPass);
		p1.add(Parola);
		p1.add(TermeniSiConditii);
		add(p1,BorderLayout.NORTH);
		p2.add(CategoriePermis);
		p2.add(SignIn);
		p2.add(Exit);
		add(p2,BorderLayout.SOUTH);
		p3.add(Termeni);
		add(p3,BorderLayout.CENTER);
		
		
		
		
		
		
	}
	private void ScrieInFisier() {
		String nume = Username.getText();
		String email = Email.getText();
		String parola = new String(Parola.getPassword());
		try {
			Writer w = new BufferedWriter(new FileWriter("DATE_UTILIZATOR.txt",true));
			w.write(nume+", "+parola+", "+email);
			w.write("\r");
			w.close();
		}catch(IOException e){
				e.printStackTrace();
			}
			
	}
	public void AdaugaUtilizatori() {
		Cursant a = new Cursant(InsertUser.getText(), InsertPass.getText(), InsertEmail.getText());
		
		
	}
	
private class GestorEvenimente implements ActionListener{
		
		private Fereastra_Principala f;
		public void actionPerformed(ActionEvent e){
		if(e.getSource() == SignIn && Termeni.isSelected()) {
			f=new Fereastra_Principala();
			SignUp.this.dispose();
			f.setVisible(true);
			f.setSize(1300, 700);
			f.setLocationRelativeTo(null);
			ScrieInFisier();
			
		}
		else{
		JOptionPane.showMessageDialog(null,"Trebuie sa fiti de acord cu termenii si conditiile noastre!","Eroare", JOptionPane.ERROR_MESSAGE);
		}
		}
	
		
}
	
	
}

