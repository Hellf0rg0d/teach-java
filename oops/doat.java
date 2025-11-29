package oops;

public class doat extends dog{
    Boolean doesItHaveCatEyes;
    Boolean isItPlayFull;
    doat(String color,String name,Boolean doesItHaveCatEyes, Boolean isItPlayFull){
        dog.name = name;
        dog.color = color;
        this.doesItHaveCatEyes = doesItHaveCatEyes;
        this.isItPlayFull = isItPlayFull;
    }
    public void eye(){
        System.out.println(doesItHaveCatEyes);
    }
    public void name(){

    }
}
