public class abs {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.walk();        
    }
    
}
 abstract class Animal{
    void eat(){
        System.out.println("eats");
    }
    abstract void walk();
 }
 class Dog extends Animal{
    void walk(){
        System.out.println("they have four legs");
    }
 }

