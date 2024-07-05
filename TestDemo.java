package com.bit.www;

/**
 * 1.向上转型：父类引用 实例化子类对象。
 * 父类只能调用父类的方法及字段，不能调用子类的对象，若子类中有该方法，则调用子类的方法(发生动态绑定/运行时绑定)
 *   向上转型的三种方式： 赋值 ，作为参数 ，返回值
 *   动态绑定；反编译时一直是父类代码，最后运行结果却是子类的方法
 *
 * 2.protected修饰符，主要体现在继承上.  访问范围：类内，同一个包的不同类，不同包下的子类（具体看我写的Main类）
 * default，类内，同一个包的不同类
 *
 * 3.
 * 重写：
 * 方法名相同，返回值相同，参数列表相同。  在不同的，有继承关系的类中，
 *    被final修饰的方法无法重写   具有常量属性
 *    被private修饰的方法无法重写   只能在类内访问
 *    被static修饰的方法无法重写   只有一份
 *    被重写的方法，子类的访问修饰限定符一定要大于等于父类的
 *
 * 重载：
 * 方法名相同，返回值不做要求，参数列表不同。  在同一个类中。
 *
 *4.继承一般不要超过三层，最后不继承了要用final修饰，
 * final修饰类，密封类。修饰变量，常变量。修饰方法，此方法不能被重写
 *
 * 5.组合：将类作为变量类型使用
 *
 */
class Animal {   //父类  基类  超类
    //public String name;  provate修饰，在类中是被继承成功的，只是在类外无法访问是由于private的特性
    protected String name;  //在类中既体现封装，又在类外能访问
    public int age;

    public Animal(String name) {
        this.name = name;
        System.out.println("Animal()");
    }
    public void eat() {

        System.out.println("animal_eat()");
    }
    public void run()
    {

        System.out.println("run()");
    }

}

class Cat extends Animal { //子类  派生类  只能继承一个父类  继承除构造方法外的所有代码
    public int age;
    public Cat (String name,int age) {
        super(name);
        this.name = name;
        this.age = age;
        System.out.println("Cat()");
    }

    @Override
    public void eat() {
        System.out.println(this.name+"吃");
    }

    public void sleep() {
        System.out.println("sleep()");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    protected void fly() {
        System.out.println("Dog");
    }
}
/**
 * 多层继承
 */
//class Dog extends Cat {
//    public Dog(String name, int age) {
//        super(name, age);
//    }
//}
//
//final class Pet extends Dog{
//    public Pet(String name, int age) {
//        super(name, age);
//    }
//}
public class TestDemo {

    public static void main(String[] args) {
        /*Cat cat = new Cat("mimi",18);
        System.out.println(cat.name);
        cat.run();
        Animal animal = new Animal("haha");*/   //继承，super关键字，在子类实例化时，必须先实例化父类，并且super语句位于第一行


        //多继承
//        Dog dog = new Dog("dog",8);
//        Pet pet = new Pet("pet",2);

        Animal animal = new Cat("pet",5);  //向上转型
        //animal1.sleep();  无法运行
        animal.eat();  //对父类的eat方法进行 重写

        Cat cat = new Cat("kk",1);
        Test(cat);

        //向下转型
        Animal animal2 = new Cat("向下转型",4);
        if (animal2 instanceof Dog) {
            Dog dog1 = (Dog)animal2;
            dog1.fly();   //类型转换异常
        }else {
            System.out.println("请输入");
        }

    }
    //向上转型  作为参数
    private static void Test (Animal animal) {
        animal.eat();
    }
    //向上转型  返回值
    protected static Animal Test1 () {
        return new Cat("cc",9);
    }


}
