//자바 기초 공부 - 인프런 자바 100제_데이터 타입(22.03.24)
package inflearn_study;


public class Datatype {
public static void main(String[] args) {
        //byte, short, int, long, char
        //BYTES 메소드는 바이트 크기를 계산해줌
        System.out.println(Byte.BYTES);
        System.out.println(Short.BYTES);
        System.out.println(Integer.BYTES);
        System.out.println(Long.BYTES);
        System.out.println(Character.BYTES);

        //SIZE 메소드는 비트 크기를 계산해줌
        System.out.println(Byte.SIZE);
        System.out.println(Short.SIZE);
        System.out.println(Integer.SIZE);
        System.out.println(Long.SIZE);
        System.out.println(Character.SIZE);

        //character 타입은 음수가 없음. 문자형은 ' '로 정의
        System.out.println("char \t: " + Character.BYTES + "(바이트)"+"--> "+Character.SIZE +"(비트)\t"+(int)Character.MIN_VALUE + "~"+(int)Character.MAX_VALUE);

        //잘못 선언된 것. int x,y,z=500; z=500만 선언됨. x와 y는 값을 갖지 않음 / x=y=z=500으로 적어야함
        int x,y,z;
        x=y=z=100;
        System.out.println(x+"-"+y+"-"+z);

        //long타입과 float타입은 선언시 뒤에 L/F를 붙여줘야함
        long l = 3444444444444L;
        float f = 2.4234234F;
        System.out.println(l+" & "+f);

        //데이터 타입변환 - 아스키코드 80에 해당하는 문자 P가 출력
        int b= 21;
        System.out.println((char)b);

        //printf() 출력 --> 지시자를 사용
        //%d(정수), %f(소수점 형식) , %s(문자열) , %b(부울), %n(줄바꿈)
        System.out.printf("나는 %d살 대학생입니다.\n",b);

        //자릿수 확인
        String str = "123";
        System.out.println(str.length());

        //정수-> 문자열로 변환
        int p = 12345;
        String stra = String.valueOf(p);
        System.out.println(stra.length());


        }
        }
