import java.util.Scanner;

public class SwitchCaseProgram {


	public static void main(String[] args) {
		
		char choice;
		do
		{
			System.out.println("1.Add 2 numbers");
			System.out.println("2.Avg of 2 nos");
			System.out.println("3. Even or Odd");
			System.out.println("4. Positive or Negative");
			System.out.println("5. Prime or Not");
			System.out.println("6. Exit");
			 System.out.println(" ");
		

		 System.out.println("Enter the Option");
	    int opt;
	    Scanner sc = new Scanner(System.in);
	    opt=sc.nextInt();

	    
	    switch (opt) {

	      case 1:
	    	  int i;
	    	  int j;
	    	  System.out.println("Enter no1");
	    	  i=sc.nextInt();
	    	  System.out.println("Enter no2");
	    	  j=sc.nextInt();
	    	  System.out.println(i+j);
	        break;

	      case 2:
	    	 
	    	  System.out.println("Enter no1");
	    	  i=sc.nextInt();
	    	  System.out.println("Enter no2");
	    	  j=sc.nextInt();
	    	  System.out.println((i+j)/2);
	        break;

	     
	      case 3:
	    	  System.out.println("Enter number");
	    	  i=sc.nextInt();
	    	  if(i%2==0)
	    		  System.out.println("Even");
	    	  else
	    	  System.out.println("Odd");
	    	  break;
	      case 4:
	    	  System.out.println("Enter number");
	    	  i=sc.nextInt();
	    	  if(i>0)
	    		  System.out.println("Positive");
	    	  else if(i<0)
	    	  System.out.println("Negative");
	    	  else
	    	  System.out.println("Neither Positive nor Negative");
	    	  break;
	      case 5:
	    	  System.out.println("Enter number"); 
	    	  int num;
	    	  num=sc.nextInt();
	    	    int count=0;
	    	    for (i = 1; i <= num; i++) {
	    	   
	    	      if (num % i == 0) {
	    	        
	    	       count++;
	    	      }
	    	    }

	    	    if (count==2)
	    	      System.out.println(num + " is a prime number.");
	    	    else
	    	      System.out.println(num + " is not a prime number.");
	    	    break;
	      case 6:
	    	  System.out.println("Program exitted");
	    	  System.exit(0);
	    
	      default:
	    	  System.out.println("Invalid Option");
	        break;
 
	    }
	    System.out.print("Enter Y for yes or N for no: ");
         choice = sc.next().charAt(0);
		} while ((choice == 'y') || (choice == 'Y'));
	}
}



