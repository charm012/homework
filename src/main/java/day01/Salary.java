package day01;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入李四评级:");
        String str = scan.nextLine();
        int a =5000;
        String str1="A";
        String str2="B";
        String str3="C";
        String str4="D";
        String str5="E";
        if(str.equals(str1)) {
            System.out.println("李四评级为:"+str+" 工资为："+(a+500));
        }else if(str.equals(str2)) {
            System.out.println("李四评级为:"+str+" 工资为："+(a+200));
        }else if(str.equals(str3)) {
            System.out.println("李四评级为:"+str+" 工资为："+a);
        }else if(str.equals(str4)) {
            System.out.println("李四评级为:"+str+" 工资为："+(a-200));
        }else if(str.equals(str5)){
            System.out.println("李四评级为:"+str+" 工资为："+(a-500));
        }else{
            System.out.println("输入错误");
        }

    }
}



