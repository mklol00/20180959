package study_03;

import java.util.ArrayList;
import java.util.Scanner;

public class _02_Mission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> playerNum = new ArrayList<>();
        ArrayList<Integer> playerRecord = new ArrayList<>();

        for (; ; ) {
            System.out.println("선수의 번호를 입력하세요");
            int num = scanner.nextInt();
            playerNum.add(num);


            System.out.println("선수 리스트" + playerNum);


            System.out.println("이 선수의 100m 달리기 기록이 몇 초인지 입력하세요.");
            int record = scanner.nextInt();
            playerRecord.add(record);
            System.out.println(record);
        }


    }
}
