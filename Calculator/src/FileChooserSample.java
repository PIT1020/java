import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileChooserSample{
		 
	    private static Desktop desktop = Desktop.getDesktop();
	
	    public static void openFile(File file) {
	        try {
	            desktop.open(file);
	        } catch (IOException ex) {
	            Logger.getLogger(
	                FileChooserSample.class.getName()).log(
	                    Level.SEVERE, null, ex
	                );
	        }
	    }
	    
	    

}
