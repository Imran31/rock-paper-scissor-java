public class RPSgame
{
	public static void main(String [] args)
	{
		RPSengine game = new RPSengine();
		
		System.out.println("\tWelcome to The Rock, Paper, Scissor Game!");
		System.out.println("\tPlease enter your move");
		System.out.println("\t[Rock = r, Paper = p, Scissors = s]");
		System.out.println("\tJust to be clear the AI will play his move before you,");
		System.out.println("\tso your move won't be the deciding factor.");
		System.out.println("\tFirst to win 3");
		
		game.start();
		int i =1;
		
		do
			{	
				
				System.out.println("ROUND "+i);
				
				game.playerInput();
				game.decide();
				System.out.println();
				
				System.out.println("Score" +
				"\n" + "AI : " +game.AIpoint + "\n"
					+"Player : " +game.Playerpoint);
				
				
				System.out.println();
				System.out.println();
				
				i++;
			}
		while(game.end == 0);
		
		
	}
		
}