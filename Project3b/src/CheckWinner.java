																																																																																																																																																																																																																																				import java.awt.Container;
import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JLabel;
/*
* 1 is rock
* 2 is paper
* 3 is scissors
*/
	public class CheckWinner extends Initialize {
		static String player1Choice = "";
		static String player2Choice = "";
		boolean player1bool = Initialize.Player1;
		boolean player2bool = false;
		String text,text1="";
		
public boolean checkWinner(){ // computing the winner
	System.out.println("P1: " +player1Choice);
	System.out.println("P2: " + player2Choice);
		
	
		if(player1Choice.equals("Rock") && player2Choice.equals("Rock")) {
				text =("It's a tie!");
			System.out.println("It's a tie!");
		                 tie=tie+1;
				
	      } else if(player1Choice.equals("Rock") && player2Choice.equals("Scissors")) {
	            	text =("Player1 win!");
	            	System.out.println("Player1 wins!");
	            	win=win+1;
	            	
	            
	            
	      } else if(player2Choice.equals("Rock") && player1Choice.equals("Scissors")) {
	            	text =("Player1 loses!");
	            	System.out.println("Player1 loses!");
	            	 loss=loss+1;
	            
	            
	      } else if(player1Choice.equals("Scissors") && player2Choice.equals("Paper")){
	            	text =("Player1 wins!");
	            	System.out.println("Player1 wins!");
	            	win=win+1;
	            	
	      } else if(player2Choice.equals("Scissors") && player1Choice.equals("Scissors")) {
          	text =("It's a tie!");
          	System.out.println("It's a tie!");
                              tie=tie+1;
          
          
           } else if(player1Choice.equals("paper") && player2Choice.equals("Paper")){
          	text =("Player1 wins!");
          	System.out.println("It's a tie!");
                              tie=tie+1;
	           
	            
	      } else if(player2Choice.equals("Scissors") && player1Choice.equals("Paper")) {
	            	text =("Player1 loses");
	            	System.out.println("Player1 loses!");
	            	 loss=loss+1;
	            	
	          
	            
	      } else if(player1Choice.equals("Paper") && player1Choice.equals("Rock")) {
	            	text =("Player1 Wins!");
	            	System.out.println("Player1 wins");
	            	win=win+1;
	            	
	            
	            
	      } else if(player2Choice.equals("Paper") && player1Choice.equals("Rock")) {
	                  text =("Player1 loses!");
	                      loss=loss+1;
	                 
	                
	            }
	            
		           
		           

			JFrame frame = new JFrame("Rock, Scissors, Paper"); 
			Container panel = frame.getContentPane(); 
			panel.setLayout(null); 


			JLabel l0 = new JLabel(text1+text);
			l0.setBounds(155, 10, 300, 45);
			panel.add(l0);


			//show the result in a new splash screen
			
			JLabel l1 = new JLabel("Player1's Choice");
			l1.setBounds(40, 35, 150, 35);
			panel.add(l1);

			JLabel l2 = new JLabel("Player2's Choice");
			l2.setBounds(215, 35, 150, 35);
			panel.add(l2);

			JLabel l3 = new JLabel();
			l3.setBounds(10, 100, 170, 60);
			panel.add(l3);

			JLabel l4 = new JLabel();
			l4.setBounds(200, 100,170, 60);
			panel.add(l4);

			JLabel l5 = new JLabel("Win/Loss rate: " + win+"/"+total);
			l5.setBounds(125, 25, 150, 250);
			panel.add(l5);

			JLabel l6 = new JLabel("Tie: "+tie);
			l6.setBounds(125, 30, 125, 270);
			panel.add(l6);
			
			JLabel l7 = new JLabel("Loss: "+loss);
			l7.setBounds(125, 40, 125, 280);
			panel.add(l7);
			
			JLabel l8 = new JLabel("Win: "+win);
			l8.setBounds(125, 50, 125, 290);
			panel.add(l8);
			

			JLabel l9 = new JLabel("Total: "+total);
			l9.setBounds(125, 60, 125, 300);
			panel.add(l9);

			frame.setSize(400, 350); 
			frame.setVisible(true);
			 total=total+1;
			return true; 		



		}

		public static int player2RandomChoice(){// creating a random choice of rock paper or scissors by the computer
			int result=(int)(Math.random()*3)+1;		
			return result;
		}

	}

		
		
		
	
	
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
		
	

