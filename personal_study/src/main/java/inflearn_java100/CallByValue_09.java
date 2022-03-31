//자바 기초 공부 - 인프런 자바 100제_Call by value(22.03.28).
package inflearn_java100;

//Call by value --> 값에 의한 호출 -> 값에 의해서 (메서드를) 호출
//메서드로 인자값을 넘길 때 해당 값을 복사하여 넘기는 방식-> 따라서 sum()메서드 내부에서는 복사된 값으로 처리.

public class CallByValue_09 {
    public static void sum(int a) {
        a = a+400;
        System.out.println(a); //500
    }

    public static void main(String[] args) {
        int a =100;
        sum(a);

        System.out.println(a);//100
    }
}
