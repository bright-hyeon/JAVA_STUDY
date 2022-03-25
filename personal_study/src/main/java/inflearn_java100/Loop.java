//자바 기초 공부 - 인프런 자바 100제_반복문(22.03.25)
package inflearn_java100;

//자바의 반복문 -> 4가지(for, while, do~while, 향상된 for문)
public class Loop {
    public static void main(String[] args) {
        //for문 for(변수 초기식; 조건식; 증감식;)
        for(int i=0;i<10;i++) {
            System.out.print(i);
        }
        System.out.println(" ");
        //알파벳 출력
        for (int a=65; a<91; a++){
            System.out.print((char) a);
        }
        System.out.println(" ");
        //while을 활용한 홀짝 구하기
        int number = 1;
        while (number <=30){
            if( number % 2 ==0)
                System.out.println(number + " ");
            number ++;
        }
    }
}
