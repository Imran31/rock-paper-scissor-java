import java.util.Scanner;
public class RPSengine
{
	private String R = "r";
	private String P = "p";
	private String S = "s";
	
	String Player;
	String AI;
	
	public int end = 0;
	
	int Playerpoint;
	int AIpoint;
	
	String win()
	{
		AI = Player;
		AIpoint++;
		
		System.out.println("YOU LOST THIS ROUND!");
		endgame();
		return AI;
	}
	
	String lose()
	{
		Playerpoint++;
		endgame();
		System.out.println("YOU WON THIS ROUND!");
		
		if(AI.equals(R) && Player.equals(P))
			AI = S;
		else if(AI.equals(S) && Player.equals(R))
			AI = P;
		else if(AI.equals(P) && Player.equals(S))
			AI = R;
		
		return AI;
		
	}
	
	public  String start()
	{
		AI = P;
		return AI;
	}
	
	void endgame()
	{
		if(AIpoint == 3 || Playerpoint == 3)
			{
				System.out.println("Score" +
				"\n" + "AI : " +AIpoint + "\n"
					+"Player : " +Playerpoint);
				{	
					if(Playerpoint == 3)
						System.out.println("Congratulation! You WIN!");
				
					else
						System.out.println("You LOST! Better luck next time!");
				}
				
				end++;
			
			}
		
	}
	
	void displayMove()
	{
		System.out.println("Player move : "+Player);
		System.out.println("AI move : "+AI);
	}
	
	String draw()
	{
		System.out.println("DRAW!");
		AI = Player;
		return AI;
	}
	
	public void decide()
	{
		displayMove();
		
		if (AI.equals(P) && Player.equals(S))
			lose();
		else if (AI.equals(R) && Player.equals(P))
			lose();
		else if (AI.equals(S) && Player.equals(R))
			lose();
		else if (AI.equals(P) && Player.equals(R))
			win();
		else if (AI.equals(R) && Player.equals(S))
			win();
		else if (AI.equals(S) && Player.equals(P))
			win();
		else if(AI.equals(Player))
			draw();
			
	}
	
	public String playerInput()
	{
		Scanner input = new Scanner(System.in);
		String p = input.nextLine();
		Player = p.toLowerCase();
		
		return Player;
	}
		
}