import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FereastraAdmin extends JFrame {
    private JButton sterge,modifica,iesire,cautaButton;
    private JTextField cauta;
    private JTextArea rez;
    private GestorEvenimenteCT ct;

    public FereastraAdmin(){
        super("Administrare");
        sterge=new JButton("Sterge un utilizator");
        modifica=new JButton("Modifica datele unui utilizator");
        iesire= new JButton("Iesire");
        cautaButton = new JButton("Cauta cursant");
        cauta = new JTextField(20);
        rez= new JTextArea(25,25);
        rez.setEditable(false);
    
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        p1.add(sterge);
        p1.add(modifica);
        p1.setLayout(new GridLayout(2, 1));
        this.add(p1,new BorderLayout().EAST);
        p2.add(iesire);
        this.add(p2,new BorderLayout().SOUTH);
        p3.add(cauta);
        p3.add(cautaButton);
        

        this.add(p3,new BorderLayout().NORTH);
        p4.add(rez);
        new BorderLayout();
        this.add(p4,new BorderLayout().WEST);
        
        iesire.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent c){
                System.exit(0);
            }
        });
        ct= new GestorEvenimenteCT();
        cautaButton.addActionListener(ct);
        sterge.addActionListener(ct);
        modifica.addActionListener(ct);
    }



private class GestorEvenimenteCT implements ActionListener{
    private AgendaCursanti at;
    
    GestorEvenimenteCT(){
        at=AgendaCursanti.getInstanta();
        }
    
    public void actionPerformed(ActionEvent e){
if(e.getSource()==cautaButton){
    rez.setText(at.cautaCursant(cauta.getText()));
    cauta.setText("");

}
else if(e.getSource()==sterge){
    at.stergeCursant(rez.getSelectedText());
    at.salveaza();
}
else if(e.getSource()==modifica){
    at.modifcaCursant(rez.getSelectedText());
    at.salveaza();

}


}
}

    public static void main(String[] args){
        JFrame adFrame = new FereastraAdmin();
        adFrame.setSize(750, 200);
        adFrame.setVisible(true);
        adFrame.setLocationRelativeTo(null);
        adFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
