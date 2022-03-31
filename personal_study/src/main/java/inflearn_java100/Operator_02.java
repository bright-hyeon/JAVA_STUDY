//자바 기초 공부 - 인프런 자바 100제_연산자(22.03.24)
package inflearn_study;

public class Operator_02 {
    public static void main(String[] args) {
        int a=0, b=100;

        a=a+1;
        System.out.println(a);
        a+=1;
        System.out.println(a);

        b++; //하나 증가.
        System.out.println(b);

        //수치 소수점 연산자
        int c = 60, d=8;
        int rst1 = c/d;
        System.out.println(rst1);
        System.out.println((double)rst1); //7.0으로 출력됨. 7.5가 아님.

        //정수와 실수의 연산 -> 실수기준으로 됨
        double rst2;
        rst2 = c /(double)d;
        System.out.println(rst2);

        //관계연산자
        int kor=60, eng=40, math=30;
        boolean rstt1,rstt2, rstt3, rstt4;

        rstt1 = kor ==eng;
        rstt2 = kor != eng;
        rstt3 = kor <math;
        rstt4 = kor>= math;

        System.out.println(rstt1+"\t"+rstt2+"\t"+rstt3+"\t"+rstt4);

        // A && B : A, B가 모두 참이어야 참
        // A || B : A 또는 B가 하나라도 참이면 참
        // !A : A가 참이면 거짓, A가 거짓이면 참
        int q=10,w=20,e=30;

        boolean rst6 = q<w && e<w;
        System.out.println(rst6);
        System.out.println(!rst6);







    }
}
