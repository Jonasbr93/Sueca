import javax.swing.ImageIcon;
import javax.swing.JButton;


public class ButtonCard extends JButton{

	private int value;
	private char suit;
	private boolean faceUp;
	
	ImageIcon imageFace;
	ImageIcon imageBackIcon = new ImageIcon("images/b.gif");
	
	public ButtonCard(String imagepath, int v, char s){
		super(new ImageIcon(imagepath));
		this.value = v;
		this.suit = s;
	}
	
	public ButtonCard(){
		super(new ImageIcon("images/b.gif"));
	}
	
	public int getValue(){
		return this.value;
	}
	
	public boolean isFaceUp(){
		return this.faceUp;
	}
	
	public void setFaceUp(boolean fu){
		this.faceUp = fu;
	}
	
	public char getSuit(){
		return this.suit;
	}
}
