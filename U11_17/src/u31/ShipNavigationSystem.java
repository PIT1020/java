//=============================================================================
// Projekt      : MAS-SE 20: Java-Vorkurs
// Titel        : Ü31: Schiff-Navigations-System: Ausgangslage
// Dateiname    : ShipNavigationSystem.java
// Autor        : `You` 
// Beschreibung : Ein 'Spiel', bei welchem Schiffe in einer X/Y-Ebene positioniert 
//                werden können und man daraufhin diese Schiffe an neue 
//                X/Y-Koordinaten fahren lassen kann ;-)
//=============================================================================

import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Scanner;

public class ShipNavigationSystem {

	private final static ArrayList<Ship> mShips = new ArrayList<Ship>();
	private final static Screen mScreen = new Screen(30, 10);
	private final static String[][] MENU = { { "1. Neues Schiff", "2. Neue Position", "3. Ende" },
			{ "Geben Sie den neuen Schiffsnamen", "und die Position (X/Y) ein", " ", "Bespiel:  QE 18 8" },
			{ "Geben Sie den neuen Schiffsnummer", "und die Position (X/Y) ein", " ", "Bespiel:  1 7 3" } };

	public static void newShip(String eingabeNeuesSchiff) {
		Scanner in = new Scanner(System.in);
		String[] DatenfuerNeuesSchiff = eingabeNeuesSchiff.split(" ");
		String Name = DatenfuerNeuesSchiff[0];
		String xPos = DatenfuerNeuesSchiff[1];
		String yPos = DatenfuerNeuesSchiff[2];
		// positionen finden
		int XPOS = Integer.valueOf(xPos);
		int YPOS = Integer.valueOf(yPos);
		Ship NewShip = new Ship(XPOS, YPOS, Name);
		// der arraylist zu ordnen
		mShips.add(NewShip);
	}

	public static void writeShip() {
		for (int i = 0; i < mShips.size(); i++) {
			int curPosX = mShips.get(i).getXPos();
			int curPosY = mShips.get(i).getYPos();
			char[] Schiffsname = mShips.get(i).getName().toCharArray();
			for (int j = 0; j < Schiffsname.length; j++) {
				mScreen.set(curPosX + j, curPosY, Schiffsname[j]);
			}
			mScreen.print();
		}
	}

	public static boolean checkPosition(int pXPos, int pYPos, Ship pCurrentShip) {
		for (int i = 0; i < mShips.size(); i++) {
			Ship ship = mShips.get(i);
			if (ship == pCurrentShip) {
				continue;
			}
			if (ship.getYPos() == pYPos) {
				continue;
			}
			for (int x = ship.getXPos(); x < (ship.getXPos() + ship.getName().length() + 2); x++) {
				if (x == pXPos) {
					ship.setState(Ship.SUNKEN);
					return true;
				}
			}
		}
		return false;
	}

	public static void changePosition(String eingabeNeuePosition) {
		String[] DatenfuerNeuePosition = eingabeNeuePosition.split(" ");
		// positionen finden
		int shipNr = Integer.valueOf(DatenfuerNeuePosition[0]);
		int newXPOS = Integer.valueOf(DatenfuerNeuePosition[1]);
		int newYPOS = Integer.valueOf(DatenfuerNeuePosition[2]);
		if (mShips.size() < shipNr) {
			Toolkit.getDefaultToolkit().beep();
			return;
		}
		Ship ship = mShips.get(shipNr - 1);
		if (ship.getState() == Ship.SUNKEN) {
			Toolkit.getDefaultToolkit().beep();
			return;
		}
		int curXPos = ship.getXPos();
		int curYPos = ship.getYPos();
		while (!((curXPos == newXPOS) && (curYPos == newYPOS))) {
			int xDiff = curXPos - newXPOS;
			if (xDiff < 0) {
				curXPos++;
			} else if (xDiff > 0) {
				curXPos--;
			}
			int yDiff = curYPos - newYPOS;
			if (yDiff < 0) {
				curYPos++;
			} else if (yDiff > 0) {
				curYPos--;
			}
			boolean sunken = placeShipAtPosition(ship, curXPos, curYPos);
			if (sunken) {
				break;
			}
		}
	}

	public static boolean placeShipAtPosition(Ship pShip, int pXPos, int pYPos) {
		boolean crash = false;
		for (int i = 0; i < pShip.getName().length() + 2; i++) {
			if (checkPosition(pXPos + i, pYPos, pShip)) {
				crash = true;
				break;
			}
		}
		if (crash) {
			Toolkit.getDefaultToolkit().beep();
			pShip.setState(Ship.SUNKEN);
		} else {
			pShip.setXPos(pXPos);
			pShip.setYPos(pYPos);
		}
		writeShip();
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
		}
		if (crash) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		mScreen.setMenu(MENU[0]);
		mScreen.print();
		while (true) {
			String input = mScreen.userInput("Ihre Wahl: ");
			int inputValidierung = Integer.parseInt(input);
			if (inputValidierung == 1) {
				mScreen.setMenu(MENU[1]);
				mScreen.print();
				String Newship = mScreen.userInput("Eingabe :");
				newShip(Newship);
				writeShip();
			} else if (inputValidierung == 2) {
				mScreen.setMenu(MENU[2]);
				mScreen.print();
				String NewPOS = mScreen.userInput("Eingabe :");
				changePosition(NewPOS);
			} else if (inputValidierung == 3) {
				System.out.print("Ende");
				break;
			} else {
				System.err.println("Error:Ungueltige Auswahl");
				break;
			}
		}

	}
}
