import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.PrintStream;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

        
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WeltraumStaffelJUnitTest {

    @Test
    public void test1_main() {
        WeltraumStaffelTest.main(null);
        startCaptureSystemOut();
        WeltraumStaffelTest.main(null);
        stopCaptureSystemOut();
        String[] expected = { 
            "Raumschiff.print():",
            "    Nummer : 1001",
            "    Name   : Enterprise 1",
            "    Besatzung.print():",
            "        Astronaut 1 : Kirk3    1",
            "        Astronaut 2 : Spock3   0",
            "        Astronaut 3 : Scotty3  0",
            "Raumschiff.print():",
            "    Nummer : 1002",
            "    Name   : Enterprise 2",
            "    Besatzung.print():",
            "        Astronaut 1 : Kirk1    0",
            "        Astronaut 2 : Spock1   0",
            "        Astronaut 3 : Scotty1  1",
            "Besatzung.print():",
            "    Astronaut 1 : Kirk1    0",
            "    Astronaut 2 : Spock1   0",
            "    Astronaut 3 : Scotty1  1",
            "    Raumschiff.print():",
            "        Nummer : 1002",
            "        Name   : Enterprise 2",
            "Besatzung.print():",
            "    Astronaut 1 : Kirk2    0",
            "    Astronaut 2 : Spock2   1",
            "    Astronaut 3 : Scotty2  0",
            "Besatzung.print():",
            "    Astronaut 1 : Kirk3    1",
            "    Astronaut 2 : Spock3   0",
            "    Astronaut 3 : Scotty3  0",
            "    Raumschiff.print():",
            "        Nummer : 1001",
            "        Name   : Enterprise 1",
        };
        verifySystemOut(expected);
    }


    
    private void startCaptureSystemOut() {
        mBAOS = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(mBAOS);
        mStdOut = System.out;
        System.setOut(ps);
    }
    
    private void stopCaptureSystemOut() { 
        try {
            mBAOS.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] barr = mBAOS.toByteArray();
        ByteArrayInputStream bais = new ByteArrayInputStream(barr);
        InputStreamReader isr = new InputStreamReader(bais);
        mLNR = new LineNumberReader(isr);
        System.setOut(mStdOut);
    } 
    
    private void verifySystemOut(String[] expected) {
        String nextLine = null;
        int i = 0;
        for (; (nextLine = nextStdOutLine()) != null; i++) {
            assertTrue("Console-Output is longer than expected!", i < expected.length);
            assertEquals(expected[i], nextLine);
        }
        assertEquals("More Console-Output was expectd!", expected.length, i);
    }
      
    private String nextStdOutLine() {
        try {
            return mLNR.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private PrintStream mStdOut;
    private ByteArrayOutputStream mBAOS;
    private LineNumberReader mLNR;

}
