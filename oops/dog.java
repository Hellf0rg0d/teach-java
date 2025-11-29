package oops;

public class dog {
    public static String color;
    public static  String name;
    public static birthdays OwnerBirthday;
     dog(String color,String name,birthdays OwnerBirthday){
        this.color = color;
        this.name = name;
        this.OwnerBirthday = OwnerBirthday;
    }
    dog(){
        color = "White";
        name = "Dog";
    }
    dog(int value){
       System.out.println(value*value);
    }
    public void feedDog(){
        feed feed = new feed(name,color);
    }
    public void whenIsOwnerBirthday(){
        System.out.println(OwnerBirthday.getBirthday());
    }

}
