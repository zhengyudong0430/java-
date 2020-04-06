package user;

import operation.*;

import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-04-06
 * Time: 16:15
 */
public class AdminUser extends User{
    public AdminUser(String name) {
        super(name);
        this.Operations = new Ioperation[]{
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation(),

        };
    }
    public int menu() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("hello,"+this.name+"欢迎来到兽兽的图书管理系统");
    System.out.println("0.退出系统");
    System.out.println("1.查阅书籍");
    System.out.println("2.新增书籍");
    System.out.println("3.删除书籍");
    System.out.println("4.打印书籍");
    int choice   = scanner.nextInt();
    return choice ;
}

}

