import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FirstMorning 
{
	static int checkOnDog;
	
	public static void dateForCh2() 
	{
		final JFrame frame = new JFrame();
		JOptionPane.showMessageDialog(frame, "Chapter 2");
		p.print("\nNarrator: The date is November 10th.  "
				+ "\nNarrator: It is the next morning after you wake up and you are eating breakfast with your family.");
		if (FirstNight.firstChoice == (1))
			{
			if (FirstNight.secondaryChoice == (1))
				{
					morningForChoiceOneA();
				}
			else if (FirstNight.secondaryChoice == (2))
				{
					morningForChoiceOneB();
				}
			else 
				{
					System.exit(0);
				}
			}
		else if (FirstNight.firstChoice == (2))
			{
				morningForChoiceTwo();
			}
		
		else 
			{
				p.print("Narrator: There was a fatal error in the game. Please play again.");
				System.exit(0);
			}
	}
				public static void morningForChoiceOneA() 
					{
						p.print("\nLast night was so crazy!");
						p.print("\nMom: Yeah I heard a crash from downstairs but was too scared to do anything about it.");
						checkForDog();
					}	
				public static void morningForChoiceOneB() 
				{
					p.print("\nDad I have the craziest story to tell you!");
					p.print("\nDad: Okay what is it?");
					p.print("Okay so last night i heard a huge bang in the kitchen and I went to go down to see what it was."
							+ "\n And when I got down there, a plate was broken and the door was swung wide open.");
					p.print("Dad: Wow that is weird, it was probably just the wind or the dog.");
					checkForDog();
				}
				public static void morningForChoiceTwo() 
					{
						p.print("\nWow that was a crazy night!");
						p.print("\nDad: What happened?");
						p.print("\nWell, I heard something crash downstairs and I got scared so I hid under the covers.");
						checkForDog();
					}
				public static void checkForDog()  
				{
					p.print("\nDad: It was probably just the dog or the wind.");
					p.print("\nMom: Speaking of the dog, where is chester?");
					p.print("\nI have no idea, I haven't seen him all morning.");
					p.print("\nShould I go look for him?");
					p.print("\n(1) yes \n(2) no");
					checkOnDog= Integer.parseInt(JOptionPane.showInputDialog("Please enter your choice (1) yes or (2)"
							+ " no)"));
				if (checkOnDog == (1))
				{
					p.print("\nOkay dad i'm going to go look for him.");
					p.print("\nI'll head around the side of the house first.");
					p.print("\nOh my God! What happened?!");
					p.print("\nHe was lying there as still as a rock with his eyes looking foggy and black.");
					p.print("\nHow did this happen? He wasn't acting sick or anything.");
					p.print("\nMy dad came runing out when he heard me scream.");
					p.print("\nDad: Go back inside right now so I can clean this up.");
					p.print("\nI went back inside and told mom what had happened and she was terrified.");
					p.print("\nDad: I have come to the conclusion that it was just a freak accident and that we should just all move on from it. ");
					p.print("\nWe decided to just move on from it.");
					p.print("\nI went to school that day and told them what had happened."
							+ "\nThey joked that my house was haunted and that night was when things started to get very weird.");
					SecondNight.Intro();
					
				}
				
		
				else if (checkOnDog == (2))
				{
					p.print("\nYa you're right, he'll probably find his way back home.");
					p.print("\nI went to school that day and I told them the events that occured with the plate, \nand the door, and the dog.");
					p.print("\nThey joked around and said that my house was haunted."
							+ "\nI decided to just move on from it and I got home and went right to bed.");
					SecondNight.Intro();
				}
				else
				{
					p.print("\nPease enter 1 or 2");	
				}
			}
}
