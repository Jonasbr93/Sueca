import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;


public class SuecaApp extends JFrame{

	//SuecaGame myGame;
	Rectangle2D.Double backgroundRect;
	
	public SuecaApp(){
		//myGame = new SuecaGame(this);
		//myGame.startGame();
		backgroundRect = new Rectangle2D.Double(0,0,800,600);
	}
	
	public static void main(String[] args){
		SuecaApp sa = new SuecaApp();
		
		sa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sa.setSize(800,600);
		sa.setVisible(true);
		sa.setBackground(Color.decode("#009900"));
		sa.setTitle("Sueca");
	}
}
