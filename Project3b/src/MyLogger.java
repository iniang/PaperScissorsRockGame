import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import javax.swing.JLabel;




public class MyLogger extends Main {
	static JLabel Label = new JLabel("Your logging to play the game", JLabel.CENTER);
	public void mylogger(){


Logger logger = Logger.getLogger( MyLogger.class.getName() );
    FileHandler fh; 
  
    try {  

        // This block configures the logger with handler and formatter  
        fh = new FileHandler("PlayerLoggingFile");  
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();  
        fh.setFormatter(formatter); 
       

        // the following statement is used to log any messages  
        logger.info("Your logging to play the game");  

    } catch (SecurityException e) {  
        e.printStackTrace();  
    } catch (IOException e) {  
        e.printStackTrace();  
    }  

    logger.info("Hope you enjoy the Game!"); 
    	  		    	  
    	
	}
}
	
