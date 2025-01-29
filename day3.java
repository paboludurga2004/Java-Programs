/*Program 1 NumberCheck*/
class NumberCheck{
  public static void main(String args[]){
    int num = 0;
    if (num > 0) {
      System.out.println("The number is positive.");//It checks positive number
    }
    else if (num < 0) {
      System.out.println("The number is negative.");//it checks negative number
    }
    else {
      System.out.println("The number is zero.");//it checks equal number
    }
  }
}

/*Program 2 Triangle*/
class Triangle{
  public static void main(Sting args[]){
    int a = 5, b = 5, c = 5;
    if (a == b && b == c) {
      System.out.println("The triangle is Equilateral.");
    } 
    else if (a == b || b == c || a == c) {
      System.out.println("The triangle is Isosceles.");
    }
    else {
      System.out.println("The triangle is Scelene.");
    }
  }
}

/*Program 3 Leap Year*/
class LeapYear{
  public static void main(String args[]){
    int year = 2020;
    if (year % 4 == 0){
      if (year % 100 == 0 || year % 400 == 0){
        System.out.println(year + " is a leap year.");
      }
      else{
        System.out.println(year + " is not a leap year.");
      }
    }
  }
}


          
      
