package demo3;

/**
 * 接口（interface）：对抽象类进一步抽象
 * 1. 接口当中的方法都是抽象方法，被public abstract修饰
 * 2. 也可以有具体的实现方法（jdk1.8以后）,被default进行修饰的
 * 3. 接口中定义的成员变量默认是常量，被public static final修饰（可省略）
 * 4. 接口不能被实例化
 * 5. 只要类实现了该接口，就能向上转型
 *
 * 接口和类之间的关系：implements（实现）
 *
 * 接口的作用：
 * 解决了Java的单继承问题（只能继承一个类）
 *
 */
interface Shape {
    int a = 2;
    void draw();
    /*default void func(){   //也可以有具体的实现方法（jdk1.8以后），基本不用
        System.out.println("haha");
    }*/
}
interface A {

}
class React implements Shape {  //解决了Java的单继承问题
     @Override
     public void draw() {
        System.out.println("画一个■");
        }
}
/*
class React implements Shape,A {  //解决了Java的单继承问题
    @Override
    public void draw() {
        System.out.println("画一个■");
    }
}*/
class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个❀");
    }
}

public class TestInterface {
    public static void drawMap(Shape shape){
        shape.draw();
    }

    public static void main(String[] args) {
        Shape shape = new React();
        Shape shape1 = new Triangle();
        drawMap(shape);
        drawMap(shape1);

    }
}
