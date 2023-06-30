/*
import javax.swing.*;
import javax.swing.Timer;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
public class Corecturi extends JFrame{
	private JLabel intr;
	
	private JLabel rasp1;
	private JLabel rasp2;
	private JLabel rasp3;
	
	private JButton exit;
	private JButton next;
	private static InterfataExamen ie;
	
	public Corecturi() {
		JButton exit = new JButton("IESIRE");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent c) {
				System.exit(0);
			}
		});
		JLabel intr = new JLabel();
		
		JLabel rasp1 = new JLabel();
		JLabel rasp2 = new JLabel();
		JLabel rasp3 = new JLabel();
		
		
		int in;
		
		ArrayList<String>ListQuestions = ie.getIntrebarileGresite();
        ArrayList<String>ListAnswers1 = ie.getRaspCorect1();
        ArrayList<String>ListAnswers2 = ie.getRaspCorect2();
        ArrayList<String>ListAnswers3 = ie.getRaspCorect3();
		ArrayList<Integer>  i = ie.getIndexGresit();
		
		int[] a = new int[4];
		a[0] = (int) i.get(0);
		a[1] = i.get(1);
		a[2] = i.get(2);
		a[3] = i.get(3);
		
		
		String q = ListQuestions.get(0);
		intr.setText(q);
		
		int indexLista = ListQuestions.size();
		int j = 0;
		
		if(a[0] == 0||a[0] == 1||a[0] == 2||a[0] == 3||a[0] == 4||a[0] == 5||a[0] == 6||a[0] == 7||a[0] == 8||a[0] == 9||a[0] == 10) {
			String raspCorect = ListAnswers1.get(a[0]);
			rasp1.setText(raspCorect);
		}else if(a[0] == 11||a[0] == 12||a[0] == 13||a[0] == 14||a[0] == 15||a[0] == 16||a[0] == 17||a[0] == 18||a[0] == 19||a[0] == 20||a[0] == 21||a[0] == 22) {
			String raspCorect = ListAnswers1.get(a[0]);
			String raspCorect2 = ListAnswers2.get(a[0]);
			rasp1.setText(raspCorect);
			rasp2.setText(raspCorect2);
		}else {
			String raspCorect = ListAnswers1.get(a[0]);
			String raspCorect2 = ListAnswers2.get(a[0]);
			String raspCorect3 = ListAnswers1.get(a[0]);
			rasp1.setText(raspCorect);
			rasp2.setText(raspCorect2);
			rasp3.setText(raspCorect3);
			
		}
		JButton next = new JButton("Urmatoarea");
		
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent c) {
				int j=1;
				
				while(j<=indexLista) {
					String q = ListQuestions.get(j);
					intr.setText(q);
					if(a[j] == 0||a[j] == 1||a[j] == 2||a[j] == 3||a[j] == 4||a[j] == 5||a[j] == 6||a[j] == 7||a[j] == 8||a[j] == 9||a[j] == 10) {
						String raspCorect = ListAnswers1.get(indexLista);
						rasp1.setText(raspCorect);
					}else if(a[j] == 11||a[j] == 12||a[j] == 13||a[j] == 14||a[j] == 15||a[j] == 16||a[j] == 17||a[j] == 18||a[j] == 19||a[j] == 20||a[j] == 21||a[j] == 22) {
						String raspCorect = ListAnswers1.get(indexLista);
						String raspCorect2 = ListAnswers2.get(indexLista);
						rasp1.setText(raspCorect);
						rasp2.setText(raspCorect2);
					}else {
						String raspCorect = ListAnswers1.get(indexLista);
						String raspCorect2 = ListAnswers2.get(indexLista);
						String raspCorect3 = ListAnswers1.get(indexLista);
						rasp1.setText(raspCorect);
						rasp2.setText(raspCorect2);
						rasp3.setText(raspCorect3);	
					
				}
					j++;
			}
			}
		});
		JPanel P1 = new JPanel();
		JPanel P2 = new JPanel();
		P1.add(intr);
		P1.add(rasp1);
		P1.add(rasp2);
		P1.add(rasp3);
		P2.add(next);
		P2.add(exit);
		add(P1,BorderLayout.NORTH);
		add(P2,BorderLayout.SOUTH);
		
}
	public static void main(String[] args) {
JFrame IEFrame = new Corecturi();
    
        
        IEFrame.setSize(1020, 770);
        IEFrame.setVisible(true);
        IEFrame.setResizable(false);
        IEFrame.setLocationRelativeTo(null);
        IEFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
*/