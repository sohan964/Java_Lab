import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Category: ");
	    char Category = sc.next().charAt(0);
	    double bill;
	    System.out.print("Enter Bill: ");
	    bill = sc.nextDouble();
	    switch(Category){
	        //Residential
	        case 'A':{
	            
	            if(bill>=0 && bill<=75){
	                bill*=3.80;
	            }
	            else if(bill>=76 && bill<=200) bill*=5.14;
	            else if(bill>=201 && bill<=300) bill*=5.36;
	            else if(bill>=301 && bill<=400) bill*=5.63;
	            else if(bill>=401 && bill<=600) bill*=8.70;
	            else if(bill>600) bill*=9.98;
	            
	            //this is for 20% additional
	            bill += (bill*0.2);
	           // System.out.println("bill: " + bill);
	        }
	        break;
	        
	        //Agricultural pumping
	        case 'B':{
	            bill*=3.82;
	            
	        }
	        break;
	        //Small industres
	        case 'C' :{
	            System.out.println("Enter 'A' for Flat rate or Enter 'B' for off peak time: ");
	            char type= sc.next().charAt(0);
	            switch(type){
	                case 'A':{
	                    bill*=7.66;
	                }
	                case 'B':{
	                    bill*=9.24;
	                }
	            }
	        }
	        break;
	    }
	    System.out.println("bill: " + bill);
	}
}
