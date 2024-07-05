package Computer;

class Student {
    public static String name;
    public static int age;//被priavte修饰的属性，其他类如何访问。    一。通过构造方法，在其内部赋值   二。创建一个公开接口
    /*   构造方法内部赋值
    public Student(String name,int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person()"+ this.age+" "+this.name);
    }*/
    /*
    public void getAge(int age) {   main方法外部调用该方法并传参
        this.age = age;    对成员变量进行赋值
    }
    public int setAge() {   获取成员变量
        return this.age;
    }*/
//    public static int show(int age)
//    {
//        return ++age;
//    }
    /*
    public void setDate (String name,int age) {  //在方法内部进行初始化
        this.name = name;
        this.age = age;
    }
     public void print() {
         System.out.println("this.name  " + this.name + "  this.age:  " + this.age);
     } */
    /*  用构造方法初始化
     public Student (int age,String name) {
         this.name = name;
         this.age = age;
         System.out.println("this.name  " + this.name + "  this.age:  " + this.age);
     }*/
    /*  this调用其他构造方法
    public Student () {
        this(12,"coco");
        System.out.println("this.name: " + this.name + "  this.age:  " + this.age);
    }
    public Student(int age,String name) {
        this.name = name;
        this.age = age;
    }*/
}
/*
class Date {
    public int year;
    public int month;
    public int day;
    /*  二。this调用其他构造方法
    public Date(){
        System.out.println(this.year+ this.month+this.day);
    }
    public Date(int year,int month,int day){
        this();
        this.year = year;
        this.month = month;
        this.day = day;
        System.out.println(this.year+ this.month+this.day);
    }
}*/
class Person {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.set("intel","50","34");

    }

}
public class Computer {
    private String cpu;
    private String memory;
    private String screen;

    public void set(String cpu,String memory,String screen) {
        this.cpu = cpu;
        this.memory = memory;
        this.screen = screen;
        System.out.println("haha");
    }

//    public static void main(String[] args) {
//        //Student student = new Student(19,"kk");  用构造方法初始化
//        //Student student1 = new Student();  this调用其他构造方法
//        /*  二。this调用其他构造方法
//        Date date = new Date(2004,10,16);*/
////        int a;不初始化
////        System.out.println(a);
//        /*   在方法内部进行初始化,赋值前后对比，证明赋值成功
//        Student stu = new Student();
//        stu.print();
//        stu.setDate("coco",18);
//        stu.print();   */
//
//    }
    /*
    public static void main(String[] args) {
        Student per = new Student();
        Student.show(10);
        System.out.println(Student.show(10));
        Student.name = "dog";
        System.out.println(Student.name);*/
        /*  get 和 set
        per.getAge(10);
        System.out.println(per.setAge());*/
//        per.age = 10;
//        System.out.println(per.age);

}
