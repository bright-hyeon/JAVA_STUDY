//자바 기초 공부 - 인프런 자바 100제_조건문(22.03.25)
package inflearn_study;

import java.util.Scanner;

public class Conditional_03 {
    public static void main(String[] args) {
        int kor=40, eng=20, math=100;
        
        //if 조건문만 사용
        if (kor>=80){
            System.out.println("당신의 국어성적은 B학점입니다.");
            System.out.println("------------------------");
        }
        //if - else 조건문 , 실행하는 명령문이 2줄 이상일 경우 {} 사용!
        if (eng>=90) {
            System.out.println("A학점 입니다.");
            System.out.println("축하해요");
        }
        else
            System.out.println("영어가 90점 미만입니다");
        
        //if - else if - else 조건문
        int total_score;
        total_score = kor+eng+math;
        
        if (total_score>=270)
            System.out.println("당신의 토탈 점수는"+total_score+"입니다. 잘했어요");
        else if (total_score>=240)
            System.out.println("당신의 토탈 점수는"+total_score+"입니다. 노력하세요");
        else{
            if (kor<80){
                System.out.printf("당신의 국어 점수는 %d이므로 재수강이 불가합니다.\n",kor);
            }
            else
                System.out.println("재수강 가능합니다");
        }

        //switch 조건문
        Scanner scan = new Scanner(System.in);
        System.out.print("당신의 나이를 입력해주세요 : ");
        int age = scan.nextInt();

        // 사용자 입력 예외처리
        if(age>10 && age<20){
            age=10;
        }
        else if (age>20 && age<30){
            System.out.println("20이라고 다시 연령대를 입력해주세요. 프로그램을 종료합니다.");
            //System.exit(0);

        }
        else if (age>30 && age<40) {
            System.out.println("30이라고 다시 연령대를 입력해주세요. 프로그램을 종료합니다.");
            //System.exit(0);
        }
        else if (age>40 && age<50) {
            System.out.println("40이라고 다시 연령대를 입력해주세요. 프로그램을 종료합니다.");
            //System.exit(0);
        }
        else if (age>50 && age<60) {
            System.out.println("50이라고 다시 연령대를 입력해주세요. 프로그램을 종료합니다.");
            //System.exit(0);
        }
        else {
            if (age<10) {
                System.out.println("최소 10 이상만 입력해주세요. 프로그램을 종료합니다.");
                //System.exit(0);
            }
        }

        //변수 조건은 정수형이어야함. long타입은 불가 char타입은 가능.
        //break와 default(case에 해당되지 않는 나머지)를 뺴먹지 말아야함.

        switch (age){
            case 10:
                System.out.println(age+"대 입니다. 참고서 코너는 a구역입니다.");
                break;
            case 20:
                System.out.println(age+"대 입니다. 취업 서적 코너는 b구역입니다.");
                break;
            case 30:
                System.out.println(age+"대 입니다. 자기계발 코너는 c구역입니다.");
                break;
            case 40:
                System.out.println(age+"대 입니다. 재테크 코너는 d구역입니다.");
                break;
            case 50:
                System.out.println(age+"대 입니다. 재취업 코너는 e구역입니다.");
                break;
            default:
                System.out.println("60대 이상입니다. 건강관련 코너는 f구역입니다.");

        }
    //삼항 연산자
        int hour = 10;
        // 10보다 작거나 같으면 100을 곱하시오
        int test = hour<=10 ? hour*100:hour;
        System.out.println(test);

        // 12보다 작으면 오전, 크면 오후
        String str = hour<12 ? "오전":"오후";
        System.out.println(str);
    }
}
