import javax.swing.*;
import javax.swing.Timer;
import javax.swing.JOptionPane;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class InterfataExamen extends JFrame {
	//ArrayList<Integer> IndexGresit = new ArrayList<Integer>();
	//ArrayList<String> IntrebareGresita = new ArrayList<String>();
    //ArrayList<String> CAnswer = new ArrayList<String>();
    //ArrayList<String> CAnswer2 = new ArrayList<String>();
    //ArrayList<String> CAnswer3 = new ArrayList<String>();
    JLabel intr;
    JLabel ScorulBun;
    JLabel ScorulRau;
    JLabel CateIntrebari;
    JLabel Fotografie;
    JCheckBox r1,r2,r3;
    JButton confirma,stergeRaspuns,skip;
    JLabel  Cronom;
    Timer TimpulDisponibil;
    private int indexLista;
    private int IndexTotal = 3*indexLista;
    private String quest;
    private static InterfataExamen Instanta;
    private String NouaIntrebare;
    
    int second = 0, minute = 30;
    int score = 0, score_negative = 0;
    int contorIntrebari = 0;
    String ddSecond, ddMinute;
    DecimalFormat dFormat = new DecimalFormat("00");
    public boolean Selectat(JCheckBox b) {
    	if(b.isSelected()) {
    		return true;
    	}else {
    		return false;
    	}
    }
    
    public InterfataExamen(){
    	
        super("Examen Auto");
        
        intr = new JLabel();
        Fotografie = new JLabel();
        r1= new JCheckBox();
        r2= new JCheckBox();
        r3= new JCheckBox();
        ScorulBun = new JLabel();
        ScorulBun.setForeground(new Color(0, 128, 0));
        ScorulRau = new JLabel();
        ScorulRau.setForeground(new Color(178, 34, 34));
        CateIntrebari = new JLabel();
        
        Intrebari intrebari = new Intrebari();
        Imagini imagini = new Imagini();
        
        ArrayList<ImageIcon> ListImages = imagini.getImagini();
        ArrayList<String>ListQuestions = intrebari.getIntrebari();
        ArrayList<String>ListAnswers = intrebari.getRaspuns();
        //ArrayList<Integer> IndexGresit = new ArrayList<Integer>();
        
        
        
        
       
        //ArrayList<String> WrongQuestion = new ArrayList<String>();
        //ArrayList<String>WrongAns = new ArrayList<String>();
        
       
        int u = 0;
        Random random = new Random();
        if(u==0) {
        
        indexLista = random.nextInt(ListQuestions.size());
        IndexTotal = 3*indexLista;
        
        quest = ListQuestions.get(indexLista);
        u++;
        }
        	
        if(contorIntrebari<1) {
        if(indexLista >=0 && indexLista <=10 ) {
        	
        	String RaspunsuriCorecte = ListAnswers.get(IndexTotal);
        	String RaspunsuriGresite = ListAnswers.get(IndexTotal+1);
        	String RaspunsuriGresite2 = ListAnswers.get(IndexTotal+2);
        	r1.setText(RaspunsuriCorecte);
        	r2.setText(RaspunsuriGresite);
        	r3.setText(RaspunsuriGresite2);
        	if(indexLista==8||indexLista==9||indexLista==10) {
        		ImageIcon Foto = ListImages.get(indexLista);
        		Fotografie.setIcon(Foto);
        		
        	}
        	//22
        }else if(indexLista>=11&&indexLista<=22) {
        	String RaspunsuriCorecte = ListAnswers.get(IndexTotal);
        	String RaspunsuriCorecte2 = ListAnswers.get(IndexTotal+1);
        	String RaspunsuriGresite = ListAnswers.get(IndexTotal+2);
        	r1.setText(RaspunsuriCorecte);
        	r2.setText(RaspunsuriCorecte2);
        	r3.setText(RaspunsuriGresite);
        	if(indexLista==8||indexLista==9||indexLista==10) {
        		ImageIcon Foto = ListImages.get(indexLista);
        		Fotografie.setIcon(Foto);
        		
        	}
        }else {
        	String RaspunsuriCorecte = ListAnswers.get(IndexTotal);
        	String RaspunsuriCorecte2 = ListAnswers.get(IndexTotal+1);
        	String RaspunsuriCorecte3 = ListAnswers.get(IndexTotal+2);
        	r1.setText(RaspunsuriCorecte);
        	r2.setText(RaspunsuriCorecte2);
        	r3.setText(RaspunsuriCorecte3);
        	if(indexLista==8||indexLista==9||indexLista==10) {
        		ImageIcon Foto = ListImages.get(indexLista);
        		Fotografie.setIcon(Foto);
        		
        	}
        }
        intr.setText(quest);
        }
        
        
        TimpulDisponibil = new Timer(1000, null);
        Cronom = new JLabel();
        Cronom.setFont(new Font("Tahoma", Font.BOLD, 22));
        
        confirma = new JButton("Confirma");
        stergeRaspuns = new JButton("Sterge Raspunsurile");
        skip = new JButton("Treci peste");
        stergeRaspuns.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent q) {
        		
        	
        	r1.setSelected(false);
        	r2.setSelected(false);
        	r3.setSelected(false);
        	}
        });
        confirma.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent a) {
        		
        		if(indexLista >=0 && indexLista <=10) {
        			
        			if(Selectat(r1)==true && Selectat(r2)==false && Selectat(r3)==false) {
        				score++;
        				r1.setSelected(false);
        				r2.setSelected(false);
        				r3.setSelected(false);
        				
        			}else {
        				JOptionPane.showMessageDialog(null,"Ai Raspuns gresit! Raspunsul corect este "+r1.getText());
        				score_negative++;
        				
        				//IntrebareGresita.add(quest);
        				//CAnswer.add(r1.getText());
        				//CAnswer2.add(null);
        				//CAnswer3.add(null);
        				
        				r1.setSelected(false);
        				r2.setSelected(false);
        				r3.setSelected(false);
        				
        				
        			}
        		}else if(indexLista>=11&&indexLista<=22) {
        			if(Selectat(r1)==true && Selectat(r2)==true && Selectat(r3)==false) {
        				score++;
        				r1.setSelected(false);
        				r2.setSelected(false);
        				r3.setSelected(false);
        			}else {
        				score_negative++;
        				//IntrebareGresita.add(quest);
        				//CAnswer.add(r1.getText());
        				//CAnswer2.add(r2.getText());
        				//CAnswer3.add(null);
        				
        				r1.setSelected(false);
        				r2.setSelected(false);
        				r3.setSelected(false);
        				JOptionPane.showMessageDialog(null,"Ai Raspuns gresit! Raspunsul corect este "+r1.getText()+" ȘI  "+r2.getText());
        				
        			}
        		}else {
        			if(Selectat(r1)==true && Selectat(r2)==true && Selectat(r3)==false) {
        				score++;
        				r1.setSelected(false);
        				r2.setSelected(false);
        				r3.setSelected(false);
        			}else {
        				score_negative++;
        				//IntrebareGresita.add(quest);
        				//CAnswer.add(r1.getText());
        				//CAnswer2.add(r2.getText());
        				//CAnswer3.add(r3.getText());
        				
        				r1.setSelected(false);
        				r2.setSelected(false);
        				r3.setSelected(false);
        				JOptionPane.showMessageDialog(null,"Ai Raspuns gresit! Raspunsul corect este "+r1.getText()+" ,  "+r2.getText() +" ȘI  "+r3.getText());
        				
        			}
        		}
        		if(score!=26||contorIntrebari!=26) {
        			indexLista = random.nextInt(ListQuestions.size());
        			NouaIntrebare = ListQuestions.get(indexLista);
        			intr.setText(NouaIntrebare);
        			if(indexLista == 0||indexLista == 1||indexLista == 2||indexLista == 3||indexLista == 4||indexLista == 5||indexLista == 6||indexLista == 7||indexLista == 8||indexLista == 9||indexLista == 10 ) {
        	        	
        	        	String RaspunsuriCorecteNou = ListAnswers.get(3*indexLista);
        	        	String RaspunsuriGresiteNou = ListAnswers.get(3*indexLista+1);
        	        	String RaspunsuriGresiteNou2 = ListAnswers.get(3*indexLista+2);
        	        	r1.setText(RaspunsuriCorecteNou);
        	        	r2.setText(RaspunsuriGresiteNou);
        	        	r3.setText(RaspunsuriGresiteNou2);
        	        	if(indexLista==8||indexLista==9||indexLista==10) {
        	        		ImageIcon Foto = ListImages.get(indexLista);
        	        		Fotografie.setIcon(Foto);
        	        		
        	        	}else {
        	        		ImageIcon Foto = ListImages.get(0);
        	        		Fotografie.setIcon(Foto);
        	        	}
        	        	
        	        	
        	        	
        	        }else if(indexLista == 11||indexLista == 12||indexLista == 13||indexLista == 14||indexLista == 15||indexLista == 16||indexLista == 17||indexLista == 18||indexLista == 19||indexLista == 20||indexLista == 21||indexLista == 22) {
        	        	String RaspunsuriCorecteNou = ListAnswers.get(3*indexLista);
        	        	String RaspunsuriCorecteNou2 = ListAnswers.get(3*indexLista+1);
        	        	String RaspunsuriGresiteNou = ListAnswers.get(3*indexLista+2);
        	        	r1.setText(RaspunsuriCorecteNou);
        	        	r2.setText(RaspunsuriCorecteNou2);
        	        	r3.setText(RaspunsuriGresiteNou);
        	        	if(indexLista==8||indexLista==9||indexLista==10) {
        	        		ImageIcon Foto = ListImages.get(indexLista);
        	        		Fotografie.setIcon(Foto);
        	        		
        	        	}else {
        	        		ImageIcon Foto = ListImages.get(0);
        	        		Fotografie.setIcon(Foto);
        	        	}
        	        	
        	        }else {
        	        	String RaspunsuriCorecteNou = ListAnswers.get(3*indexLista);
        	        	String RaspunsuriCorecteNou2 = ListAnswers.get(3*indexLista+1);
        	        	String RaspunsuriCorecteNou3 = ListAnswers.get(3*indexLista+2);
        	        	r1.setText(RaspunsuriCorecteNou);
        	        	r2.setText(RaspunsuriCorecteNou2);
        	        	r3.setText(RaspunsuriCorecteNou3);
        	        	if(indexLista==8||indexLista==9||indexLista==10) {
        	        		ImageIcon Foto = ListImages.get(indexLista);
        	        		Fotografie.setIcon(Foto);
        	        		
        	        	}else {
        	        		ImageIcon Foto = ListImages.get(0);
        	        		Fotografie.setIcon(Foto);
        	        	}
        	        	
        	        }
        		}
        		contorIntrebari++;
        		String Scor = String.valueOf(score);
                String ScorGresit = String.valueOf(score_negative);
                String IntrebariRspDeja = String.valueOf(contorIntrebari);
        		ScorulBun.setText("Raspunsuri Corecte: "+Scor);
                ScorulRau.setText("Raspunsuri Gresite: "+ScorGresit);
                CateIntrebari.setText("Intrebari deja raspunse: "+IntrebariRspDeja);
                
                if(score==26||(contorIntrebari==26&&score_negative<=4)) {
                	InterfataExamen.this.dispose();
                	Admis f1 = new Admis();
                	
                	f1.setVisible(true);
                	f1.setSize(700,600);
                	
                }
                if(score_negative >4 || (minute==0&&second==0)) {
                	InterfataExamen.this.dispose();
                	Picat f2 = new Picat();
                	f2.setVisible(true);
                	f2.setSize(700,600);
                }
        	}
        });
        stergeRaspuns.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent b) {
        		
        	}
        });
        skip.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent c) {
        		int indexLista = random.nextInt(ListQuestions.size());
    			String NouaIntrebare = ListQuestions.get(indexLista);
    			intr.setText(NouaIntrebare);
    			if(indexLista == 0||indexLista == 1||indexLista == 2||indexLista == 3||indexLista == 4||indexLista == 5||indexLista == 6||indexLista == 7||indexLista == 8||indexLista == 9||indexLista == 10 ) {
    	        	
    	        	String RaspunsuriCorecteNou = ListAnswers.get(3*indexLista);
    	        	String RaspunsuriGresiteNou = ListAnswers.get(3*indexLista+1);
    	        	String RaspunsuriGresiteNou2 = ListAnswers.get(3*indexLista+2);
    	        	r1.setText(RaspunsuriCorecteNou);
    	        	r2.setText(RaspunsuriGresiteNou);
    	        	r3.setText(RaspunsuriGresiteNou2);
    	        	
    	        }else if(indexLista == 11||indexLista == 12||indexLista == 13||indexLista == 14||indexLista == 15||indexLista == 16||indexLista == 17||indexLista == 18||indexLista == 19||indexLista == 20||indexLista == 21||indexLista == 22) {
    	        	String RaspunsuriCorecteNou = ListAnswers.get(3*indexLista);
    	        	String RaspunsuriCorecteNou2 = ListAnswers.get(3*indexLista+1);
    	        	String RaspunsuriGresiteNou = ListAnswers.get(3*indexLista+2);
    	        	r1.setText(RaspunsuriCorecteNou);
    	        	r2.setText(RaspunsuriCorecteNou2);
    	        	r3.setText(RaspunsuriGresiteNou);
    	        }else {
    	        	String RaspunsuriCorecteNou = ListAnswers.get(3*indexLista);
    	        	String RaspunsuriCorecteNou2 = ListAnswers.get(3*indexLista+1);
    	        	String RaspunsuriCorecteNou3 = ListAnswers.get(3*indexLista+2);
    	        	r1.setText(RaspunsuriCorecteNou);
    	        	r2.setText(RaspunsuriCorecteNou2);
    	        	r3.setText(RaspunsuriCorecteNou3);
        	}
        	}
        });
        
        JPanel intPanel = new JPanel();
        intPanel.add(intr);
        
        getContentPane().add(intPanel,BorderLayout.NORTH);
        JPanel rPanel = new JPanel();
        rPanel.setLayout(new GridLayout(3,1,5,5));
        rPanel.add(r1);
        rPanel.add(r2);
        rPanel.add(r3);
        getContentPane().add(rPanel,BorderLayout.WEST);
        JPanel bPanel= new JPanel();
        bPanel.add(confirma);
        bPanel.add(stergeRaspuns);
        bPanel.add(skip);
        bPanel.add(ScorulBun);
        bPanel.add(ScorulRau);
        bPanel.add(CateIntrebari);
        bPanel.add(Cronom);
        JPanel IMGPanel = new JPanel();
        IMGPanel.add(Fotografie);
        getContentPane().add(IMGPanel,BorderLayout.EAST);
        
        getContentPane().add(bPanel,BorderLayout.SOUTH);
        Cronom.setText("30:00");
		
		countdownTimer();
		TimpulDisponibil.start();
        }
		


    
   
    public static InterfataExamen getInstanta() {
    	if(Instanta==null)
    		Instanta = new InterfataExamen();
    	return Instanta;
    }
    
   /* public  ArrayList<Integer> getIndexGresit(){
    	return IndexGresit;
    }
    public ArrayList<String> getIntrebarileGresite(){
    	return IntrebareGresita;
    }
    public ArrayList<String> getRaspCorect1(){
    	return CAnswer;
    }
    public ArrayList<String> getRaspCorect2(){
    	return CAnswer2;
    }
    public ArrayList<String> getRaspCorect3(){
    	return CAnswer3;
    }
    */
public  void countdownTimer() {
		
		Timer TimpulDisponibil = new Timer(1000, new ActionListener() {
			
			
			public void actionPerformed(ActionEvent h) {
				
				second--;
				 ddSecond = dFormat.format(second);
				 ddMinute = dFormat.format(minute);	
				Cronom.setText(ddMinute + ":" + ddSecond);
				
				if(second==-1) {
					second = 59;
					minute--;
					ddSecond = dFormat.format(second);
					ddMinute = dFormat.format(minute);	
					Cronom.setText(ddMinute + ":" + ddSecond);
				}
				
			}
		});	
		if(minute==0 && second==0) {
			TimpulDisponibil.stop();
		}
		TimpulDisponibil.start();	
}
	
	public static void main(String[] args){
        JFrame IEFrame = new InterfataExamen();
        JFrame a = new JFrame();
    
        
        IEFrame.setSize(1020, 770);
        IEFrame.setVisible(true);
        IEFrame.setResizable(false);
        IEFrame.setLocationRelativeTo(null);
        IEFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
		
		
		
			
		
			
			
    }
}
