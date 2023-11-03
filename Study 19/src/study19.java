 import java.util.*;

 public class study19 {

	public static void main(String[] args) {
		 
	ArrayList<ArrayList<String>> fridgeList = new ArrayList();	
		
	ArrayList<String> topdesk = new ArrayList();	
	topdesk.add("eggs");	
	topdesk.add("milk");	
	topdesk.add("cake");	
	
	ArrayList<String> seconddesk = new ArrayList();	
	seconddesk.add("leftover");	
	seconddesk.add("vegetable");	
	
	ArrayList<String> lowerdesk = new ArrayList();	
	lowerdesk.add("sauce");	
	lowerdesk.add("tomato");	
	lowerdesk.add("chives");	
	
	fridgeList.add(topdesk);
	fridgeList.add(seconddesk);
	fridgeList.add(lowerdesk);
	
	System.out.println(fridgeList.get(0).get(0));
	
	
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
