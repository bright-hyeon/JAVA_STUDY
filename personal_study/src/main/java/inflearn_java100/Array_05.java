//자바 기초 공부 - 인프런 자바 100제_배열(22.03.28).

package inflearn_java100;
//배열을 이용하면 일일이 변수를 선언할 필요 없이 한방에 선언되고, 초기화 값도 한방에 세팅
//자바에서 배열은 "동일한 데이터 타입"의 값들을 하나의 배열명으로 저장시킬 수 있는 아주 편리한 자료구조

import java.util.Arrays;

public class Array_05 {
    public static void main(String[] args) {
        //배열의 선언
        //데이터 타입[] 배열명 = new 데이터 타입[배열크기];
        //배열 선언 -> 배열 크기 지정=> 배열 공간의 값은 자동으로 초기화 세팅 됨.
        //데이터를 넣지 않으면 int의 경우 (정수형 : 0 , 실수형 : 0.0) 으로 출력

        int[] sales_table = new int[4];
        double[] sales_table2 = new double[100];

        System.out.println(sales_table[0]);
        System.out.println(sales_table2[2]);
        System.out.println("------------------");

        //배열 변수는 참조형 타입으로써 해당 메모리 공간을 가리키게 됨 -> 즉, 해당 메모리 공간의 주소값을 가진다.
        //공간이 10개 만들어지면 동시에 자동적으로 해당 공간에 접근할 수 있는 인덱스 번호가 자동 부여됨. (인덱스는 0부터 시작)
        //마지막 인덱스는 "배열크기-1"
        int[] scores = new int[10];
        int s_size = scores.length;
        System.out.println(scores[0]);
        System.out.println(scores[9]);
        System.out.println(scores[s_size - 1]);
        System.out.println("------------------");

        //배열 요소에 데이터 값 넣는 법
        int[] sales_table1 = new int[5];
        sales_table1[0] = 3;
        sales_table1[1] = 11;
        sales_table1[2] = 22;
        sales_table1[3] = 33;
        sales_table1[4] = 44;

        //값 출력하기
        System.out.println(sales_table1[0]);
        System.out.println("------------------");

        //1.배열 선언과 동시에 특정 값으로 초기화
        int[] sales = {55, 66, 77, 88, 99};
        System.out.println(sales[1]);

        //2.다른 방법
        int[] sales2 = new int[]{22, 33, 44, 55, 66};
        System.out.println(sales2[2]);

        //3.배열변수 선언과 초기화를 따로 하고 싶은 경우
        int[] sales3;
        sales3 = new int[]{23, 123, 123, 2, 3};
        System.out.println(sales3[4]);
        System.out.println("------------------");

        //배열요소 값을 반복문 for를 사용하여 출력
        System.out.println("---for문을 활용한 배열요소출력---");
        int[] array2 = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]);
        }
        System.out.println();

        //배열명 자체를 찍어서 출력 --> 주소 (참조)값
        System.out.print("배열명 자체출력 결과 : ");
        System.out.println(array2);

        //반복문이 아닌 메서드로 배열의 요소 값들을 출력 ( Arrays 클래스의 toString()메서드 )
        //toString() 인자는 배열명, java.util.Arrays 임포트 선언이 되어져 있어야함. (세미콜론!찍기;)

        int[] ar = {238, 483, 239, 442, 487, 239, 873};
        System.out.print("메서드로 배열 출력 : ");
        System.out.println(Arrays.toString(ar)); //[]괄호 형태로 배열표시를 보여주며 출력됨

        //배열 복사하기. arraycopy()메서드 사용. System.arraycopy(원본배열명,???,복사배열명,???, 길이)
        int[] ar1 = {1, 2, 3, 4, 5};
        int[] ar2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.arraycopy(ar1, 2, ar2, 4, 3);
        System.out.print("배열 복사하기 : ");
        System.out.println((Arrays.toString(ar2)));

        //String 배열
        //[1] String 1차원 배열 -> 3개의 문자열을 담을 수 있는 배열 생성하기
        // string 타입의 참조 변수 3개를 저장하기 위한 공간 생성 -> 이떄 참조형 변수 각 요소는 기본값 --> null로 초기화.
        String[] province = new String[3];

        //[2] String 배열 초기화 -> 직접 입력
        province[0] = "강원도";
        province[1] = "전라도";
        province[2] = "경기도";

        //[3]향상된 for문으로 배열 요소 출력
        System.out.print("for문으로 배열요소 출력 : ");
        for (String aaa : province)
            System.out.print(aaa + " ");
        System.out.println();
        // string 2차원 배열만들기(2x3)
        String[][] asia_nations = {
                {"한국", "중국", "일본"},
                {"태국", "베트남", "필리핀"}
        };

        System.out.println("String 2차원 배열 : " + asia_nations[0][2]); //실제 요소값 출력
        System.out.println("0행은 몇개의 열로 구성되었는가? : " + asia_nations[0].length);

        //반복문을 사용한 String 2차원 배열 값 출력
        System.out.println("---반복문을 사용한 String 2차원 배열 값 출력---");
        for (int i = 0; i < asia_nations.length; i++) {
            for (int j = 0; j < asia_nations[i].length; j++)
                System.out.print(asia_nations[i][j] + " ");
            System.out.println();
        }

        //charAt()메서드 사용 -> 해당 인덱스에 있는 값을 반환 -> 단어를 char 배열에 한글자씩 저장 가능
        String[] strAr = {"hong","kim","park"};


        //반복문에서 charAt()메서드 사용
        System.out.println("---반복문활용 charAt()사용---");
        for(int i=0; i<strAr.length;i++) {
            for (int j = 0; j<strAr[i].length();j++)
                System.out.print(strAr[i].charAt(j));
            System.out.println();
        }

        //length : 배열의 길이를 구해주는 것 vs length() : 문자열의 길이를 구해주는 것
        System.out.println("---length와 length() 의 차이---");
        int [] aaa = new int [10];
        System.out.println(aaa.length);

        String bbb = "welcome to seoul";
        System.out.println(bbb.length());


    }
}
