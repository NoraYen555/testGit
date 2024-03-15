package erica;

public class Package{
    String name;
    int age = 100;
    
    public Package(String name){
        this.name = name;
    }

    public Package(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void show(){
        System.out.println("name:" + name + ", age:" + age);
    }
}