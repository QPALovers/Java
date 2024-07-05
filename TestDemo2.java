package com.demo2;

/**
 * 理解多态
 */

class Shape {
    public void draw() {

    }
}
class Cycle extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个⭕");
    }
}
class React extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个■");
    }
}
class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("画一个❀");
    }
}
//整个上面是类的实现者

//下面是类的调用者

public class TestDemo2 {
    /**
     * 什么是多态？
     * 1. 发生向上转型
     * 2. 子类重写方法
     * 3. 用父类对象来调用重写的方法（这时发生了运行时绑定）
     *
     * 多态的好处:
     * 比如我想再画一个❀，只要再写一个类即可
     * 封装--对类的调用者来说不必在意实现的细节，只管调用公有方法就行
     * 继承--代码进行复用
     * 多态--封装的升级，让类的调用者连类的类型都不必知道，只要知道这个对象具有某个方法即可
     *    --降低代码的圈复杂度
     * @param shape
     */

    public static void drawMap(Shape shape) {  //写这个方法时，不关注引用那个子类，
        shape.draw();//不同的对象调用同一个draw方法，最后的结果不同，这就是多态
        //每一次调用方法都会发生一次运行时绑定，所有的运行时绑定次数加一起就称之为多态
        // 只要传过来的子类重写了draw方法，调用该方法所展现的形式就不一样
    }

    public static void main(String[] args) {
        Shape shape1 = new Cycle();  //向上转型
        Shape shape2 = new React();
        Shape shape3 = new Triangle();
        //方法一
        drawMap(shape1);
        drawMap(shape2);
        drawMap(shape3);
        //方法二
//        shape1.draw();
//        shape2.draw();
    }

    public static void drawShapes() {
        //不用多态
        React react = new React();
        Cycle cycle = new Cycle();
        Triangle triangle = new Triangle();
        String[] shapes = {"cycle","react","triangle"};
        for (String shape:shapes) {
            if(shape.equals("cycle")){
                cycle.draw();
            }else if(shape.equals("react")){
                react.draw();
            }else {
                triangle.draw();
            }
        }
        //用多态
        Shape[] shapes1 = {new React(),new Cycle(),new Triangle()};
        
    }
}
