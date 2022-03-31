//자바 기초 공부 - 인프런 자바 100제_사용자 입력 2차원배열(22.03.28).
package inflearn_java100;


import java.util.Scanner;

public class TwoArrayUserInput_06 {
    public static void main(String[] args) {

        //사용자 입력을 받아 2차원 배열을 생성하고 값을 입력하는 코드
        Scanner scan = new Scanner(System.in);
        System.out.print("행의 개수를 입력하고 enter를 치세요 = ");
        int R = scan.nextInt();
        System.out.print("열의 개수를 입력하고 enter를 치세요 = ");
        int C = scan.nextInt();

        //char 2차원 배열 선언 -> 사용자로부터 R,C입력받아 -> gameMap[R][C]생성
        char [][] gameMap = new char[R][C];

        //사용자 입력을 받아서 저장할 String 배열 선언 --> 이떄 크기를 행의 크기로 해주도록 한다.
        //어차피 사용자가 입력하는 값은 안쪽 for문을 돌면서 2차원 배열에 입력하기 때문.
        String [] strAr = new String[R];
        //2차원 배열요소 -> 사용자가 입력하는 값으로 세팅
        for (int i=0;i<R;i++){
            System.out.print((i+1)+ "번째 행에 입력할 문자 "+C+"개를 입력하고 [enter]치세요= ");
            strAr[i] = scan.next();
            for (int j=0;j<C;j++) {
                gameMap[i][j] = strAr[i].charAt(j);
            }
        }

        //2차원 배열에 들어있는 값 출력
        System.out.println(strAr);
        System.out.println(strAr[0]);
        System.out.println(strAr[1]);

        System.out.println("-----------------");
        //2차원 배열 출력
        for (int i=0;i<R;i++){
            for (int j=0;j<C;j++)
                System.out.print(gameMap[i][j]);
            System.out.println();
        }




    }
}
