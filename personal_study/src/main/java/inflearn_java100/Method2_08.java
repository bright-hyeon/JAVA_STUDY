//자바 기초 공부 - 인프런 자바 100제_메서드(22.03.29)
package inflearn_java100;

public class Method2_08 {
    /* static으로 선언을 하면 인스턴스나 객체 생성없이 클래스명.메서드명()으로 실행가능,
    메인 메서드는 static 메서드만 호출할 수 있음. 객체생성 후 메서드를 호출해야함
     */

    public void helloWorld(){
        System.out.println("Hello, World~");
    }

    public static void main(String[] args) {
        //객체 생성 후 메서드 호출
        Method2_08 object = new Method2_08();
        object.helloWorld();
    }


}
