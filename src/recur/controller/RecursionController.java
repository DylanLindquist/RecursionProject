package recur.controller;

import recur.view.RecursionPopup;

public class RecursionController
{
	private RecursionPopup view;
	
	public RecursionController()
	{
		this.view = new RecursionPopup();
	}
	
	public void start()
	{
		String text = view.askQuestion("What should we try or blank to exit");
		
		while (!text.contentEquals(""))
		{
			String words = mystery(text);
			view.displayMessage(words);
			
			text = view.askQuestion("Type in the next value or blank to exit.");
		}
	}
	
	private int fibRecursive(int input)
	{
		if(input == 0 || input == 1)
		{
			return 1;
		}
		else
		{
			return fibRecursive(input - 1) + fibRecursive(input -2);
		}
	}
	
	private double factorial(double number)
	{
		if(number == 0 || number == 1)
		{
			return 1;
		}
		else
		{
			return factorial(number * factorial(number -1));
		}
		
	}
	private String mystery(String text)
	{
		if (text.length() ==1)
		{
			return text;
		}
		else
		{
			return mystery (text.substring(1)) + text.substring(0,1);
		}
	}

}
