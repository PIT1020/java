package u33;
//=============================================================================
// Projekt      : MAS-SE 20: Java-Vorkurs
// Titel        : Ü34: Weltraum-Staffel II / Aufgabe 3
// Dateiname    : WeltraumStaffelTest.java
// Autor        : Thomas Letsch
// Beschreibung : Applikation Weltraum-Staffel mit mehreren Klassen/Objekte 
//                im Verbund.
//                Neu mit Package 'forschungsanstalt' und mit den Klassen 
//                ForschungsAnstalt und Experiment.
// $Revision    : 1.6 $  $Date: 2020/03/17 11:52:02 $
//=============================================================================

import forschungsanstalt.ForschungsAnstalt;


public class U33 {
    
    public static void main(String[] args) {

        ForschungsAnstalt hsr = new ForschungsAnstalt("HSR");

        hsr.setupExperiment( 1, "Solar-Panel");
        hsr.setupExperiment( 2, "Special-Battery");
        hsr.setupExperiment( 3, "Laser");
        hsr.setupExperiment( 4, "Video");
        hsr.setupExperiment( 5, "GPS");
        hsr.setupExperiment( 6, "Roboter");
        hsr.setupExperiment( 7, "Metal");
        hsr.setupExperiment( 8, "Biological");
        hsr.setupExperiment( 9, "Water");
        hsr.setupExperiment(10, "Gravitation");

        WeltraumStaffel staffel = new WeltraumStaffel();

        // Besatzungen 1, 2 & 3:
                          // Besatzungs-Nr                    Kommandant ist
                          //     Name1    Name2     Name3     Astronaut Nummer:
        staffel.addBesatzung(1, "Kirk1", "Spock1", "Scotty1", 3);
        staffel.addBesatzung(2, "Kirk2", "Spock2", "Scotty2", 2);
        staffel.addBesatzung(3, "Kirk3", "Spock3", "Scotty3", 1);
        
        // Schiffe 1 & 2: 
                           // Nr        Schiff-Namen      Forschungs-Anstalt
                           //    Schiff-Nr             Besatzungs-Nr
        staffel.addRaumschiff(1, 1001, "Enterprise 1", 3, hsr);
        staffel.addRaumschiff(2, 1002, "Enterprise 2", 1);
        
        U33_Raumschiff forschungsSchiff = staffel.getRaumschiff(1);
        forschungsSchiff.linkAstronautExperiment(1,  1);
        forschungsSchiff.linkAstronautExperiment(2,  2);
        forschungsSchiff.linkAstronautExperiment(2,  6);
        forschungsSchiff.linkAstronautExperiment(3,  4);
        forschungsSchiff.linkAstronautExperiment(3, 10);
        
        final String SEPARATOR = "------------------------------------------------";
        System.out.println("staffel.getRaumschiff(1).print():");
        staffel.getRaumschiff(1).print();
        System.out.println(SEPARATOR);
        System.out.println("staffel.getBesatzung(1).print():");
        staffel.getBesatzung(1).print();
        System.out.println(SEPARATOR);
        System.out.println("staffel.getBesatzung(2).print():");
        staffel.getBesatzung(2).print();
        System.out.println(SEPARATOR);
        System.out.println("staffel.getBesatzung(3).print():");
        staffel.getBesatzung(3).print();
        
    }
} 

/* Session-Log:

staffel.getRaumschiff(1).print():
Raumschiff.print():
    Nummer : 1001
    Name   : Enterprise 1
    Besatzung.print():
        Astronaut 1 : Kirk3    1
            Solar-Panel
        Astronaut 2 : Spock3   0
            Special-Battery
            Roboter
        Astronaut 3 : Scotty3  0
            Video
            Gravitation
    Experimente des Forschungsschiffes:
        Solar-Panel
        Special-Battery
        Roboter
        Video
        Gravitation
ForschungsAnstalt.print():
    HSR
    Experimente:
        Solar-Panel
        Special-Battery
        Laser
        Video
        GPS
        Roboter
        Metal
        Biological
        Water
        Gravitation
------------------------------------------------
staffel.getBesatzung(1).print():
Besatzung.print():
    Astronaut 1 : Kirk1    0
    Astronaut 2 : Spock1   0
    Astronaut 3 : Scotty1  1
    Raumschiff.print():
        Nummer : 1002
        Name   : Enterprise 2
------------------------------------------------
staffel.getBesatzung(2).print():
Besatzung.print():
    Astronaut 1 : Kirk2    0
    Astronaut 2 : Spock2   1
    Astronaut 3 : Scotty2  0
------------------------------------------------
staffel.getBesatzung(3).print():
Besatzung.print():
    Astronaut 1 : Kirk3    1
        Solar-Panel
    Astronaut 2 : Spock3   0
        Special-Battery
        Roboter
    Astronaut 3 : Scotty3  0
        Video
        Gravitation
    Raumschiff.print():
        Nummer : 1001
        Name   : Enterprise 1
        Experimente des Forschungsschiffes:
            Solar-Panel
            Special-Battery
            Roboter
            Video
            Gravitation
ForschungsAnstalt.print():
    HSR
    Experimente:
        Solar-Panel
        Special-Battery
        Laser
        Video
        GPS
        Roboter
        Metal
        Biological
        Water
        Gravitation

*/
