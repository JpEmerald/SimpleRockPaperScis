import java.util.Scanner;

public class mainRPS {
static int wins = 0;
static	int losses =0;
static 	int draws =0;

	public static void main(String[] args) {
	
		
		Scanner scanner = new Scanner(System.in);
		
String action = "ye";
		
		System.out.println("Welcome to Rock Paper Scisssors.\nType Q to exit, or throw Rock Paper Scissors");
		while (action != "Q")
		{
			action = scanner.next();
		int	thrown = (int) (Math.random()*3) +1;
		if (thrown == 1)
		{
		System.out.print("Your opponent threw Rock\n");
		}
		else if (thrown ==2)
		{
			System.out.print("Your opponent threw Paper\n");
			
		}
		else if (thrown ==3)
		{
			System.out.print("Your opponent threw Scissors\n");
		}
		
			if (action.contains("Rock"))
			{
				if (thrown == 1)
				{
					System.out.println("You tied");
					draws++;
				}
				if (thrown == 2)
				{
					System.out.println("You lose");
					losses++;
				}
				
				if (thrown == 3)
				{
					System.out.println("You win");
					wins++;
				}
			}
			
			else if (action.contains("Paper"))
				
			{
				
				if (thrown == 1)
				{
					System.out.println("You win");
					wins++;
				}
				if (thrown == 2)
				{
					System.out.println("You tied");
					draws++;
				}
				if (thrown == 3)
				{
					System.out.println("You lose");
					losses++;
				}
			}
			
			else if (action.contains("Scissors"))
			{
				if (thrown == 3)
				{
					System.out.println("You tied");
					draws++;
				}
				if (thrown == 1)
				{
					System.out.println("You lose");
					losses++;
				}
				if (thrown == 2)
				{
					System.out.println("You win");
					wins++;
				}
			}
			System.out.println(scoreBoard());	
			
		}
}
	
	public static String scoreBoard()
	{	
	String sk = ("Wins: " + wins + " Losses: " + losses + " Draws: " + draws+"\n");
	return sk;
	}
}