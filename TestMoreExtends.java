package demo3;

/**
 * 多个接口的实现（多继承）
 * 接口作用：
 * 类的使用者不关注具体类型，只关注具有的功能
 */
class Animal {
    protected String name;
    public Animal (String name){
        this.name = name;
    }
}
interface IFlying {
    void fly();
}
interface IRunning {
    void run();
}
interface ISwimming {
    void swim();
}

class Cat extends Animal implements IRunning{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name+"正在用四条腿跑");
    }
}
class Fish extends Animal implements ISwimming{
    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(this.name+"正在用游泳");
    }
}
class Frog extends Animal implements ISwimming,IRunning{
    public Frog(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println(this.name+"正在用四条腿跑");
    }
    @Override
    public void swim() {
        System.out.println(this.name+"正在用游泳");
    }
}

class Robot implements IRunning,IFlying{
    @Override
    public void fly() {
        System.out.println("机器人正在用四条腿飞");
    }

    @Override
    public void run() {
        System.out.println("机器人正在用四条腿跑");
    }
}

public class TestMoreExtends {
    public static void walk(IRunning iRunning){
        System.out.println("-----------");
        iRunning.run();
    }
    public static void main(String[] args) {
        /*Robot robot = new Robot();
        robot.fly();
        robot.run();*/
        IRunning iRunning1 = new Cat("十六");
        IRunning iRunning = new Robot();
        IFlying iFlying = new Robot();
//        iRunning.run();
//        iFlying.fly();
        walk(iRunning);
        walk(iRunning1);


    }
}
