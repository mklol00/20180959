package study_03;

import java.util.Scanner;

public class _01_Practice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("[구구단] 몇 단을 출력하실건가요?");

        int input = scanner.nextInt();

        while (input <= 9 && input >= 1) {

            for (int j = 1; j < 10; j++) {
                if (input > 9 || input < 1) {
                    System.out.println("1단에서 9단까지만 출력이 가능합니다.");
                    System.out.println(input + "*" + j + "=" + (input * j));
                    break;
                }
                break;
            }


        }
    }
}
