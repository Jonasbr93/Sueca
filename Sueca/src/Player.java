import java.util.ArrayList;


public class Player {

	private ArrayList<ButtonCard> cards;
	private boolean turn;
	private String name;
	
	public Player(String name, ArrayList<ButtonCard> cards){
		this.cards = cards;
		this.turn = false;
		
	}
	
	public void playCard(ButtonCard card){
		this.cards.remove(card);
	}
	
	
	public static void main(String[] args){
		int num = 15432;
		String numStr = num+"";
		ArrayList<Integer> left = new ArrayList<Integer>();
		ArrayList<Integer> right = new ArrayList<Integer>();
		boolean b = false;
		
		left.add(Integer.parseInt(numStr.charAt(0)+""));
		
		for(int i=1; i<numStr.length(); i++){
			int temp = Integer.parseInt(numStr.charAt(i)+"");
			
			if (!b){
				if (left.get(left.size()-1) < temp){
					left.add(temp);
				} else{
					b = true;
					right.add(temp);
				}
			} else {
				right.add(temp);
			}
		}
		
		for (int i = 0; i<left.size(); i++){
			System.out.print(left.get(i));
		}
		System.out.println("");
		for (int i = 0; i<right.size(); i++){
			System.out.print(right.get(i));
		}
	}
	
}
