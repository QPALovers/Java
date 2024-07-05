class Person {
    private int age;
    private String name;
    private static String classroom;

    static {
        System.out.println("静态代码块");
    }
    {
        System.out.println("构造代码块");
    }

    //    public void setAge(int age) {
//        this.age = age;
//

    public static String getClassroom() {
        return classroom;
    }

    public int getAge() {
        return age;
    }


}

public class Student{
    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person();

//        System.out.println(person.getAge());
//        System.out.println(Person.getClassroom());
//
//        System.out.println(Person.getClassroom());
    }
}
