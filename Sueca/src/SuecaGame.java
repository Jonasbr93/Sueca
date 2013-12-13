import java.util.ArrayList;

public class SuecaGame {

	ArrayList<Team> teams;
	
	public class Team{
		
		Player player1;
		Player player2;
		int roundPoints;
		int gamesWon;
		
		public Team(Player p1, Player p2){
			this.player1 = p1;
			this.player2 = p2;
			this.gamesWon = 0;
			this.roundPoints = 0;
		}
		
		public void wonGame(){
			this.gamesWon++;
		}
		
		public void addScore(int points){
			this.roundPoints += points;
		}
		
		public int getScore(){
			return this.roundPoints;
		}
	}
}
