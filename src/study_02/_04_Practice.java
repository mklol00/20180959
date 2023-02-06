package study_02;

import java.util.Scanner;

public class _04_Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price;

        System.out.println("보너스 금액을 입력하세요.");
        price = scanner.nextInt();

        System.out.println("3등분된 보너스 금액은" + (double) price / 3 + "원 입니다." );



    }

}
