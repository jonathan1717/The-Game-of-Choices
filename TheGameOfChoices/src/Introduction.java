import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import javax.swing.*;
@SuppressWarnings("unused")
public class Introduction 
{
	
	
		public static void Intro()
			{
				p.print("Hello and welcome to the Game Of Choices.  Life is based on choices and just one can change our life and the lives of the others around you.");
				p.print("\nIn this game you will decide the fate of yourself and the fate of the others around you.");
//this is just the introduction
				p.print("\nSo to start off, what is your first name?");
				String playerFirstName= new String(JOptionPane.showInputDialog("Please enter your first name."));
//taking user input for first name
				p.print("\nWhat is your last name?");
				String playerLastName= new String(JOptionPane.showInputDialog("Please enter your last name."));
//taking user input for last name
				p.print("\nWelcome to the Game " + playerFirstName + " " + playerLastName + ".");	
			}
}



