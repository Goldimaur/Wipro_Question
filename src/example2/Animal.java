package example2;

/*   Created by IntelliJ IDEA.
 *   Author: Goldi Maurya
 *   Date: 24-03-2021
 *   Time: 13:22
 *   File: example2.Animal.java
 */
// There is an animal class which has the common characteristics of all animals. example2.Dog, example2.Horse, example2.Cat are
// animals(sub-class). Each can shout, but each shout is different.
// Use polymorphism to create objects of same and using an animal variable, make each of the animals shout.
public abstract class Animal {
    abstract void shout();
    public void speak(){
        System.out.println("animal speak ");
    }
    Animal(){
        System.out.println("example2.Animal object is created");
    }
    Animal(int i ){
        System.out.println("lkdkl");
    }
}
class Dog extends Animal {
    @Override
    void shout() {
        System.out.println("bhauuuuuu");;
    }

    @Override
    public void speak() {
        super.speak();
    }
}
class Horse extends Animal{
    // error in sout
    @Override
    void shout() {
        System.out.println("horse shout");;
    }
    public void run(){

    }


    @Override
    public void speak() {
        System.out.println("horse speak");;
    }
    Horse(){
        super();
        System.out.println("example2.Horse object is created");
    }
}
class Cat extends Animal{

    @Override
    void shout() {
        System.out.println("meowww");
    }
}
class Main{
    public static void main(String[] args) {
        Animal animal = new Horse();
        animal.shout();
        animal.speak();// dynamic dispatch .. complier is confusion which one to call animal or horse
        animal.speak(); // speak is common in both
        Animal animal1 = new Dog();
        animal1.shout();
        Animal animal2 = new Cat();
        animal2.shout();
    }
}