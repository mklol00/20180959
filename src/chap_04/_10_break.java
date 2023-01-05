package chap_04;

public class _10_break {
    public static void main(String[] args) {
        // Break
        // 치킨집에서 매일 20마리만 판매 (1인당 1마리만 구매 가능)
        //손님이 50명 대기

        //For 문
        int max = 20;
        for (int i = 1; i <= 50; i++) {
            System.out.println(i +"번 손님 치킨나옴");
            if(i == max){
                System.out.println("소짐됨");
                break;
            }
        }
        System.out.println("영업 종료");

        System.out.println("mmmmmmmmmmmm");

        //while문
        int son = 1;
        while(son <= 50){
            System.out.println(son + "번 손님 치킨나옴");
            son++;
            if(son>20){
                System.out.println("안팜ㅋㅋ");
                break;
            }


        }
    }
}
