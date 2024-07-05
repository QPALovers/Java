package com.bit.demo;


//class Cat {
//    public String name;
//
//    public void eat (){
//        System.out.println("Cat：：eat()");
//    }
//    public void sleep(){
//        System.out.println("Cat：：sleep()");
//    }
//}

//class Bird {
//    public String name;
//    public void eat (){
//        System.out.println("Bird：：eat()");
//    }
//    public void fly(){
//        System.out.println("Bird：：fly()");
//    }
//}
class Animal {
    public String name;

    public Animal (String name) {
        this.name = name;
        System.out.println("Animal(String)");
    }
    public void eat() {

        System.out.println(this.name + "  Animal：：eat()");
    }
    public void Sleep () {

        System.out.println("Animal：：sleep()");
    }
}

//简化代码——>继承
class Cat extends Animal {
    public Cat (String name) {
        super(name);
        /*this.name = name;
        System.out.println(this.name);*/
    }
//    public String name;
//
//    public void eat (){
//        System.out.println("Cat：：eat()");
//    }
}
class Bird extends Animal {
    public Bird (String name) {

        super(name);
    }
    public void fly(){

        System.out.println("Bird：：fly()");
    }
}



public class test {
    public static void main(String[] args) {
        /*Animal animal = new Animal();
        animal.name = "mimi";
        System.out.println(animal.name);
        Bird bird = new Bird();
        System.out.println(bird.name);*/
        Cat cat = new Cat("ami");
        cat.eat();
    }
}