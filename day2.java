/*Program-1 EvenOrOdd*/
class EvenOrOdd{
  public static void main(String args[]){
    int num = 11;
    if (num%2==0) {
      System.out.println("Even");//it checks the condition is even
    } else { 
      System.out.println("Odd");
    }
  }
}

/*Program-2 Factorial*/
import java.util.Scanner;
class Factorial{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);//takes input from the user
    System.out.print("Enter the number:");
    int num = sc.nextInt();//takes input from the user
    long factorial = 1;

    for (i = 1; i <= num; i++) {
        factorial *= i;
    }
  }
}

/*Program-3 Fibonacci*/
import java.util.Scanner;
class Fibonacci{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of n:");
    int n = sc.nextInt();
    for (int i=2; i<=n; i++) {
        int temp = a + b;
        a = b;
        b = temp;
    }
    System.out.println("The "+n+"th fibonacci number is:"+b);
  }
}




    
