//=============================================================================
// Projekt      : MAS-SE 20: Java-Vorkurs
// Titel        : Ü3: Standard-Eingabe
// Dateiname    : StdIn.java
// Autor        : Thomas Letsch
// Beschreibung : Einlesen von verschiedenen 'Datentypen'.
// $Revision    : 1.20 $  $Date: 2020/01/19 19:03:05 $
//=============================================================================

import java.util.Scanner;

public class StdIn {  

    public static void main(String[] args) {
        
        // Verbindung zur Standard-Eingabe resp.zum Keyboard:
        Scanner eingabe = new Scanner(System.in);  
        
        System.out.print("Ein String : ");
        // Einlesen eines Strings von der Standard-Eingabe:
        String str = eingabe.next();           
        System.out.println("String = " + str);
      
        System.out.print("Ganze Zahl : ");
        // Einlesen einer Zahl von der Standard-Eingabe als Ganzahl vom Typ 'int':
        int i = eingabe.nextInt();            
        System.out.println("Zahl = " + i);
    
        System.out.print("Gleitkomma-Zahl : ");
        // Einlesen einer Zahl von der Standard-Eingabe als Gleitkommazahl 
        // vom Typ 'double':
        double d = eingabe.nextDouble();  
        System.out.println("Zahl = " + d);
        
        System.out.println("ENDE.");
        eingabe.close();
    }
}


/* Session-Log:

Ein String : o.k.
String = o.k.
Ganze Zahl : 4711
Zahl = 4711
Gleikomma-Zahl : 4.711
Zahl = 4.711
ENDE.


Ein String : Hallo
String = Hallo
Ganze Zahl : Hallo
Exception in thread "main" java.util.InputMismatchException
    at java.util.Scanner.throwFor(Scanner.java:864)
    at java.util.Scanner.next(Scanner.java:1485)
    at java.util.Scanner.nextInt(Scanner.java:2117)
    at java.util.Scanner.nextInt(Scanner.java:2076)
    at StdIn.main(StdIn.java:26)

*/
