/*Program-1 Even Or Odd*/
class EvenOrOdd{
  public static void main(String args[]){
    int i = 10;
    if (i%2==0) {
      System.out.println("Even");//it checks even 
    }
    else {
      System.out.println("Odd");//it checks odd using i%2!=0
    }
  }
}

/*Program-2 Factorial*/
import java.util.Scanner;
class Factorial{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number:");
    long factorial = 1;
    for (int i=1; i<=num; i++) {
         factorial *= i;
    }
    System.out.println("Factorial of "+num+" is: "+factorial);
  }
}

/*Program-3 Fibonacci*/
import java.util.Scanner;
class Fibonacci{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of n:");
    int n = sc.nextInt();
    int a=0, b=1;
    for (int i=2; i<=number; i++) {
      int temp = a + b;
      a = b;
      b = temp;
      System.out.println("The"+n+"th fibonacci number is:"+b);
    }
  }
}

/*Program-4 Armstrong*/
import java.util.Scanner;
class Armstrong{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number:");
    int sc = sc.nextInt();
    int original = num, sum = 0;

    while(num!=0) {
      int digit = num % 10;
      sum += Math.pow(digit, 3);
      num /= 10;
    }

    if (sum == original) {
      System.out.println(original +" is an Armstrong");
    } else {
      System.out.println(original +" is not an Armstrong");
    }
  }
}
    
      
    
    
