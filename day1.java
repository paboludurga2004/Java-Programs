/*Program-1-Hello Java*/
class Hello{
  public static void main(String args[]){
    System.out.println("Hello java");
  }
}

/*Program-2-ASCII*/
import java.util.Scanner;
class ASCII{
  public static void main(String args[]){
    //calling ASCII as user input
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the ASCII value:");
    int ascii = sc.nextInt();
    //converting ASCII to character
    char ch = (char) ascii;
    System.out.println("The character for ASCII value "+ascii+"is:"+ch);
  }
}
    
