import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Initialize extends JFrame
{
	private static final String TITLE="My Game";
	private static final int WIDTH=550;
	private static final int HEIGHT=450;
	private Container content;
	private JLabel result;
	public JButton[] cells;
	public JButton exitButton;
	private JButton initButton;
	private CellButtonHandler[] cellHandlers;
	private ExitButtonHandler exitHandler;
	private InitButtonHandler initHandler;
	int playerPick;
	public static boolean Player1;
	static int win=0;
	static int total=0;
	static int tie=0;
	static int loss=0;
	static int player1Won;
	public boolean gameOver;
	public static int click = 0;
	
	public Initialize()
	{
		//Necessary initialization code
		setTitle(TITLE);
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JMenuBar menubar = new JMenuBar ();
   		JMenu menu1 = new JMenu ("SYSTEM OPTIONS");
   		JMenuItem item1 = new JMenuItem ("Password Settings");
   		JMenuItem item2 = new JMenuItem ("User Login");
   		JMenuItem item3 = new JMenuItem ("Exit");
   		menu1.add (item1);
   		menu1.add (item2);
   		menu1.add (item3);
   		menubar.add (menu1);
   		setJMenuBar(menubar);
   		setVisible(true);
   		getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
   		setAlwaysOnTop(true);
   		setVisible(true);
   		setLocationRelativeTo(null);
   		
		

		//Get content pane
		content=getContentPane();
		content.setBackground(Color.blue.darker());
		
		//Set layout
		content.setLayout(new GridLayout(2,3));

		//Create cells and handlers
		cells=new JButton[6];
		cellHandlers=new CellButtonHandler[6];
		for(int i=0; i<3; i++)
		{
			char ch=(char)('0'+i+1);
			cells[i]=new JButton(""+ch);
			cellHandlers[i]=new CellButtonHandler();
			cells[i].addActionListener(cellHandlers[i]);
		}
		
		//Create init and exit buttons and handlers
		exitButton=new JButton("QUIT");
		exitHandler=new ExitButtonHandler();
		exitButton.addActionListener(exitHandler);
		initButton=new JButton("CLEAR");
		initHandler=new InitButtonHandler();
		initButton.addActionListener(initHandler);
		
		//Create result label
		result=new JLabel("Noughts", SwingConstants.CENTER);
		result.setForeground(Color.white);
						
		//Add elements to the grid content pane
		for(int i=0; i<3; i++)
		{
			content.add(cells[i]);
		}
		content.add(initButton);
		content.add(result);
		content.add(exitButton);
		
		//Initialize
		init();
	}
	
	public void init()
	{
		//Initialize booleans
		Player1=true;
		
		
		//Initialize text in buttons
		for(int i=0; i<3; i++)
		{
			char ch=(char)('0'+i+1);
			cells[i].setText(""+ch);
		}
		
		//Initialize result label
		result.setText("Player1");
		
		setVisible(true);
	}
		
	private class CellButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			click++;
			//If game over, ignore
			if(gameOver)
			{
				return;
			}
			
			//Get button pressed
			JButton pressed=(JButton)(e.getSource());
			
			//Get text of button
			String text=pressed.getText();
			
			//If Player 1 or Player 2 , ignore
																																																		if(text.equals("Rock") || text.equals("Paper") || text.equals("Scissors"))
			{
				return;
			}
			
			// Player 1 and Player 2 randomly picks
			Random rand = new Random();
			playerPick = rand.nextInt(3)+1; 
			
			if (playerPick == 1) {
				pressed.setText("Rock");
				if (click == 1)
					CheckWinner.player1Choice = "Rock";
				else
					CheckWinner.player2Choice = "Rock";
			}
			    else if (playerPick == 2) {
			    	pressed.setText("Paper");
			    	if (click == 1)
						CheckWinner.player1Choice = "Paper";
					else
						CheckWinner.player2Choice = "Paper";
			    	
			    }
			    else if (playerPick == 3) {
			    	pressed.setText("Scissors");
			    	if (click == 1)
						CheckWinner.player1Choice = "Scissors";
					else
						CheckWinner.player2Choice = "Scissors";
			    	
			    }
			
			//Check winner
			
			if (click  == 2){
				
			
				if(checkWinner())
				{
					//End of game
					gameOver = false;
					click = 0;
				}
				else 
				{
					//Change player
					Player1 = !Player1;

					//Display player message
					if(Player1)
					{
						result.setText("Player1");
					}
					else
					{
						result.setText("Player2");
					}
				}
			}
		}
	}
	
	private class ExitButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}
	}

	private class InitButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			init();
			click = 0;
		}
	}
// method necessary to execute checkWinner method in the Test Class
	public boolean checkWinner() {
		// TODO Auto-generated method stub
		
		CheckWinner check = new CheckWinner();
        
		return check.checkWinner();
	}
		
	}


