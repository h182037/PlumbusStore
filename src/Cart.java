import java.util.ArrayList;

public class Cart {

	private ArrayList<Item> Content;
	
	Cart(){
		
	}
	
	private ArrayList<Item> getContent() {
		return Content;
	}
	
	private void addItem(Item item) {
		Content.add(item);
	}
	
	private void removeItem(Item item) {
		Content.remove(item);
	}
	
	private double getFullPrice() {
		double sum = 0.0;
		for(int i = 0; i < Content.size(); i++) {
			sum += Content.get(i).getPrice();
		}
		return sum;
	}
}
