package study_02;

import java.util.Scanner;

public class Mission {
    public static int maximum3(int num1, int num2, int num3) {
        int maximum = num1;

        if (num2 >= maximum) {
            maximum = num2;
        }
        if (num3 >= maximum) {
            maximum = num3;
        }


        return maximum;
    }

    public static int minimum3(int num1, int num2, int num3) {
        int minimum = num1;

        if (num2 <= minimum) {
            minimum = num2;
        }
        if (num3 <= minimum) {
            minimum = num3;
        }


        return minimum;
    }

    public static void main(String[] args) {
        int season;
        int htmlScore;
        int cssScore;
        int javascriptScore;
        double average;

        Scanner scanner = new Scanner(System.in);

        System.out.println("몇 기인지 입력해주세요.");
        season = scanner.nextInt();

        System.out.println("HTML 과목 점수를 입력해주세요.");
        htmlScore = scanner.nextInt();

        System.out.println("CSS 과목 점수를 입력해주세요.");
        cssScore = scanner.nextInt();

        System.out.println("Javascript 과목 점수를 입력해주세요.");
        javascriptScore = scanner.nextInt();

        average = ((double)(htmlScore + cssScore + javascriptScore) / 3);

        if (season == 1 || season == 2 && average >= 60) {
            System.out.println("합격입니다");
            System.out.println("전체 과목 중 최고점은" + maximum3(htmlScore, cssScore, javascriptScore) + "점입니다.");
            System.out.println("전체 과목 중 최저점은" + minimum3(htmlScore, cssScore, javascriptScore) + "점입니다.");
            System.out.println("전체 과목의 평균은" + average + "점입니다.");
        } else if (season == 3 && average >= 70) {
            System.out.println("합격입니다");
            System.out.println("전체 과목 중 최고점은" + maximum3(htmlScore, cssScore, javascriptScore) + "점입니다.");
            System.out.println("전체 과목 중 최저점은" + minimum3(htmlScore, cssScore, javascriptScore) + "점입니다.");
            System.out.println("전체 과목의 평균은" + average + "점입니다.");
        }
        else if(((htmlScore>=100) && (cssScore>=100))||((cssScore>=100) && (javascriptScore>=100))){
            System.out.println("합격입니다");
            System.out.println("전체 과목 중 최고점은" + maximum3(htmlScore, cssScore, javascriptScore) + "점입니다.");
            System.out.println("전체 과목 중 최저점은" + minimum3(htmlScore, cssScore, javascriptScore) + "점입니다.");
            System.out.println("전체 과목의 평균은" + average + "점입니다.");
        }
        else {
            System.out.println("불합격입니다");
            System.out.println("전체 과목 중 최고점은" + maximum3(htmlScore, cssScore, javascriptScore) + "점입니다.");
            System.out.println("전체 과목 중 최저점은" + minimum3(htmlScore, cssScore, javascriptScore) + "점입니다.");
            System.out.println("전체 과목의 평균은" + average + "점입니다.");
        }


    }

}


