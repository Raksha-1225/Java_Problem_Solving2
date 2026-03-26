class Animal{
    void sound(){
        System.out.println("All Animal makes sound");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.print("Cat meows");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.print("Dog barks");
    }
}
public class MethodOverriding {
    public static void main(String args[]){
        Animal a;
        a=new Cat();
        a.sound();
        a=new Dog();
        a.sound();
        a=new Animal();
        a.sound();
    }
    
}
