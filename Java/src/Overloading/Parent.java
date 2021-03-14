package Overloading;

public class Parent {
	
	public static void main(String[] args) {
		
		boolean passdoor = true;
		boolean missdoor = false;
		boolean passAllDoors = false;
		int doorCount=0;
		
		if(passdoor) {
			System.out.println("we are in the first door");
			doorCount =doorCount+1;
		}
		if(missdoor) {
			System.out.println("we are int second door");
			doorCount=doorCount+1;
		}
		if(passdoor) {
			System.out.println("we are in the third door");
			doorCount=doorCount+1;
		}
		if(doorCount==3) {
			passAllDoors =true;
			}
		if(passAllDoors) {
			System.out.println("we won the game");
		}
	}
	
	
	

}
