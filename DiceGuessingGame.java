import java.util.*;

public class DiceGuessingGame {

	public static Scanner console=new Scanner(System.in);
	public static void main (String args[])
	{
		int money,guess,bet;
		int answer;
		Die dice=new Die();
		
		System.out.println("\t===Welcome to the dice guessing game===");
		System.out.println("Rules:");
		System.out.println("1.You need to enter the amount of money you want to play in the game.");
		System.out.println("2.It is illegal to make a bet that is more than your money.");
		System.out.println("3.The dice number only ranges in 1 to 6, so you should not guess beyond that.");
		System.out.println("4.You have only one dice to guess.");
		System.out.println("5.You are not allowed to play the game if you have no money left.");
		System.out.println("6.If you guess the dice number, you will earn the amount you bet.");
		System.out.println("7.If you loss, the amount you bet will be minus to your money.");
		
		
		System.out.print("\nPlease enter your money:");
		money=console.nextInt();
		do
		{
			
		do
		{
		System.out.print("Please enter your dice guess:");
		guess=console.nextInt();
		}
		while(guess>6);
		
		do 
		{
		System.out.print("Enter your bet:");
		bet=console.nextInt();
		
		}while(bet>money);
		
		dice.rollDice();
		int x=dice.getValue();
		if(guess==x)
		{
			System.out.println();
			System.out.println("Value of the dice is "+x);
			money+=bet;
			System.out.println("Congratulations,you guess the value of the dice");
			System.out.print("Your money is just now "+money);
			
		}
		else if (guess!=x)
		{
			System.out.println();
			System.out.println("Value of the dice is "+x);
			System.out.println("Im sorry you loss");
			money-=bet;
			System.out.print("Your money is just now "+money);
		}
		System.out.println();
		System.out.print("\nDo you want to play again?1 for yes & 2 for no: ");
		 answer=console.nextInt();
		
		}while (answer==1&&money>0);
		System.out.println("Thank you for playing!");
	}
}
