package chap_04;

public class _05_for {
    public static void main(String[] args) {
        // 반복문 for
        for (int i = 0; i < 10;i++)
        {
            System.out.println(i);
        }
        // 짝수만출력 (fori만 입력후 enter)
        for (int i = 0; i < 10; i+=2) {
            System.out.println(i);
        }
        //홀수만 출력
        for (int i = 1; i <10 ; i+=2) {
            System.out.println(i);
        }
        //거꾸로 출력
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
        //1부터 10까지의 합
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);

        //
    }
}
