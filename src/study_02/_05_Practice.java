package study_02;

import java.util.Scanner;

public class _05_Practice {
    public static void main(String[] args) {

        int num;

        Scanner scanner = new Scanner(System.in);
        System.out.println("3의 배수인지 판단하고 싶은 숫자를 입력하세요.");
        num = scanner.nextInt();
        if(num % 3 == 0){
            System.out.println("3의 배수입니다.");
        }
        else {
            System.out.println("3의 배수가 아닙니다.");
        }



    }
}
