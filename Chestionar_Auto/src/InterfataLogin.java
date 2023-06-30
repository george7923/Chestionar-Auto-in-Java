import javax.swing.*;
import java.io.*;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfataLogin extends JFrame{
    private JLabel nume, password,rol,catLabel;
    private JTextField tField;
    private JPasswordField pField;
    private JButton OKButton, Close,Sign_Up;
    private JComboBox roluriBox,categorie;
    private GestorEvenimentLIN ec;
    private GestorEvenimentINR in;
    private File DATE;

    InterfataLogin(){
        super("Login");
        nume = new JLabel("Nume de utilizator:");
        password = new JLabel("Parola:");
        rol = new JLabel("Rol:");
        catLabel = new JLabel("Categorie:");
        tField = new JTextField(1);
        pField = new JPasswordField();
        OKButton = new JButton("Login");
        Close = new JButton("Inchide");
        Sign_Up = new JButton("Sign-Up");
        String[] rolesString={"Student","Admin"};
        String[] categorii={"B","A","C","D","Tr"};
        roluriBox = new JComboBox<>(rolesString);
        categorie = new JComboBox<>(categorii);

        Close.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent c){
                System.exit(0);
            }
        });
        

        JPanel logPanel = new JPanel(); //Panoul pentru logare
        logPanel.setLayout(new GridLayout(4,2,4,7));
        logPanel.add(nume);
        logPanel.add(tField);
        logPanel.add(password);
        logPanel.add(pField);
        logPanel.add(rol); 
        logPanel.add(roluriBox);
        logPanel.add(catLabel);
        logPanel.add(categorie);
        this.add(logPanel);
        
        JPanel bPanel = new JPanel(); //Panoul pentru butoane;
        
        bPanel.add(OKButton);
        bPanel.add(Close);
        bPanel.add(Sign_Up);
        this.add(bPanel,BorderLayout.SOUTH);
        ec = new GestorEvenimentLIN();
        in = new GestorEvenimentINR();
        OKButton.addActionListener(ec);  
        Sign_Up.addActionListener(in);

    }

    private class GestorEvenimentINR implements ActionListener{
        SignUp sgn;
        public void actionPerformed(ActionEvent sup){
            if(sup.getSource()==Sign_Up){
                InterfataLogin.this.dispose();
               
					sgn = new SignUp();
				
					
					
                sgn.setSize(500, 500);
                sgn.setLocationRelativeTo(null);
                sgn.setVisible(true);

            }
        }

    }

    private class GestorEvenimentLIN implements ActionListener{
    	FereastraAdmin RD;
        public void actionPerformed(ActionEvent e){
        	
            if(e.getSource()==OKButton){
                int i=0;
                File inputFile = new File("DATE_UTILIZATOR.txt");
                String uName = tField.getText();
                String pWord = new String(pField.getPassword());
                String cBox = (String) roluriBox.getSelectedItem();
                try{
                    Scanner in = new Scanner(new File("DATE_UTILIZATOR.txt"));
                    while(in.hasNextLine()){

                        String s=in.nextLine();
                        String[] sVector = s.split(", ");
                        //System.out.println(sVector[0]);
                        //System.out.println(sVector[1]);
                        if(uName.equalsIgnoreCase(sVector[0]) && pWord.equals(sVector[1]) && cBox.equals("Student") ){
                            JOptionPane.showMessageDialog(null, "V-ati logat cu success!","Succes",JOptionPane.INFORMATION_MESSAGE);
                            InterfataLogin.this.dispose();
                            RD = new FereastraAdmin();
                            RD.setSize(600, 600);
                            RD.setVisible(true);
                            break;
                        }
                        else if(uName.equalsIgnoreCase("admin")&&pWord.equals("artyom123")&&cBox.equals("Admin")){
                            JOptionPane.showMessageDialog(null, "V-ati logat cu success!","Succes",JOptionPane.INFORMATION_MESSAGE);
                            InterfataLogin.this.dispose();
                            RD = new FereastraAdmin();
                            RD.setSize(600, 600);
                            RD.setVisible(true);
                            break;
                        }
                        else if(uName.equals("")&&pWord.equals("")&&(cBox.equals("Admin")||cBox.equals("Student"))){
                            JOptionPane.showMessageDialog(null, "Parola sau numele de utilizator au fost introduse gresit, incercati din nou!","Eroare",JOptionPane.ERROR_MESSAGE);
                        }
                        else{
                            continue;
                        }
                    
                    }
                    
                }catch(IOException E){
                    JOptionPane.showMessageDialog(null, "Fisierul nu a fost gasit", "Eroare", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
 }
        
    

    

    
}



    








