import java.io.*;
import java.util.*;
public class Intrebari {
	private ArrayList<String> questions = new ArrayList<String>();
	private ArrayList<String> answers = new ArrayList<String>();
	
	public Intrebari() {
	
	//Intrebarea 0/1
	questions.add("Cum veți proceda dacă la intrarea într-o intersecție semaforul este pe semnalul de culoare verde, dar aceasta este blocată din cauza aglomerației?");
	answers.add("A. Opriți și așteptați deblocarea, după care pătrundeți în intersecție pe semnalul verde al semaforului");
	answers.add("B.  claxonați și găsiți o modalitate de a avansa printre celelalte vehicule");
	answers.add("C.  vă continuați deplasarea, deoarece semnalul verde vă permite acest lucru");
	//Intrebarea 1/2 
	questions.add("Ce obligații îi revin conducătorului de vehicul în momentul apropierii de o intersecție, dacă semnalul verde se schimbă cu cel galben?");
	answers.add("A.  să oprească autovehiculul în fața marcajului de oprire sau a marcajului pentru trecerea pietonilor ori în dreptul semaforului");
	answers.add("B.  să traverseze intersecția cu viteză redusă");
	answers.add("C.  să grăbească traversarea");
	//Intrebarea 2/3
	questions.add("Viteza maximă cu care pot să conducă un autoturism, pe drumurile naţionale, altele decât cele europene (E), persoanele care au mai puţin de un an de practică de conducere, este de:");
	answers.add("A.  70km/h");
	answers.add("B.  90km/h");
	answers.add("C.  80km/h");
	//Intrebarea 3/4
	questions.add("În care dintre următoarele situaţii sunteţi obligat să circulaţi cu o viteză care să nu depăşească 30 km/h în localităţi?");
	answers.add(" A.  pe drumurile cu denivelări semnalizate ca atare.");
	answers.add(" B.  la trecerile pentru pietoni semaforizate;");
	answers.add(" C.  la circulaţia pe poduri;");
	//Intrebarea 4/5
	
	questions.add("În care dintre următoarele situaţii sunteţi obligat să circulaţi cu viteză redusă?");
	answers.add(" A.  la trecerea la nivel cu calea ferată curentă;");
	answers.add(" B.  când sunteţi obosit şi autovehiculul are sistemul de frânare defect;");
	answers.add(" C.  pe drumurile judeţene şi comunale.");
	//Intrebarea 5/6
	questions.add("Cum se sancționează adoptarea unui comportament agresiv în conducerea vehiculelor pe drumurile publice, dacă prin aceasta s-a produs un accident de circulație din care au rezultat avarierea unui vehicul sau alte pagube materiale?");
	answers.add(" A.  amendă contravențională și suspendarea exercitării dreptului de a conduce pentru o perioadă de 60 de zile;");
	answers.add(" B.  suspendarea exercitării dreptului de a conduce pentru o perioadă de 120 de zile.");
	answers.add(" C.  anularea permisului de conducere;");

	//Intrebarea 6/7
	questions.add("În care dintre situaţii este interzis să circulaţi pe drumurile publice?");
	answers.add(" A.  atunci când vehiculul nu este asigurat de răspundere civilă, în caz de pagube materiale produse terților prin accidente de circulație, conform legii;");
	answers.add(" B.  atunci când certificatul de înmatriculare este deteriorat;");
	answers.add(" C.  atunci când conducătorul auto nu a plătit taxa de folosire a drumurilor publice.");
	//Intrebarea 7/8
	questions.add("Este permisă pătrunderea pe racordurile dintre cele două părţi carosabile ale unei autostrăzi?");
	answers.add(" A.  nu");
	answers.add(" B.  da, pentru oprire în caz de urgenţă;");
	answers.add(" C.  da, pentru întoarcere, în zona intersecţiilor.");
	//Intrebarea 8/9 (urmatoarele 3 intrebari sunt cu imagini).
	questions.add("Autocamionul s-a pus în mişcare. Cum este corect să procedaţi?");
	answers.add(" A.  opriţi în locul în care aveţi vizibilitate maximă, fără a depăşi indicatorul, vă asiguraţi şi traversaţi.");
	answers.add(" B.  traversaţi calea ferată cu viteză redusă;");
	answers.add(" C.  traversaţi imediat după autocamion;");
	//Intrebarea 9/10
	questions.add("În ce ordine vor trece autovehiculele prin intersecţia prezentată?");
	answers.add(" A.  tramvaiul 1, tramvaiul 2, autoturismul;");
	answers.add(" B.  tramvaiul 2, autoturismul, tramvaiul 1");
	answers.add(" C.  autoturismul, tramvaiul 1, tramvaiul 2");
	//Intrebarea 10/11 (
	questions.add("În ce ordine vor trece prin intersecţie cele trei autovehicule?");
	answers.add(" A.  autoturismul, autobuzul, autocamionul.");
	answers.add(" B.  autobuzul, autoturismul, autocamionul");
	answers.add(" C.  autocamionul, autoturismul, autobuzul");
	//Intrebarea 11/12 
	questions.add("În care dintre situaţiile de mai jos este interzisă întoarcerea?");
	answers.add(" A.  la întâlnirea indicatorului „Drum îngustat“.");
	answers.add(" B.  în curbele cu vizibilitatea redusă sub 50 m;");
	answers.add(" C.  la întâlnirea indicatorului „Drum cu prioritate“;");
	
	//Intrebarea 12/13 
	questions.add("Ce obligaţii aveţi când sesizaţi că urmează să fiţi depăşit de un alt autovehicul?");
	answers.add(" A.  să nu măriţi viteza de mers;");
	answers.add(" B.  să circulaţi cât mai aproape de marginea din dreapta a carosabilului sau a benzii pe care vă deplasaţi.");
	answers.add(" C.  să reduceţi viteza de mers;");
	//Intrebarea 13/14
	questions.add("Cum trebuie să procedaţi când circulaţi pe timp de noapte şi din sens opus se apropie un alt autovehicul?");
	answers.add(" A.  să folosiţi luminile de întâlnire de la cel puţin 200 m;");
	answers.add(" B.  să reduceţi viteza;");
	answers.add(" C.  să vă angajaţi cât mai aproape de marginea din dreapta a drumului.");
	//Intrebarea 14/15
	questions.add("Transportul persoanelor accidentate având hemoragii externe se va face:");
	answers.add(" A.  imediat după oprirea hemoragiei;");
	answers.add(" B.  imediat după ce s-a acordat asistenţă medicală de o către persoană calificată.");
	answers.add(" C.  imediat după sosirea unui mijloc de transport;");
	//Intrebarea 15/16 
	questions.add("În care dintre situaţii este interzisă întoarcerea vehiculului?");
	answers.add(" A.  în locurile în care oprirea este interzisă, cu excepţia intersecţiilor;");
	answers.add(" B.  în locul în care este instalat indicatorul cu semnificaţia „Întoarcerea interzisă“;");
	answers.add(" C.  în zona de acţiune a indicatorului „Staţionarea interzisă“.");
	//Intrebarea 16/17
	questions.add("Indicatorii de apreciere a stării sistemului de ungere sunt:");
	answers.add(" A.  consumul de ulei;");
	answers.add(" B.  presiunea uleiului.");
	answers.add(" C.  uşurinţa cu care se deplasează vehiculul;");
	//Intrebarea 17/18
	questions.add("Care dintre următoarele cauze determină descărcarea bateriei de acumulatori?");
	answers.add(" A.  defectarea releului regulator;");
	answers.add(" B.  folosirea excesivă a demarorului.");
	answers.add(" C.  arderera siguranţelor farurilor;");
	//Intrebarea 18/19
	questions.add("Cum trebuie să procedaţi când circulaţi pe timp de noapte şi din sens opus se apropie un alt autovehicul?");
	answers.add(" A.  să reduceţi viteza;");
	answers.add(" B.  să folosiţi luminile de întâlnire de la cel puţin 200 m;");
	answers.add(" C.  să vă angajaţi cât mai aproape de marginea din dreapta a drumului.");
	//Intrebarea 19/20
	questions.add("În sensul conducerii ecologice a unui autovehicul, se recomandă:");
	answers.add(" A.  să evitaţi transportul obiectelor inutile în portbagaj sau în habitaclu;");
	answers.add(" B.  să nu aveţi montat în permanenţă pe autovehicul portbagajul suplimentar;");
	answers.add(" C.  să utilizaţi spoilere şi faruri suplimentare.");
	//Intrebarea 20/21
	questions.add("Când se recomandă să opriţi motorul pentru a reduce consumul de combustibil?");
	answers.add(" A.  la culoarea roşie a unui semafor care, de regulă, durează foarte mult;");
	answers.add(" B.  în cazul unei opriri lungi la o trecere la nivel cu calea ferată;");
	answers.add(" C.  la semnalul poliţistului rutier făcut în acest sens.");
	//Intrebarea 21/22
	questions.add("Cum veţi proceda corect pentru a intra pe autostradă folosind banda de intrare (accelerare):");
	answers.add(" A.  veţi mări viteza, întrucât banda pe care circulaţi este special creată în acest scop;");
	answers.add(" B.  cedaţi trecerea autovehiculelor care circulă pe prima bandă a autostrăzii şi nu stânjeniţi în niciun fel circulaţia acestora;");
	answers.add(" C.  nu aveţi nicio obligaţie, deoarece autostrada are suficiente benzi pentru a permite circulaţia tuturor vehiculelor.");
	//Intrebarea 22/23
	questions.add("Când este permisă depăşirea prin stânga a tramvaielor aflate în mers?");
	answers.add(" A.  când între şina de tramvai din dreapta şi marginea trotuarului nu există suficient spaţiu pentru depăşire;");
	answers.add(" B.  atunci când drumul public este cu sens unic;");
	answers.add(" C.  In nicio situatie");
	//Intrebarea 23/24
	//DE AICI, SUNT INTREBARILE CU IMAGINI.
	questions.add("Cum trebuie să fie atelele pentru imobilizarea unei fracturi?");
	answers.add(" A.  suficient de lungi pentru a acoperi în întregime atât zona de deasupra, cât şi cea de sub fractură;");
	answers.add(" B.  Rigide");
	answers.add(" C.  Usoare");

	//Intrebarea 24/25
	questions.add("Se consideră contravenţie:");
	answers.add(" A.  nerespectarea prevederilor privind utilizarea diagramelor tahograf sau a cartelelor tahografice atunci când vehiculul este condus de un echipaj format din mai mulţi conducători auto;");
	answers.add(" B.  nerespectarea obligaţiei privind introducerea datelor în tahograf;");
	answers.add(" C.  nerespectarea prevederilor privind reglarea ceasului tahografului şi utilizarea comutatorului.");


	//Intrebarea 25/26
	questions.add("Ce categorii de vehicule au obligaţia de a folosi luminile de întâlnire pe timp de zi?");
	answers.add(" A.  autovehiculele care tractează alte vehicule sau care transportă produse periculoase.");
	answers.add(" B.  autovehiculele care însoţesc coloane militare sau transportă grupuri de persoane;");
	answers.add(" C.  motocicletele şi mopedele;");
	
	
	
	}
	public ArrayList<String> getIntrebari(){
		return questions;
	}
	public ArrayList<String> getRaspuns(){
		return answers;
	}
}
	

//
