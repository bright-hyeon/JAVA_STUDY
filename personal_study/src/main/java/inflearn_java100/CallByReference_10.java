//자바 기초 공부 - 인프런 자바 100제_Call by reference (22.03.31).
// Wrapper class :
package inflearn_java100;
//참조값을 값으로 바꿔주기
class TestNumber{
    int num;
    TestNumber(int num) {this.num=num;} //this : 객체를 의미
}
public class CallByReference_10 {
    /*public static void sum(double [] a){

        System.out.println("sum()메서드 안에서 a출력 --> "+ a);
    }

    public static void main(String[] args) {
        //Wrapper 클래스의 integer 클래스 타입으로 변수 a를 선언하고, new로 객체를 생성하여 해당 주소 값을 메서드로 보낸다.
        double [] a= new double[5];
        sum(a);
        System.out.println(a);

     */
    public static void sum(TestNumber a) {
        System.out.println("sum()메서드안에서의 a값-->"+a);
        System.out.println(a.num);
        a.num=a.num+400;
        System.out.println(a.num);
    }
    public static void main(String[] args) {

        //객체변수 선언
        TestNumber a = new TestNumber(100); //a는 TestNumber의 객체, 주소값만 갖고 있음.
        sum(a); //sum이라는 메서드를 주소값에 의해 호출중.
        System.out.println("------------------------");
        System.out.println(a.num);
    }

}
