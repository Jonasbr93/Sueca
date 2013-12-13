import java.util.ArrayList;
import java.util.Random;

public class Deck {
	
	final int DECKSIZE = 40;
	
	final char[] suits = {'h', 'c', 's', 'd'};
	final char[] cardNames = {'2', '3', '4', '5', '6', 't', 'j', 'q', 'k', 'a'};
	final int[] values = {0, 0, 0, 0, 0, 10, 3, 2, 4, 11};
	
	ArrayList<ButtonCard> cards;
	//SuecaGame myGame;
	
	public Deck(){
		this.cards = new ArrayList<ButtonCard>();
		
		for (int i=0; i<suits.length; i++){
			for (int j=0; j<cardNames.length; j++){
				String imagepath = "images/" + cardNames[j] + suits[i] + ".gif";
				ButtonCard card = new ButtonCard(imagepath, values[j], suits[i]);
				cards.add(card);
			}
		}
	}
	
	public void shuffle(){
		ArrayList<ButtonCard> shuffleCards = new ArrayList<ButtonCard>();
		
		Random random = new Random();
		
		for (int i=0; i<DECKSIZE; i++){
			int index = random.nextInt(DECKSIZE-i);
			shuffleCards.add(cards.remove(index));
		}
		
		cards = shuffleCards;
	}
	
	public ButtonCard getCard(int index){
		return cards.get(index);
	}
	
	public static void main(String[] args){
		Deck deck = new Deck();
		deck.shuffle();
		
		for(int i=0; i<deck.DECKSIZE; i++){
			ButtonCard card = deck.getCard(i);
			System.out.println(card.getValue() + ", " + card.getSuit());
		}
	}
}
