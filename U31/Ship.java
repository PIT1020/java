
public class Ship {

    /**
     * Ship is in normal Condition (not sunken).
     */
    public static final int OK = 1;
    /**
     * Ship is sunken.
     */
    public static final int SUNKEN = 2;

    private int mxPos;
    private int myPos;
    private String mName;
    private int mState;

    public Ship(int pXPos, int pYPos, String pName) { 
    	mxPos = pXPos;
    	myPos = pYPos;
    	mName = pName;
    }

    public int getXPos() {
    	return mxPos;
    	
    }

    public void setXPos(int pXPos) {
        mxPos =pXPos;
    	
    }

    public int getYPos() {
		return myPos;
        
    }

    public void setYPos(int pYPos) {
       myPos = pYPos;
    }

    public String getName() {
		return mName;		
        
    }

    public void setName(String pName) {
       mName = pName;
    }

    public int getState() {	
        return mState;
    }

    public void setState(int pState) {
       mState = pState;
    }

    public void print() {
    	System.out.println("Ship");
    	System.out.println(" XPos = "+ mxPos);
        System.out.println(" YPos = "+ myPos);
        System.out.println(" Name = "+ mName);
        System.out.print(" State = " );
        if (mState == OK) {System.out.println("OK");}
        else{System.out.println("Sunken");}
    }
    
    
    public static void main(String[] args) {
        Ship ship = new Ship(4, 2, "Santa-Maria");
        ship.print();
        ship.setState(Ship.OK);
        ship.print();
    }

}

/* Session-Log:
 
Ship:
  XPos  = 4
  YPos  = 2
  Name  = Santa-Maria
  State = OK
Ship:
  XPos  = 4
  YPos  = 2
  Name  = Santa-Maria
  State = SUNKEN

*/
