// 자바기초 - 스캐너(22.03.23)
package project_name;

import java.util.Scanner;

public class class2 {
    public static void main(String[] args) {
        System.out.println("앵무앵무 앵무새");
        //입력받을 스캐너를 만든다. new : 새로운 스캐너를 만든다. System.in : 시스템 안으로 스캔한다.
        Scanner scan = new Scanner(System.in);
        //입력받을 것이 문장이라는 것을 알려줌 str : 입력받은 문장의 이름
        // scan.nextLine : 한 줄을 입력받는다.
        String str = scan.nextLine();
        System.out.println(str);
    }
}
/**
 * scan.nextLine()을 하는 순간 str이라는 이름표가 붙은 상자가 하나 생김.
 * 이 상자에는 '문장'만 들어올 수 있음 String이라고 선언했기 때문.
 * System.out.println(str)을 하게 되면 상자 안에 있는 '문장'을 가져와서 출력.
 */