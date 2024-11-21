
// import java.awt.color.CMMException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.csvreader.CsvReader;
import com.xml.jaxb.Adhesion;
import com.xml.jaxb.Assure;
import com.xml.jaxb.Beneficiaire;
import com.xml.jaxb.CapGar;
import com.xml.jaxb.CollStatAssure;
import com.xml.jaxb.Contrat;
import com.xml.jaxb.Critere;
import com.xml.jaxb.Critere1;
import com.xml.jaxb.Critere10;
import com.xml.jaxb.Critere2;
import com.xml.jaxb.Critere3;
import com.xml.jaxb.Critere4;
import com.xml.jaxb.Critere5;
import com.xml.jaxb.Critere6;
import com.xml.jaxb.Critere7;
import com.xml.jaxb.Critere8;
import com.xml.jaxb.Critere9;
import com.xml.jaxb.Date;
import com.xml.jaxb.DateArrete;
import com.xml.jaxb.DateDerEchPrimePayee;
import com.xml.jaxb.DateEnvoi;
import com.xml.jaxb.DateGen;
import com.xml.jaxb.Delegataire;
import com.xml.jaxb.DerEchHP;
import com.xml.jaxb.DerMvt;
import com.xml.jaxb.DerRAPerFic;
import com.xml.jaxb.DerTxInt;
import com.xml.jaxb.Devise;
import com.xml.jaxb.Duree;
import com.xml.jaxb.IdEmetteur;
import com.xml.jaxb.Info;
import com.xml.jaxb.LstAdhesions;
import com.xml.jaxb.LstAssures;
import com.xml.jaxb.LstBeneficiaires;
import com.xml.jaxb.LstCollStatAssures;
import com.xml.jaxb.LstContrats;
import com.xml.jaxb.LstDelegataires;
import com.xml.jaxb.LstPrets;
import com.xml.jaxb.LstPrimes;
import com.xml.jaxb.LstReaContrats;
import com.xml.jaxb.MntCRDAprDerEch;
import com.xml.jaxb.MntCapInit;
import com.xml.jaxb.NatEch;
import com.xml.jaxb.NumContractant;
import com.xml.jaxb.ObjectFactory;
import com.xml.jaxb.PeriPaiPrimeAss;
import com.xml.jaxb.PeriodeAss;
import com.xml.jaxb.PeriodeEch;
import com.xml.jaxb.Pivot;
import com.xml.jaxb.Pret;
import com.xml.jaxb.Prime;
import com.xml.jaxb.Quotite;
import com.xml.jaxb.ReaContrat;
import com.xml.jaxb.SituationFam;
import com.xml.jaxb.SituationPro;
import com.xml.jaxb.SomMvt;
// import com.xml.jaxb.ActeGest;
// import com.xml.jaxb.Assiette;
// import com.xml.jaxb.CollStatPop;
// import com.xml.jaxb.Effectif;
// import com.xml.jaxb.LstActeGests;
// import com.xml.jaxb.LstCollStatPops;
// import com.xml.jaxb.LstPops;
// import com.xml.jaxb.Montant;
// import com.xml.jaxb.NumOrdre;
// import com.xml.jaxb.ObjectFactory;
// import com.xml.jaxb.Pop;


public class GenerarXMLATT {

	//LOCAL	
		private final static String RUTA = "/Fluxcnp/FLUXATT.XML";
		private final static String CSV = "/Fluxcnp/FLUXATT.CSV";
	//LOCAL


	/**
	 * Método recursivo, para recorrer todos los ficheros csv, y montar el arbol de nodos xml
	 * Lee el fichero CSV llamado pathFichero, usando como delimitador de columnas: "delimitador" 
	 * Cada fila del csv genera una llamada al método extraerDatosCSV, que extrae los datos del csv.
	 * @param pathFichero
	 * @param delimitador
	 * @return
	 */

	public static void leerCSV(String pathFichero,String ficheroXML,String delimitador, String nuevoPadre)
			throws Exception { 
		CsvReader csvReader = null;

		try {

			//Ponemos la ruta de acceso
			//File fichero = new File(pathRuta + pathFichero);
			File fichero = new File(pathFichero);
			FileReader freader = new FileReader(fichero);
			csvReader = new CsvReader(freader,delimitador.charAt(0));

			//	Objeto inicial 
			ObjectFactory object = new ObjectFactory();

			Pivot pivot = new Pivot();
			
			//Clases objeto generadas desde el xsd
			// FIC
			IdEmetteur emetteur = new IdEmetteur();
			PeriodeEch periode = new PeriodeEch();
			DateArrete datearr = new DateArrete();
			DateGen dategen = new DateGen(); 
			DateEnvoi dateenvoi = new DateEnvoi();
			// DEL
			Delegataire delegataire = new Delegataire();
			LstDelegataires lstDelegataires  = new LstDelegataires();
			LstReaContrats lstReaContrats = new LstReaContrats();
			// CNT
			ReaContrat reaContrat = new ReaContrat();
			LstContrats lstContrats = new LstContrats();
			Contrat contrat = new Contrat();
			NumContractant numContractant = new NumContractant();
			Devise devise = new Devise();
			// LstCollStatPops lstCollStatPops = new LstCollStatPops();
			// CollStatPop collStatPop = new CollStatPop();
			// LstPops lstPops = new LstPops();
			// Pop pop = new Pop();
			LstCollStatAssures lstCollStatAssures = new LstCollStatAssures();
			CollStatAssure collStatAssure = new CollStatAssure();
			
			// ASS
			LstAssures lstAssures = new LstAssures();
			Assure assure = new Assure();
			Info info = new Info();
			SituationPro situationPro = new SituationPro();
			SituationFam situationFam = new SituationFam();
			// ADH
			LstAdhesions lstAdhesions = new LstAdhesions();
			Adhesion adhesion = new Adhesion();
			PeriodeAss periodeAss = new PeriodeAss();
			DateDerEchPrimePayee dateDerEchPrimePayee = new DateDerEchPrimePayee();
			PeriPaiPrimeAss periPaiPrimeAss = new PeriPaiPrimeAss();
			DerMvt derMvt = new DerMvt();
			SomMvt somMvt = new SomMvt();
			CapGar capGar = new CapGar();
			LstBeneficiaires lstBeneficiaires = new LstBeneficiaires();
			Beneficiaire beneficiaire = new Beneficiaire();
			
			Critere critere = new Critere();
			Critere1 critere1 = new Critere1();
			Critere2 critere2 = new Critere2();
			Critere3 critere3 = new Critere3();
			Critere4 critere4 = new Critere4();
			Critere5 critere5 = new Critere5();
			Critere6 critere6 = new Critere6();
			Critere7 critere7 = new Critere7();
			Critere8 critere8 = new Critere8();
			Critere9 critere9 = new Critere9();
			Critere10 critere10 = new Critere10();

			// LstActeGests lstActeGests = new LstActeGests();
			// ActeGest acteGest = new ActeGest();

			// PRE
			Pret pret = new Pret();
			Date date = new Date();
			Duree duree = new Duree();
			DerEchHP derEchHP = new DerEchHP();
			DerRAPerFic derRAPerFic = new DerRAPerFic();
			Quotite quotite = new Quotite();
			LstPrets lstPrets = new LstPrets();
			MntCapInit mntCapInit = new MntCapInit();
			MntCRDAprDerEch mntCRDAprDerEch = new MntCRDAprDerEch();
			NatEch natEch = new NatEch();
			DerTxInt derTxInt = new DerTxInt();
			
			// PRI
			LstPrimes lstPrimes = new LstPrimes();
			Prime prime = new Prime();
			
			// NumOrdre numOrdre = new NumOrdre();
			// Assiette assiette = new Assiette();
			// Montant montant = new Montant();
			// Effectif effectif = new Effectif();

			String[] headers = null;           

			// Leemos las cabeceas del fichero (primera fila).
			// Leemos los registros del csv			  
			while(csvReader.readRecord()) {
				headers = csvReader.getValues();

				/////////////////////////////////////////
				//FILA CABECERA / PAG ///////////////////				
				if("FIC".equals(headers[0])){
					pivot = new Pivot();

					//Atributos tipo y numver
					pivot.setType(headers[1]);
					pivot.setNumVer(headers[2]);

					//Dategen
					dategen.setContent(headers[3]);
					pivot.setDateGen(dategen);

					//DateEnvoi
					dateenvoi.setContent(headers[4]);			  
					pivot.setDateEnvoi(dateenvoi);

					//Emetteur
					emetteur.setContent(headers[5]);
					pivot.setIdEmetteur(emetteur);

					//PeriodeEch
					periode.setDeb(headers[6]);
					periode.setFin(headers[7]);
					pivot.setPeriodeEch(periode);
					
					//DateArrete
					datearr.setContent(headers[8]);
					pivot.setDateArrete(datearr);
					
				}

				/////////////////////////////////////////
				//FILA DELEGATAIRES / DEL ///////////////
				if("DEL".equals(headers[0])){

					lstDelegataires.setNbr("");
					//Creamos el delegataire
					delegataire = new Delegataire();
					delegataire.setId(headers[1]);					
		
					lstDelegataires.getDelegataire().add(delegataire);
					pivot.setLstDelegataires(lstDelegataires);

					//Limpiamos listas de reaContrats
					lstReaContrats = new LstReaContrats(); 
					reaContrat = new ReaContrat();
				}

				/////////////////////////////////////////
				//FILA CONTRATAS / CNT //////////////////
				if("CNT".equals(headers[0])){
					//Contrats inicializamos los contratos y su lista de pops
					lstContrats = new LstContrats();
					contrat = new Contrat();
					numContractant = new NumContractant();
					devise = new Devise();
					// lstPops = new LstPops();
						
					
					//Informamos el contrato
					contrat.setIdCnp(headers[1]);
					contrat.setRefExterne(headers[2]);
					numContractant.setContent(headers[3]);
					contrat.setNumContractant(numContractant);		  		
					devise.setCode(headers[4]);
					devise.setNbrDec(headers[5]);
					contrat.setDevise(devise);

					//Añadimos el contrato a la lista
					// lstContrats.setNbr("");
					// lstContrats.getContrat().add(contrat);
					// Inicializamos lista contrats y reacontrats

					lstContrats.setNbr("");				
					lstContrats.getContrat().add(contrat);
					reaContrat.setLstContrats(lstContrats);
					
					// Incluimos el reContrats al delegataire
					lstReaContrats.setNbr("");
					lstReaContrats.getReaContrat().add(reaContrat);
					delegataire.setLstReaContrats(lstReaContrats);
					
					collStatAssure = new CollStatAssure();
					lstCollStatAssures = new LstCollStatAssures();
				}

				/////////////////////////////////////////
				//FILA ASEGURADOS  / ASS  /////////////////////
				if("ASS".equals(headers[0])){	
			
					//Inicializamos los Assuré
					lstAssures = new LstAssures();
					assure = new Assure();
					info = new Info();
					situationPro = new SituationPro();
					situationFam = new SituationFam();					
					
					//Id assuré
					assure.setId(headers[1]);
					
					//Atributos del info
					info.setNomMarital(headers[2]);
					info.setNomPatronym(headers[3]);
					info.setPrenom(headers[4]);
					info.setDateNais(headers[5]);
					info.setCodeSexe(headers[6]);
					info.setCodeDeptRes(headers[7]);
					info.setCodePaysRes(headers[8]);
					assure.setInfo(info);
					
					//Atributos del SituationPro
					situationPro.setCatProf(headers[9]);
					situationPro.setStatut(headers[10]);
					situationPro.setCatFonct(headers[11]);
					situationPro.setIndiceTraitFonctPub(headers[12]);
					situationPro.setTraitAnnIndiBrut(headers[13]);
					situationPro.setSalAnnBrutImp(headers[14]);
					assure.setSituationPro(situationPro);
					
					//Atributos del SituationFam
					situationFam.setSitFam(headers[15]);
					situationFam.setNbrEnf(headers[16]);
					situationFam.setNbrEnfHand(headers[17]);
					assure.setSituationFam(situationFam);
					
					//Añadimos el contrato a la lista
					/* lstAssures.setNbr("");
					lstAssures.getAssure().add(assure);	*/
					
					//Inicializamos la lista Adhesion
					// lstAdhesions = new LstAdhesions();
	 
					// Inicializamos CollStatAssure
					lstAssures.setNbr("");
					lstAssures.getAssure().add(assure);
					collStatAssure.setLstAssures(lstAssures); 
					
					// Incluimos el collStatAssures al contrat	
				    lstCollStatAssures.setNbr("");
					lstCollStatAssures.getCollStatAssure().add(collStatAssure);
					contrat.setLstCollStatAssures(lstCollStatAssures);
				
				}
				
				/////////////////////////////////////////
				//FILA ADHESIÓN  / ADH  /////////////////////
				if("ADH".equals(headers[0])){	
			
					//Inicializamos Adhésion y Criterios
					lstAdhesions = new LstAdhesions();	
					adhesion = new Adhesion();			
					lstBeneficiaires = new LstBeneficiaires();	
					beneficiaire = new Beneficiaire();		
					periodeAss = new PeriodeAss();				
					periPaiPrimeAss = new PeriPaiPrimeAss();
					dateDerEchPrimePayee = new DateDerEchPrimePayee();
					derMvt = new DerMvt();
					somMvt = new SomMvt();
					capGar = new CapGar();
					critere = new Critere();
					critere1 = new Critere1();
					critere2 = new Critere2();
					critere3 = new Critere3();
					critere4 = new Critere4();
					critere5 = new Critere5();
					critere6 = new Critere6();
					critere7 = new Critere7();
					critere8 = new Critere8();
					critere9 = new Critere9();
					critere10 = new Critere10(); 			
					
					//Id adhésion
					adhesion.setId(headers[1]);
					
					//PeriodeAss
					periodeAss.setDeb(headers[2]);
					periodeAss.setFin(headers[3]);
					adhesion.setPeriodeAss(periodeAss);
					
					//PeriPaiPrimerAss
					periPaiPrimeAss.setContent(headers[4]);
					adhesion.setPeriPaiPrimeAss(periPaiPrimeAss);
					
					//DateDerEchPrimePayee
					dateDerEchPrimePayee.setContent(headers[5]);
					adhesion.setDateDerEchPrimePayee(dateDerEchPrimePayee);
					
					//DerMvt
					derMvt.setSgn(headers[6]);
					derMvt.setMnt(headers[7]);
					adhesion.setDerMvt(derMvt);
					
					//SomMvt
					somMvt.setSgn(headers[8]);
					somMvt.setPrime(headers[9]);
					adhesion.setSomMvt(somMvt);
					
					//CapGar
					capGar.setBase(headers[10]);
					capGar.setReval(headers[11]);
					adhesion.setCapGar(capGar);
					
					//Critere1
					critere1.setType(headers[12]);
					critere1.setVal(headers[13]);
					critere.setCritere1(critere1);
					//Critere2
					critere2.setType(headers[14]);
					critere2.setVal(headers[15]);
					critere.setCritere2(critere2);
					//Critere3
					critere3.setType(headers[16]);
					critere3.setVal(headers[17]);
					critere.setCritere3(critere3);
					//Critere4
					critere4.setType(headers[18]);
					critere4.setVal(headers[19]);
					critere.setCritere4(critere4);
					//Critere5
					critere5.setType(headers[20]);
					critere5.setVal(headers[21]);
					critere.setCritere5(critere5);
					//Critere6
					critere6.setType(headers[22]);
					critere6.setVal(headers[23]);
					critere.setCritere6(critere6);
					//Critere7
					critere7.setType(headers[24]);
					critere7.setVal(headers[25]);
					critere.setCritere7(critere7);
					//Critere8
					critere8.setType(headers[26]);
					critere8.setVal(headers[27]);
					critere.setCritere8(critere8);
					//Critere9
					critere9.setType(headers[28]);
					critere9.setVal(headers[29]);
					critere.setCritere9(critere9);
					//Critere10
					critere10.setType(headers[30]);
					critere10.setVal(headers[31]);
					critere.setCritere10(critere10);

					adhesion.setCritere(critere);
					
					//Añadimos el Adhésion a la lista
					/* lstAdhesions.setNbr("");
					lstAdhesions.getAdhesion().add(adhesion); */
					
					//Inicializamos la lista Pret e incluimos el Adhesion al Assure
					// adhesion = new Adhesion();
					lstAdhesions.setNbr("");
					lstAdhesions.getAdhesion().add(adhesion);
					assure.setLstAdhesions(lstAdhesions);
					 					 
					lstBeneficiaires = new LstBeneficiaires();
					lstPrets = new LstPrets();
					pret = new Pret();
				}
				
				/////////////////////////////////////////
				//FILA PRESTAMOS / PRÊT /////////////////				
				if("PRE".equals(headers[0])){
					
					//Inicializamos atributos				
					date = new Date();
					duree = new Duree();
					derEchHP = new DerEchHP();
					derRAPerFic = new DerRAPerFic();
					quotite = new Quotite();
					
					mntCapInit = new MntCapInit();
					mntCRDAprDerEch = new MntCRDAprDerEch();
					natEch = new NatEch();
					derTxInt = new DerTxInt();				
					
					//Atributos del Prêt
					pret.setId(headers[1]);
					pret.setType(headers[2]);
					pret.setNature(headers[3]);
					
					//Date
					date.setAccept(headers[4]);
					date.setFin(headers[5]);
					pret.setDate(date);
										
					//Duree
					duree.setAmort(headers[6]);		
					duree.setDiffere(headers[7]);	
					duree.setTotale(headers[8]);	
					pret.setDuree(duree);
										
					//MntCapInit
					mntCapInit.setContent(headers[9]);
					pret.setMntCapInit(mntCapInit);
					
					//MntCRDAprDerEch
					mntCRDAprDerEch.setContent(headers[10]);
					pret.setMntCRDAprDerEch(mntCRDAprDerEch);
					
					//NatEch
					natEch.setContent(headers[11]);
					pret.setNatEch(natEch);
					
					//DerTxInt
					derTxInt.setContent(headers[12]);
					pret.setDerTxInt(derTxInt);
					
					//DerEchHP
					derEchHP.setSgn(headers[13]);
					derEchHP.setMnt(headers[14]);
					pret.setDerEchHP(derEchHP);
					
					//DerRAPerFic
					derRAPerFic.setDate(headers[15]);
					derRAPerFic.setMnt(headers[16]);
					pret.setDerRAPerFic(derRAPerFic);
					
					//Quotite
					quotite.setDc(headers[17]);
					quotite.setIt(headers[18]);
					quotite.setPerteEmploi(headers[19]);
					pret.setQuotite(quotite);
					
					// INI BENEFICIARIOS
					// Atributo del beneficiaire (Como no lo tenemos en el CSV nos piden de informarlo a mano).
					beneficiaire.setLigne("BEN");
					
					// Inicializamos la lista Beneficiaires e incluimos el beneficiare al Adhesion
					lstBeneficiaires.setNbr("");
					lstBeneficiaires.getBeneficiaire().add(beneficiaire);
					adhesion.setLstBeneficiaires(lstBeneficiaires);
					// FIN BENEFICIARIOS
					
					//Inicilizamos la lista Prime e incluimos el Pret al Adhesion
					// lstPrimes = new LstPrimes();
					lstPrets.setNbr("");
					lstPrets.getPret().add(pret);
					adhesion.setLstPrets(lstPrets);
					 
					//Inicialimamos primas
					prime = new Prime();	
					lstPrimes = new LstPrimes();
				}
				
				/////////////////////////////////////////
				//FILA PRIMAS / PRI /////////////////////
				if("PRI".equals(headers[0])){

					//Atributos tipo y numver
					prime.setTypeAssiette(headers[1]);
					prime.setMntAssiette(headers[2]);
					prime.setTxAppPrime(headers[3]);
					
					// lstPrimes.setNbr("");
					// lstPrimes.getPrime().add(prime);
					//Incluimos el Prime al Pret
					lstPrimes.setNbr("");
					lstPrimes.getPrime().add(prime);
					adhesion.setLstPrimes(lstPrimes);
				}
				
				/////////////////////////////////////////
				//FILA POPS  / POP  /////////////////////
				/* if("POP".equals(headers[0])){

					//Inicializamos Pops y Criterios
					pop = new Pop();
					critere = new Critere();
					critere1 = new Critere1();
					critere2 = new Critere2();
					critere3 = new Critere3();
					critere4 = new Critere4();
					critere5 = new Critere5();
					critere6 = new Critere6();
					critere7 = new Critere7();
					critere8 = new Critere8();
					critere9 = new Critere9();
					critere10 = new Critere10(); 

					//Informamos pops y criterios
					pop.setCode(headers[1]);

					//Critere1
					critere1.setType(headers[2]);
					critere1.setVal(headers[3]);
					critere.setCritere1(critere1);
					//Critere2
					critere2.setType(headers[4]);
					critere2.setVal(headers[5]);
					critere.setCritere2(critere2);
					//Critere3
					critere3.setType(headers[6]);
					critere3.setVal(headers[7]);
					critere.setCritere3(critere3);
					//Critere4
					critere4.setType(headers[8]);
					critere4.setVal(headers[9]);
					critere.setCritere4(critere4);
					//Critere5
					critere5.setType(headers[10]);
					critere5.setVal(headers[11]);
					critere.setCritere5(critere5);
					//Critere6
					critere6.setType(headers[12]);
					critere6.setVal(headers[13]);
					critere.setCritere6(critere6);
					//Critere7
					critere7.setType(headers[14]);
					critere7.setVal(headers[15]);
					critere.setCritere7(critere7);
					//Critere8
					critere8.setType(headers[16]);
					critere8.setVal(headers[17]);
					critere.setCritere8(critere8);
					//Critere9
					critere9.setType(headers[18]);
					critere9.setVal(headers[19]);
					critere.setCritere9(critere9);
					//Critere10
					critere10.setType(headers[20]);
					critere10.setVal(headers[21]);
					critere.setCritere10(critere10);

					pop.setCritere(critere);


				} */
				
				/////////////////////////////////////////
				//FILA ACT / ACT ////////////////////////
				/* if("ACT".equals(headers[0])){

					//Inicializamos objeto Actegest y la lista de Primas
					acteGest = new ActeGest();
					lstPrimes = new LstPrimes();
					//Informamos datos de Actgest
					acteGest.setType(headers[1]);
					acteGest.setDateDeb(headers[2]);
					acteGest.setDateFin(headers[3]);
				} */

				/* /////////////////////////////////////////
				//FILA PRIMAS / PRI /////////////////////
				if("PRI".equals(headers[0])){

					//Inicialimamos primas, montante, y listas Actgest
					prime = new Prime();
					numOrdre = new NumOrdre();
					assiette = new Assiette();
					montant = new Montant();
					effectif = new Effectif();
					lstActeGests  = new LstActeGests();

					//Informamos los datos
					lstPrimes.setNbr("");
					numOrdre.setContent(headers[1]);
//					prime.setNumOrdre(numOrdre);
					assiette.setType(headers[2]);
					assiette.setCotisation(headers[3]);
					assiette.setTxAppel(headers[4]);
//					prime.setAssiette(assiette);
					montant.setSgn(headers[5]);
					montant.setMnt(headers[6]);
//					prime.setMontant(montant);
					effectif.setContent(headers[7]);
//					prime.setEffectif(effectif);
					lstPrimes.getPrime().add(prime);
					acteGest.setLstPrimes(lstPrimes);
				} */
				
				/////////////////////////////////////////
				//FILA ACT / CIERRE ACT /////////////////
				/* if("ACT".equals(headers[0])){
					//incluimos el actGest a la lista y esta a su pop
					lstActeGests.setNbr("");
					lstActeGests.getActeGest().add(acteGest);
					pop.setLstActeGests(lstActeGests);
				
				} */			

				/////////////////////////////////////////
				//FILA POP / CIERRE POP /////////////////
				/* if("POP".equals(headers[0])){
					//Inicializamos listas de colstatpops
					collStatPop = new CollStatPop();
					lstCollStatPops = new LstCollStatPops();

					//Incluimos los pops en la lista
					lstPops.setNbr("");
					lstPops.getPop().add(pop);
					collStatPop.setLstPops(lstPops);	  						

					//Informamos la lista a cada contrato
					lstCollStatPops.setNbr("");
					lstCollStatPops.setCollStatPop(collStatPop);
//					contrat.setLstCollStatPops(lstCollStatPops);
				} */
				
				/* 
				/////////////////////////////////////////
				//FILA PRI / CIERRE PRI /////////////////
			    if("PRI".equals(headers[0])){
					//Incluimos el Prime al Pret
					lstPrimes.setNbr("");
					lstPrimes.getPrime().add(prime);
					adhesion.setLstPrimes(lstPrimes);
				} 
				
				/////////////////////////////////////////
				//FILA PRE / CIERRE PRE /////////////////
				if("PRE".equals(headers[0])){
					//Inicilizamos la lista Prime e incluimos el Pret al Adhesion
					 lstPrimes = new LstPrimes();
					 lstPrets.setNbr("");
					 lstPrets.getPret().add(pret);
					 adhesion.setLstPrets(lstPrets);
				}
				
				/////////////////////////////////////////
				//FILA ADH / CIERRE ADH /////////////////
				if("ADH".equals(headers[0])){
					//Inicializamos la lista Pret e incluimos el Adhesion al Assure
					 lstPrets = new LstPrets();
					 // adhesion = new Adhesion();
					 
					 lstAdhesions.setNbr("");
					 lstAdhesions.getAdhesion().add(adhesion);
					 assure.setLstAdhesions(lstAdhesions);
				}
				
				/////////////////////////////////////////
				//FILA ASS / CIERRE ASS /////////////////
				if("ASS".equals(headers[0])){
					
					//Inicializamos la lista Adhesion
					lstAdhesions = new LstAdhesions();
					collStatAssure = new CollStatAssure();
					lstCollStatAssures = new LstCollStatAssures();
	 
					// Inicializamos CollStatAssure
					lstAssures.setNbr("");
					lstAssures.getAssure().add(assure);
					collStatAssure.setLstAssures(lstAssures); 
					
					// Incluimos el collStatAssures al contrat	
				    lstCollStatAssures.setNbr("");
					lstCollStatAssures.getCollStatAssure().add(collStatAssure);
					contrat.setLstCollStatAssures(lstCollStatAssures);
					 
				}
				
				/////////////////////////////////////////
				//FILA CNT / CIERRE CNT /////////////////
				if("CNT".equals(headers[0])){

					// Inicializamos lista contrats y reacontrats
					lstContrats = new LstContrats();
				    reaContrat = new ReaContrat();
					
					lstContrats.setNbr("");				
					lstContrats.getContrat().add(contrat);
					reaContrat.setLstContrats(lstContrats);
					
					// Incluimos el reContrats al delegataire
					lstReaContrats.setNbr("");
					lstReaContrats.getReaContrat().add(reaContrat);
					delegataire.setLstReaContrats(lstReaContrats);
					
				}
				
				/////////////////////////////////////////
				//FILA DEL / CIERRE DEL /////////////////
				if("DEL".equals(headers[0])){
					//Inicializamos la lista reacontrats y incluimos el delegataire al pivot
					lstReaContrats = new LstReaContrats();
					lstDelegataires.getDelegataire().add(delegataire);
					pivot.setLstDelegataires(lstDelegataires);
				}
				*/
			}           


		// Creamos el contexto e instanciamos el marshaller
		JAXBContext context = JAXBContext.newInstance(Pivot.class);
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        //Eliminamos la cabecera, pues necesitan "standalone = "No"
        m.setProperty("com.sun.xml.bind.xmlDeclaration", Boolean.FALSE);
		m.marshal(pivot, System.out);

		//Creamos el xml
		Writer w = null;
		try {
			w = new FileWriter(ficheroXML);
            //Ponemos la nueva cabecera con standalone="no"
            w.write("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n");
			m.marshal(pivot, w);
		} finally {
			try {
				w.close();
			} catch (Exception e) {
			}
		}


		} catch(Exception e) {
			throw e;
		}  finally {
			if(csvReader!=null) {
				csvReader.close();
			}
		}
	}


	public static void main(String[] args) throws Exception {

		// Primero rellenamos los objetos Java y generamos un XML
		//Recorrer csv, obteniendo los datos.
		//Leemos csv 
		//String pathRuta = args[1];
		leerCSV(CSV,RUTA, ";",null);
		//leerCSV(args[0],args[1], ";",null);

	}
}
