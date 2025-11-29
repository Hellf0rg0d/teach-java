package oops;

public enum birthdays {
    hellf0rg0d("09-11-2006",19),
    stov("01-04-2006",19),
    ;
    private String birthday;
    int age;
   static dog pet;
    birthdays(String birthday,int age){
this.birthday = birthday;
this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }
}
