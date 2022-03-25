//자바 기초 공부 - 인프런 자바 100제_조건문(22.03.25)

package inflearn_java100;
//배열을 이용하면 일일이 변수를 선언할 필요 없이 한방에 선언되고, 초기화 값도 한방에 세팅
//자바에서 배열은 "동일한 데이터 타입"의 값들을 하나의 배열명으로 저장시킬 수 있는 아주 편리한 자료구조

public class Array {
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
        System.out.println(scores[s_size-1]);
        System.out.println("------------------");

        //배열 요소에 데이터 값 넣는 법
        int[] sales_table1 = new int[5];
        sales_table1[0]=3;
        sales_table1[1]=11;
        sales_table1[2]=22;
        sales_table1[3]=33;
        sales_table1[4]=44;

        //값 출력하기
        System.out.println(sales_table1[0]);
        System.out.println("------------------");

        //1.배열 선언과 동시에 특정 값으로 초기화
        int [] sales = {55,66,77,88,99};
        System.out.println(sales[1]);

        //2.다른 방법
        int [] sales2 = new int[] {22,33,44,55,66};
        System.out.println(sales2[2]);

        //3.배열변수 선언과 초기화를 따로 하고 싶은 경우
        int [] sales3;
        sales3 = new int[] {23,123,123,2,3};
        System.out.println(sales3[4]);
        System.out.println("------------------");

        //배열요소 값을 반복문 for를 사용하여 출력
        System.out.println("for문을 활용한 배열요소출력");
        int [] array2 = {1,2,3,4,5,6,7};
        for (int i=0;i<array2.length;i++){
            System.out.println(array2[i]);

        }



    }

}
