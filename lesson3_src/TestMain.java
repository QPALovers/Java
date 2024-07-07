import user.User;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名>:");
        String name  = scanner.nextLine();
        System.out.println("请输入你的身份： 1--管理员，0--普通用户");
        int choice  = scanner.nextInt();
        if(choice == 1){
            User.login();
        } else if (choice == 0) {

        }else {
            System.out.println("非法输入，请重试");
        }


    }
}