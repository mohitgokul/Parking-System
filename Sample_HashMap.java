
// Sample Java to show the HashMap function
// Java.util.HashMap 

import java.util.HashMap; 
import java.util.Map; 

public class Marks 
{ 
	public static void main(String[] args) 
	{ 
		//Create the HashMap function
		HashMap<String, Integer> map = new HashMap<>(); 
		
		print(map); 
		//Enter the Value which you need to Map
		map.put("Mathew", 90); 
		map.put("Andrew", 70); 
		map.put("George", 80); 
		
		System.out.println("Size of map is:- " + map.size()); 
	
		print(map); 
		//Use the Condition to obtain the value of the Map
		if (map.containsKey("Mathew")) 
		{ 
			Integer a = map.get("Mathew"); 
			System.out.println("The Marks for \"Mathew\" is: " + a); 
		} 
		
		map.clear(); 
		print(map); 
	} 
	
	public static void print(Map<String, Integer> map) 
	{ 
		//If map is empty print this one
		if (map.isEmpty()) 
		{ 
			System.out.println("map is empty"); 
		} 
		
		else
		{ 
			System.out.println(map); 
		} 
	} 
} 
