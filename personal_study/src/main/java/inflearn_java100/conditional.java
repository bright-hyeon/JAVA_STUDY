//자바 기초 공부 - 인프런 자바 100제_조건문(22.03.24)
package inflearn_study;

public class conditional {
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
        int age =10;
        //변수 조건은 정수형이어야함. long타입은 불가 char타입은 가능.
        //break와 default를 뺴먹지 말아야함.

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

        }
            

    }

}
