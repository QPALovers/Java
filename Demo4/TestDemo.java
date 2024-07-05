package Demo4;

import java.util.Arrays;

/**
 * 接口的使用实例:
 *java内置类型比大小可以直接比，但对象比较大小需要确认成员变量
 * 实现compara接口--》implements Comparable<需要比较的数据类型>，并重写compareTo方法
 *
 */
class Student implements Comparable<Student>{
    public String name;
    public int age;
    public int score;

    @Override
    public int compareTo(Student o) {
        if(this.age > o.age){
            return 1;
        } else if (this.age == o.age) {
            return 0;
        }else {
            return -1;
        }
    }

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Student student = new Student("bit",18,79);
        Student student1 = new Student("gao",29,70);
        Student student2 = new Student("shasha",17,99);
//        if (student.compareTo(student1) < 0){
//            System.out.println("student.age < student1.age");
//        }
          Student[] students = new Student[3];
          students[0] = student;
          students[1] = student1;
          students[2] = student2;
          Arrays.sort(students);
          System.out.println(Arrays.toString(students));
    }
//    public static void main1(String[] args) {
//        int[] array = {12,4,89,43,56};
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//    }
}
