package chap_04;

public class _01_if {
    public static void main(String[] args) {
        int hour = 15;
        if (hour < 14) {
            System.out.println("아아 +1");
        }
        System.out.println("샷추가");
        System.out.println("커피주문완료");

        hour =10;
        boolean morningCoffee = true;
        if (hour <14 && morningCoffee == false)
            System.out.println("아메리카노 +!");
    }
}
