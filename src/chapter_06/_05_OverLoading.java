package chapter_06;

public class _05_OverLoading {

    public static int getPower(int number) {
        int result = number * number;
        return result;
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;

        }

        return result;
    }


    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number * number;
    }


    public static void main(String[] args) {

        //메서드 오버로딩 : 전달값(파라미터)의 타입이 다르거나 갯수가 다르면 같은 이름의 메서드를 중복해서 쓸수있다.
        //같은 이름의 메서드를 여러 번 선언
        //1. 전달값(파라미터)의 타입이 다르거나
        //2. 전달값(파라미터)의 갯수가 다르거나
        System.out.println(getPower(3));
        System.out.println(getPower("4"));
        System.out.println(getPower(2, 6));


    }
}
