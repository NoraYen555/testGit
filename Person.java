package erica;

public class Person{
    String name;
    int age = 100;
    
    public Person(String name){
        this.name = name;
    }
    
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void show(){
        System.out.println("name:" + name + ", age:" + age);
    }
}