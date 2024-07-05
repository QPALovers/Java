import com.bit.www.Animal1;

/**
 * protected 修饰符
 */
public class Main extends Animal1 {
    public void fun(){
        Animal1 animal1 = new Animal1();
        //animal1.eat();
        //super.eat();
        System.out.println(super.age);
    }
    public static void main(String[] args) {
        //Animal1 animal1 = new Animal1();
        //animal1.eat();
    }

}