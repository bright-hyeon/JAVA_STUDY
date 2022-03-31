//자바 기초 공부 - 인프런 자바 100제_2개 정수값리턴 (22.03.31).
/*package inflearn_java100;

import java.util.Arrays;

public class TwoReturn {

    public static int[] testMethod(){
        int num1 =100;
        int num2 = 200;
        return new int[] {num1,num2};

    }
    public static void main(String[] args) {
        //메서드로부터 반환받을 값이 배열이기 때문에 배열변수를 선언해줘야함
        int result[] = testMethod();
        System.out.println(result[0]+"-"+result[1]);//값
        System.out.println(result); //주소값
        System.out.println(Arrays.toString(result));//한방에 모든 요소 출력->반복문 사용없이

    }
}
*/

//자바 기초 공부 - 인프런 자바 100제_2개 문자열반환 (22.03.31)
public class TwoReturn_11 {

    public static String [] capitalMethod(String a, String b) {
        String a_=a.toUpperCase();
        String b_ =b.toLowerCase();
        String[] ret = {a_,b_};
        return ret;

    }

    public static void main(String[] args) {
        //반환값있음 ->메서드 호출에 따른 리턴값이 있음-> 호출부에서 리턴값을 받는 변수 정의 필요
        String[] result = capitalMethod("korea","USA");
        //출력
        System.out.println(result);
        System.out.println(result[0]);
        System.out.println(result[1]);

    }
}