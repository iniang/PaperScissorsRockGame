import javax.swing.JOptionPane;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Introduction execute = new Introduction();
		 execute.introductionPanel();
		 
		 MyLogger log = new MyLogger();
		 log.mylogger();
		 
          Initialize init = new Initialize();
          CheckWinner check = new CheckWinner();
          check.checkWinner();
         
	}
}


