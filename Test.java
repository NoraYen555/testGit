import erica.Package;
import erica.Person;

class Teacher{
    String name;
    int age = 100;
    
    public Teacher(String name){
        this.name = name;
    }
    
    public Teacher(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void show(){
        System.out.println("name:" + name + ", age:" + age);
    }
}

public class Test{
    public static void main(String[] args) {
       Package p1 = new Package("winni");
       Package p2 = new Package("CT", 58);  
       Person p3 = new Person("patty");

       p1.show();
       p2.show();
       p3.show();
    }
}
