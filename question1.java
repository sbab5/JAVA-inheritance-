// Write a Java program to create a class called Animal with a method called makeSound(). Create a subclass called Cat that overrides the makeSound() method to bark.
import java.util.Scanner;
class Animal {
    void makesound(){
        System.out.println("animal make sound");
    }

}
class cat extends Animal{
    @Override
    public void makesound(){
        System.out.println("cat make sound");
    }
 
}
public class question1 {
    public static void main(String[] args) {
        Animal animal=new Animal();
        cat Cat=new cat();
        animal.makesound();
        Cat.makesound();
    }

    
}
