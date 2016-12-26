import javax.swing.JOptionPane;

public class startGame 
{
	static int firstChoice;
	
	public static void firstChoices()
	{
		p.print("\nBang! What was that noise??  I think it came from downstairs!");
		p.print("\nNarrator: In this game you will make the choices depending on what you would do in real life.  "
				+ "\nMake the decisions wisely my friend.");
		p.print("\nNarrator: This is your first decision. "
				+ "\nNarrator:Type into the box the option that you want with the corrosponding number.");
		p.print("\nWhat should I do? \n(1) Go downstairs and find out what had made the noise."
				+ "\n(2) Hide under the covers like any sane person should do.");
		choice1();
//where main game begins.  This is the first choice.
	}
		public static void choice1()
// Dialogue for the first choice in the game
		{
			
		firstChoice= Integer.parseInt(JOptionPane.showInputDialog("Please enter your choice (1 or 2)"));
			if (firstChoice == (1))
					{
						p.print("\nOkay, let's live on the edge and risk it.");
						choice2();
					}
			
			else if (firstChoice == (2))
			{
				p.print("\nGood choice, let's just wait it out until morning and hope that the scary monster doesn't come up here.");
						choice2();
			}
			else
			{
				p.print("\nPease enter 1 or 2");
				choice1();
			}
		}
		
		public static void choice2()
// this is the first choice results for the first choice
//I don't know how I am supposed to organize all of these choices and responses.
		{
			if (firstChoice == (1))
			{
				p.print("\nIs it just me or do stairs creek 10x more and are 10x louder at night?");
				p.print("\nIt looks like it was just a plate that had fallen.");
				p.print("\nThe door was also swung wide open...the wind must have knocked the plate over...that's completely logical...");
				p.print("\nI'm actually kind of scared now. Should I go get dad?");
				p.print("\n(1) yes \n(2) no");
			}
			else if (firstChoice == (2))
			{
				p.print("\nYa that's a good choice Let's just wait it out until morning and go back to sleep.");
			}
			else 
			{
//I think that it is impossible for this "else" to ever to show up, so if it ever does the game is very broke.
				p.print("The game is broken lol");
				System.exit(0);
			}
		}
		
}


