package Assessment;

import java.util.Scanner;

class Ride{
	
	public int adultRide(int adult,int opt,int hrs)
	{
		int price;
	
		switch (opt) {

	      case 1:
	    	  /*ALIBABA*/
	    	  price=adult*hrs*50;
	    	  return price;
		case 2:
	    	  /*Alpline Slide*/
	    	  price=adult*hrs*60;
	    	  return price;
	    	

	      case 3:
	    	  /*Bumpper Cars*/
	    	  price=adult*hrs*45;
	    	  return price;
	 
	        
	      case 4:
	    	  /*Baloon Race*/
	    	  price=adult*hrs*70;
	    	  return price;  
	  
	      default:
	    	  System.out.println("Invalid Option");
	       return 0;
	}
	}

	
	public int childRide(int child,int opt, int hrs)
	{
		int price;
	
	switch (opt) {

      case 1:
    	  /*ALIBABA*/
    	  price=child*hrs*40;
    	  return price;
	case 2:
    	  /*Alpline Slide*/
    	  price=child*hrs*30;
    	  return price;
    	

      case 3:
    	  /*Bumpper Cars*/
    	  price=child*hrs*25;
    	  return price;
 
        
      case 4:
    	  /*Baloon Race*/
    	  price=child*hrs*60;
    	  return price;  
  
      default:
    	  System.out.println("Invalid Option");
       return 0;
		
	}
	
	}

}

public class EnjoyRide {

	public static void main(String[] args) {
		Ride rd=new Ride();
		Scanner sc = new Scanner(System.in);
		int adult;
        System.out.println("How many adults");
        adult=sc.nextInt();
        int child;
        System.out.println("How many children");
        child=sc.nextInt();
        System.out.println("Which ride");
       

		System.out.println("1.Alibaba");
		System.out.println("2.Alpine slide");
		System.out.println("3.Bumpper Cars");
		System.out.println("4. Baloon Race");
		System.out.println("Select an option");
		int opt;
		opt=sc.nextInt();
		System.out.println("How many hours want to take ride");
		int hrs;
		hrs=sc.nextInt();
		int tothrs;
		tothrs=(adult+child)*hrs;
		System.out.println("Total hours of Ride = "+tothrs);
		
		int adride=rd.adultRide(adult, opt, hrs);
		System.out.println("Adult Ride Fare = $ "+ adride);
		int childride=rd.childRide(child, opt, hrs);
		System.out.println("Child Ride Fare = $ "+childride);
		int totamount=adride+childride;
		System.out.println("Total Ride Fare = $ "+ totamount);

	}

}
