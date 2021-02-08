package day01;
import java.util.Scanner;
public class While {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入内容");
        String str1="停止";
        while(true) {
            String str2 = scanner.nextLine();
            if (str1.equals(str2)) {
                break;
            }
        }
    }
}
