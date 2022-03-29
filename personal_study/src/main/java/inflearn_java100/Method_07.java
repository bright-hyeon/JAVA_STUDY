//자바 기초 공부 - 인프런 자바 100제_메서드(22.03.28)

/* static은 static을 부른다.
메서드는 다른 언어에서의 함수와 마찬가지로 어떤 특정한 동작이나 처리를 하도록 만들어진 코드 단위이다.
반복적인 작업을 처리해야하는 경우 메서드로 만들어 놓으면 이후에 필요할 때 다시 재사용할 수 있어 유용.
메서드는 호출시 어떤 결과를 반환하기도 하지만 결과를 반환하지 않는 메서드도 있음.
메서드는 호출 시 어떤 인자값들을 넘겨서 호출하는 경우도 있지만 인자값 없이 호출하는 경우도 있다.
 */
package inflearn_java100;

import java.util.Locale;

public class Method_07 {
    /* [반환값과 인자 모두 없는 경우]
    public static void showMenu(){
        //반환값이 없는경우 void 활용
        System.out.println("showMenu()메서드가 호출되었습니다.");
        //메서드는 main을 활용해 호출하지 않으면 실행되지 않음.
    }
    public static void main(String[] args) {
        showMenu();
    }
    */

    /* [반환값이 없고 인자가 있는 메소드]
    public static void plusMethod(int a,int b){
        System.out.printf("인자로 넘겨받은 2개의 값은 %d과 %d입니다.",a,b);
        int rst = a+b;
        System.out.println("두 수를 더한 값은= "+rst);
    }

    public static void main(String[] args) {
        int a=100, b=200;
        plusMethod(a,b);
    }
     */

    /*[반환값이 있고 인자가 없는 메소드]
    public static int returnMethod(){
        int ret =100;
        ret *=100 ;
        return ret;
    }
    public static void main(String[] args) {
        int rst;
        rst = returnMethod();

        System.out.println("메서드 호출에 따른 리턴된 값은 = "+ rst);
    }
     */

    //[인자, 반환값 모두 있는 경우]
    public static String capitalMethod(String str){
        String ret =str.toUpperCase();
        return ret;
    }

    public static void main(String[] args) {
        String rst;
        rst = capitalMethod("welcome to seoul");
        System.out.println("입력한 소문자의 대문자는 = " +rst);
    }



}

