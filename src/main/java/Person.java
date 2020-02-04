import java.util.Arrays;

public class Person {
    String name;
    int age;
    String gender;
    String[] interests;
    public Person(String name, int age, String gender, String[] interests)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.interests = interests;
    }

    public String hello()
    {
        String topic = "";
        for (int i = 0; i<interests.length; i++){
            if(i==2){
                topic += " and ";
            }
            if(i==1){
                topic += ", ";
            }
        topic += interests[i];
        }
        String msg = "Hello, my name is " + name +" and I am " + age + " years old."+ "\n" +
                "My interests are ";
        return msg+ topic;
    }
}

