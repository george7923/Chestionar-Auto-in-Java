import java.util.*;
import java.io.*;
import javax.swing.*;
public class AgendaCursanti{
    private TreeSet<Cursant> ts;
    private BufferedReader br;
    private PrintWriter pw;
    private String l;
    private Cursant cursant;

    private static AgendaCursanti instanta;


    private AgendaCursanti(){
        File f=new File("DATE_UTILIZATOR.txt");
        ts=new TreeSet<>();
        if (f.exists()){
            try{
                br=new BufferedReader(new FileReader(f));
                while((l=br.readLine())!=null){
                    String[] s=l.split(", ");
                    cursant = new Cursant(s[0],s[0],s[0]);
                    ts.add(cursant);
                }
                    
                
            }
            catch(IOException ioe){
                ioe.printStackTrace();
            }
        }
        else System.out.println("Fisierul nu exista");
    }
    public String getCursant(){
        StringBuffer ret = new StringBuffer();
        Iterator<Cursant> it=ts.iterator();
        while(it.hasNext()) ret.append(it.next()+"\n");
        return ret.toString();
    }

    public void adaugaCursant(String username, String parola, String email){
        cursant=new Cursant(username, parola, email);
        if(ts.contains(cursant)){
            JOptionPane.showMessageDialog(null, "Cursantul este deja inregistrat","Atentie!",JOptionPane.ERROR_MESSAGE);
            return;
        }
        ts.add(cursant);
        JOptionPane.showMessageDialog(null,"Cursantul a fost inregistrat cu succes","Atentie!",JOptionPane.INFORMATION_MESSAGE);
    }

    public void stergeCursant(String username){
        Iterator<Cursant> it=ts.iterator();
        while(it.hasNext()){
            if(username.equalsIgnoreCase(it.next().getUsername())){
                it.remove();
                JOptionPane.showMessageDialog(null, "Cursantul a fost sters din baza de date", "Atentie!", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
        JOptionPane.showMessageDialog(null,"Fisa nu se gaseste in baza de date");
    }
    public void modifcaCursant(String username){
        Iterator<Cursant> jt =ts.iterator();
        while(jt.hasNext()){
            if(username.equalsIgnoreCase(jt.next().getUsername())){
            String changeName = JOptionPane.showInputDialog("Introduceti un nou nume de utilizator");
            String changePass = JOptionPane.showInputDialog("Introduceti o noua parola");
            String changeMail = JOptionPane.showInputDialog("Introduceti o noua adresa de email");
            jt.remove();
            cursant= new Cursant(changeName, changePass, changeMail);
            ts.add(cursant);
            JOptionPane.showMessageDialog(null, "Datele cursantului au fost modificate", "Atentie!", JOptionPane.INFORMATION_MESSAGE);
            return;

            }
        }
        JOptionPane.showMessageDialog(null,"Cursantul nu se gaseste in baza de date");
    }
    
    public String cautaCursant(String nume){
    for(Cursant f: ts)	if(nume.equals(f.getUsername())) return f.toString();
    return "nu exista nicio fisa cu numele "+ nume;
}

    public void salveaza(){
        try{
            pw=new PrintWriter(new FileWriter("DATE_UTILIZATOR.txt"));
            for(Cursant f:ts)pw.println(f);
            pw.close();
        }catch(IOException e){e.printStackTrace();}
    }
    public static AgendaCursanti getInstanta(){
        if(instanta==null) instanta=new AgendaCursanti();
        return instanta;
    }



}