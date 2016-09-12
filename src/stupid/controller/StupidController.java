package stupid.controller;

import java.util.Scanner;

public class StupidController 
{
	private String myName;
	private Scanner inputReader;
	
	public  StupidController()
	{
		myName = "Jacob Osborne";
		inputReader = new Scanner(System.in);
	}
	
	public void start()
	{
		System.out.println("This program is less stupid.");
		System.out.println("My name is " + myName);
		askQuestions();
	}


private void askQuestions()
	{
		System.out.println("How is your day?");
		String input = inputReader.nextLine();
		System.out.println("Oh, you said: " + input + " about your day.");
		
		System.out.println("My next question is this: What is the best type of food?");
		String foodInput = inputReader.nextLine();
		System.out.println("OK, you typed this, right?: " + foodInput);
		
		System.out.println("How much do you weigh?");
		int input1 = inputReader.nextInt();	
		System.out.println("You said that you weigh: " + input1 + " pounds.");
		inputReader.nextLine(); 		
		
		System.out.println("How old are you?");
		int input2 = inputReader.nextInt();
		System.out.println("You claim to be " + input2 + " years old!");
		inputReader.nextLine(); 		
		
		System.out.println("What are the first ten digits of pi?");
		inputReader.nextDouble();
		System.out.println("3.141592653 is the correct answer, yes?");
		inputReader.nextLine();
		
		System.out.println("What is the answer to 2+2?");
		int someInput = inputReader.nextInt();
		System.out.println("OK, you typed this: " + someInput + ". The correct answer is 4."); 		
		String other = inputReader.next();
		System.out.println(other);
		inputReader.nextLine();
		
		System.out.println("Do my questions bother you?");
		String botherInput = inputReader.nextLine();
		System.out.println("I'm sorry, if so. I was programmed to ask them.");
		
	}

}

