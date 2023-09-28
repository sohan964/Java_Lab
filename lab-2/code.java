import java.util.Scanner;

public class code
{
  // spy number
  public void Spy (int n)
  {
    int num = n, product = 1, sum = 0, lastdigit;
    while (num > 0)
      {
	    lastdigit = num % 10;
	    sum = sum + lastdigit;
	    product = product * lastdigit;
	    num = num / 10;
      }
    if (sum == product) System.out.println ("The given number is a spy number.");
    else System.out.println ("The given number is not a spy number.");
  }

  //perfect number
  public void Perfect(int n)
  {
    int sum = 1;
 
    for (int i = 2; i * i <= n; i++)
    {
        if (n % i==0)
        {
            if(i * i != n)
                sum = sum + i + n / i;
            else
                sum = sum + i;
        }
    }
    if (sum == n && n != 1)  System.out.println( n + " is a perfect number");
    else System.out.println( n + " is not a perfect number");
  }

  // palindrome number
  public void Palindrome(int n)
  {
    int reverse = 0;
    int temp = n;
    while (temp != 0) {
      reverse = (reverse * 10) + (temp % 10);
      temp = temp / 10;
    }
    if(reverse == n) System.out.println(n + " is a palindrome number");
    else System.out.println(n + " is not a palindrome number");
  }

  // ducknumber
  public void DuckNumber(int number) {  
        int n = number;
        boolean f1 = false;
        while(number != 0) {  
  
            if(number%10 == 0) {
                f1=true;
                break;
            }
 
            number = number / 10;  
        }  
        if(f1) System.out.println(n + " is a DuckNumber");
        else System.out.println(n + " is not a DuckNumber");
    
   }

   //Neon number
   public void Neon(int num){

    int sum = 0, n=num;

    int square = n * n;

    while (square != 0){

      int digit = square % 10;

      sum = sum + digit;

      square = square / 10;

    }
    if (n == sum) System.out.println (n + " is a Neon Number.");

    else System.out.println (n + " is not a Neon Number.");

  }
  
  
    // the code for armstrong number start
    int power(int x, long y)
    {
        if (y == 0)
            return 1;
        if (y % 2 == 0)
            return power(x, y / 2) * power(x, y / 2);
        return x * power(x, y / 2) * power(x, y / 2);
    }
 
    int order(int x)
    {
        int n = 0;
        while (x != 0) {
            n++;
            x = x / 10;
        }
        return n;
    }
 
    public void isArmstrong(int x)
    {
        // Calling order function
        int n = order(x);
        int temp = x, sum = 0;
        while (temp != 0) {
            int r = temp % 10;
            sum = sum + power(r, n);
            temp = temp / 10;
        }
 
        
        if(sum == x) System.out.println(x + " is a Armstrong number");
        else System.out.println(x + " is not a Armstrong number");
    }
    // Armstrong number code end

    //sunny number
    public void SunnyNumber(double  x){
 
      double sr = Math.sqrt(x);
      if((sr - Math.floor(sr)) == 0) System.out.println((x-1) + " is a sunny number");
      else System.out.println((x-1) + " is not a sunny number");

    }

    //this is main function
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    code cd = new code();
    System.out.print ("Enter the number to check: ");
    int n = sc.nextInt();
    cd.Spy(n);
    cd.Perfect(n);
    cd.Palindrome(n);
    cd.DuckNumber(n);
    cd.Neon(n);
    cd.isArmstrong(n);
    cd.SunnyNumber(n+1);
  }

}
