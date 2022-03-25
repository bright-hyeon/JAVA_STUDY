//자바 기초-입력받아 출력하기 (22.03.23)
package project_name;

import java.util.Scanner;

public class scan2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //작은 정수
        //int number = scan.nextInt();
        //System.out.println(number);

        //큰 정수
        //long number1 = scan.nextLong();
        //System.out.println(number1);

        //작은 실수
        //float number2 = scan.nextFloat();
        //System.out.println(number2);

        //큰 실수
        //double number3 = scan.nextDouble();
        //System.out.println(number3);

        //문장이랑 숫자를 각각 입력받는 방법
        String str = scan.nextLine();
        int age = scan.nextInt();
        System.out.println("이름 : "+str);
        System.out.println("나이 : "+age);

    }
}
