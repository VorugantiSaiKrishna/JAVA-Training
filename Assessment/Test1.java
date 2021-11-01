package Assessment;

import java.util.Scanner;

 class FlowerDemo1 {

	public  void displayFlower(String Continent) {
		
			
		switch (Continent) {

	      case "ASIA":
	    	  System.out.println("COUNTRY NAME:INDIA\t NATIONAL FLOWER:LOTUS ");
	    	  System.out.println("COUNTRY NAME:PAKISTAN\t NATIONAL FLOWER:JASMINE ");
	    	  System.out.println("COUNTRY NAME:NEPAL\t NATIONAL FLOWER:LALI GURANS");
	        break;
	        
	      case "asia":
	    	  System.out.println("COUNTRY NAME:INDIA\t NATIONAL FLOWER:LOTUS ");
	    	  System.out.println("COUNTRY NAME:PAKISTAN\t NATIONAL FLOWER:JASMINE ");
	    	  System.out.println("COUNTRY NAME:NEPAL\t NATIONAL FLOWER:LALI GURANS");
	        break;
	      

	      case "EUROPE":
	    	  System.out.println("COUNTRY NAME:GERMANY\t NATIONAL FLOWER:CORN FLOWER");
	    	  System.out.println("COUNTRY NAME:FRANCE\t NATIONAL FLOWER:LILY ");
	    	  System.out.println("COUNTRY NAME:GREECE\t NATIONAL FLOWER:ACANTHUS MOLLIS ");
	    	  
	        break;
	        
	      case "europe":
	    	  System.out.println("COUNTRY NAME:GERMANY\t NATIONAL FLOWER:CORN FLOWER");
	    	  System.out.println("COUNTRY NAME:FRANCE\t NATIONAL FLOWER:LILY ");
	    	  System.out.println("COUNTRY NAME:GREECE\t NATIONAL FLOWER:ACANTHUS MOLLIS ");
	    	  
	        break;

	     
	      case "AFRICA":
	    	  System.out.println("COUNTRY NAME:EGYPT\t NATIONAL FLOWER:BLUE LOTUS ");
	    	  System.out.println("COUNTRY NAME:NIGERIA\t NATIONAL FLOWER:YELLOW TRUMPET  ");
	    	  System.out.println("COUNTRY NAME:KENYA\t NATIONAL FLOWER:ORCHID ");
	    	  break;
	    	  
	      case "africa":
	    	  System.out.println("COUNTRY NAME:EGYPT\t NATIONAL FLOWER:BLUE LOTUS ");
	    	  System.out.println("COUNTRY NAME:NIGERIA\t NATIONAL FLOWER:YELLOW TRUMPET  ");
	    	  System.out.println("COUNTRY NAME:KENYA\t NATIONAL FLOWER:ORCHID ");
	    	  break;
	    	  
	      default:
	    	  System.out.println("Invalid Option");
	        break;
	}
		
}
}
public class Test1 {

	public static void main(String[] args) {
		char choice;
		FlowerDemo1 fd=new FlowerDemo1();
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
