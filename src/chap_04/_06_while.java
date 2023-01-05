package chap_04;

public class _06_while {
    public static void main(String[] args) {
        //반복문 while
        int distance = 25; //전체 거리 25m
        int move = 0; // 전체 이동거리
        while(move < distance) {
            System.out.println("발차기를 계속한다");
            System.out.println("현재 이동 거리 : " + move);
            move+=3; //3미터 이동
        }
        System.out.println("도착했다");
    }
}
