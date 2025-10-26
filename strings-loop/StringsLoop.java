import java.util.Scanner;
class StringsLoop{
  public static void main(String[]args){
    //String manipulation 
    String word = "I'm learning java";
    System.out.println(word.toLowerCase());
    System.out.println(word.toUpperCase());
    System.out.println(word.replaceAll("a","b"));
    System.out.println(word.length());
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Sentance");
    String value = sc.nextLine();
    System.out.println("Enter a word to be replaced with java\n");
    String replace = sc.nextLine();
    System.out.println(value.replaceAll(replace,"JAVA"));
    // LOOPS
    int counter = 0;
    while(!word.isEmpty()){
      System.out.println(word);
      counter++;
      if(counter == 15){
        word = "";
      }
    }
    //for loop
    for(int a = 1;a <= 10;a=a*2){
      System.out.println("cloud");
    }
    //do-while loop
    do{
      //code
    }
    while(word.isEmpty());
    // TYPE-CASTING
     value = "5";
    int result = Integer.parseInt(value);
    double value2= 22/7;
    int result2 = (int)value2;
    System.out.println(result);
    System.out.println(result2*5);
    
  }
}

