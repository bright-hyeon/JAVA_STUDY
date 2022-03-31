//자바 기초 공부 - 인프런 자바 100제_속성, 클래스, 동작 (22.03.31)
// 클래스란 무엇? 객체 (또는 인스턴스)를 생성하는 하나의 공장(틀, 템플릿, 프레임)이다.
// 클래스는 만들고자하는 객체의 특징과 동작에 많은 시간을 들이고 집중하면서 설계를 하게됨.
// 객체의 특징 -> 속성(attribute), 객체의 동작 -> 메서드(method) : 함수와 거의 동일
package inflearn_java100;

class FarmMachine{
    //속성
    int price;
    int year;
    String color;

    //동작/기능/행동(method) -> 농기계마다 동작이 다양할 것이므로 처음에는 공통적 동작을 생각.
    void move(){
        System.out.println("Farm-machine is moving");
    }
    void dig() {
        System.out.println("Farm-machine is digging");
    }
    void grind(){
        System.out.println("Farm-machine is grinding");
    }
}

public class OOP {
    public static void main(String[] args) {
        FarmMachine fm = new FarmMachine(); //new : 객체 생성, 주소값 반환까지 함.
        System.out.println(fm);

        //객체에 속성 값 입력
        fm.price = 1000000;
        fm.year = 2020;
        fm.color = "red";

        //속성 값 출력하기
        System.out.println(fm.price);
        System.out.println(fm.year);
        System.out.println(fm.color);

        fm.move();
        fm.dig();
        fm.grind();


    }

}
