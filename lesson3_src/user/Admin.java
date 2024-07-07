package user;

public class Admin extends User {
    @Override
    public void login() {
        super.login();
    }

    @Override
    public void menu() {
        System.out.println("====================");
        System.out.println("hello"+this.name+"欢迎使用图书管理系统");
        System.out.println("1.查找图书");
        System.out.println("2.新增图书");
        System.out.println("3.删除图书");
        System.out.println("4.显示所有图书");
        System.out.println("0.退出系统");
        System.out.println("====================");
    }
}
