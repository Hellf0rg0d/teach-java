import java.util.Scanner;

class helloworld{
  public static void main(String[]args){
  System.out.println("Hello World");
  int a = 5;
  String b = "HI"; //array of chars in C but a single variable in java
  double c = 5.4; // double is float but can hold more decimal places than a float datatype
  boolean d = true; // true => 1 , false => 0
  char e = 'a';
  System.out.println(a+a); // printing result of a+a directly instead of storing them in a variable
  Scanner sc = new Scanner(System.in); // creating an **OBJECT** of a Scanner to read input from the console.
  System.out.println("Enter a number to be multipled by 2");
  int k = sc.nextInt(); // sc.nextInt(); is called whenever the program needs to read the input.
  System.out.println(k*2);
  //if condition or else if condition takes a boolean as a condition
  // i.e.. anything that returns either true or false 
if(k*2 == 10){
  System.out.println("The value you entered was 5");
}
else if(k*2 == 2){
  System.out.println("The value you entered was 1");
}
else {
  System.out.println("I've no idea what you've entered");
}
   }
}

