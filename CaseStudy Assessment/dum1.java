package Assessment;

import java.util.Scanner;

class FlowerDemo {

	public  void displayFlower(String Continent) {
		
			
	if(Continent.equalsIgnoreCase("ASIA"))
	{
	    	  System.out.println("COUNTRY NAME:INDIA\t NATIONAL FLOWER:LOTUS ");
	    	  System.out.println("COUNTRY NAME:PAKISTAN\t NATIONAL FLOWER:JASMINE ");
	    	  System.out.println("COUNTRY NAME:NEPAL\t NATIONAL FLOWER:LALI GURANS");
	}
	else if(Continent.equalsIgnoreCase("EUROPE"))
	{
	        
	
	    	  System.out.println("COUNTRY NAME:GERMANY\t NATIONAL FLOWER:CORN FLOWER");
	    	  System.out.println("COUNTRY NAME:FRANCE\t NATIONAL FLOWER:LILY ");
	    	  System.out.println("COUNTRY NAME:GREECE\t NATIONAL FLOWER:ACANTHUS MOLLIS ");
	} 	  
	else if(Continent.equalsIgnoreCase("AFRICA"))     
	{
	    	  System.out.println("COUNTRY NAME:EGYPT\t NATIONAL FLOWER:BLUE LOTUS ");
	    	  System.out.println("COUNTRY NAME:NIGERIA\t NATIONAL FLOWER:YELLOW TRUMPET  ");
	    	  System.out.println("COUNTRY NAME:KENYA\t NATIONAL FLOWER:ORCHID ");
	}
	else {
	    	  System.out.println("Invalid Option");
	      
	}
		
}
}
public class dum1 {
	public static void main(String[] args) {
		char choice;
		FlowerDemo fd=new FlowerDemo();
		do {
		System.out.println("Choose a Continent: ASIA,EUROPE,AFRICA");
		System.out.println("Enter the Continent name");
		String continent;
		Scanner sc = new Scanner(System.in);
		continent=sc.nextLine();
		fd.displayFlower(continent);
		
		System.out.print("Enter Y for yes or N for no: ");
		 
         choice = sc.next().charAt(0);
		} while ((choice == 'y') || (choice == 'Y'));
	
	}
}
