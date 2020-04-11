package u32;

public class U32 {	

	//=============================================================================
	// Projekt      : MAS-SE 20: Java-Vorkurs
	// Titel        : Ü32: Sport-Wettbewerb und JUnit
	// Dateiname    : SportWettbewerbTest.java
	// Autor        : Thomas Letsch
	// Beschreibung : Bidirektionale und parallel Assoziationen zwischen den beiden 
//	                Klassen 'Wettbewerb' und 'Sportler'.
//	                Einsatz von JUnit-Tests.
	// $Revision    : 1.8 $  $Date: 2020/03/11 20:09:41 $
	//=============================================================================


	
	    public static void main(String[] args) {
	        
	        Wettbewerb w200m = new Wettbewerb("200-Meter-Lauf");
	        Wettbewerb w400m = new Wettbewerb("400-Meter-Lauf");
	        Wettbewerb wZehnkampf = new Wettbewerb("Zehnkampf");
	        
	        Sportler charlie = new Sportler("Charlie");
	        Sportler freddie = new Sportler("Freddie");
	        Sportler henry   = new Sportler("Henry");
	        Sportler william = new Sportler("William");
	    
	        w200m.addSportler(charlie);
	        w200m.addSportler(freddie);
	        w200m.addSportler(henry);
	        
	        w400m.addSportler(charlie);
	        w400m.addSportler(freddie);
	        w400m.addSportler(henry);
	        w400m.addSportler(william);
	        
	        wZehnkampf.addSportler(freddie);
	        wZehnkampf.addSportler(henry);
	        wZehnkampf.addSportler(william); 
	   	        
	        w200m.setSieger(charlie);
	        w400m.setSieger(william);
	        wZehnkampf.setSieger(william);
	        
	        w200m.print();
	        w400m.print();
	        wZehnkampf.print();
	        System.out.println();
	        
	        charlie.print();
	        freddie.print();
	        henry.print();
	        william.print();
	        
	        System.out.println("\n\n");
	        
	        System.out.println("Tests mit Siegen welche nicht moeglich sind:");
	        Wettbewerb wettbewerb = new Wettbewerb("TestWettbewerb");
	        Sportler testSportler1 = new Sportler("TestSportler1");
	        Sportler testSportler2 = new Sportler("TestSportler2");
	        wettbewerb.addSportler(testSportler1);
	        boolean result = wettbewerb.setSieger(testSportler2);
	        System.out.println("wettbewerb.setSieger(testSportler2): "+result);
	        result = testSportler2.addSieg(wettbewerb);
	        System.out.println("testSportler2.addSieg(wettbewerb): "+result);
	        System.out.println();
	        
	        System.out.println("Test mit hinzufuegen eines Sieges bei einem Sportler:");
	        testSportler1.addSieg(wettbewerb);
	        testSportler1.print();
	    }
	

	 

	/* Session-Log:

	Wettbewerb:
	  Art        : 200-Meter-Lauf
	  Teilnehmer : Charlie: SIEGER
	               Freddie
	               Henry
	Wettbewerb:
	  Art        : 400-Meter-Lauf
	  Teilnehmer : Charlie
	               Freddie
	               Henry
	               William: SIEGER
	Wettbewerb:
	  Art        : Zehnkampf
	  Teilnehmer : Freddie
	               Henry
	               William: SIEGER

	Sportler:
	  Name        : Charlie
	  Wettbewerbe : 200-Meter-Lauf: SIEGER
	                400-Meter-Lauf
	  Siege       : 200-Meter-Lauf
	Sportler:
	  Name        : Freddie
	  Wettbewerbe : 200-Meter-Lauf
	                400-Meter-Lauf
	                Zehnkampf
	  Siege       : 
	Sportler:
	  Name        : Henry
	  Wettbewerbe : 200-Meter-Lauf
	                400-Meter-Lauf
	                Zehnkampf
	  Siege       : 
	Sportler:
	  Name        : William
	  Wettbewerbe : 400-Meter-Lauf: SIEGER
	                Zehnkampf: SIEGER
	  Siege       : 400-Meter-Lauf
	                Zehnkampf



	Tests mit Siegen welche nicht moeglich sind:
	wettbewerb.setSieger(testSportler2): false
	testSportler2.addSieg(wettbewerb): false

	Test mit hinzufuegen eines Sieges bei einem Sportler:
	Sportler:
	  Name        : TestSportler1
	  Wettbewerbe : TestWettbewerb: SIEGER
	  Siege       : TestWettbewerb

	*/
}