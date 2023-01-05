package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        int distance = 25;
        int move = 0;
        int height =2;
        while(move + height < distance){
            System.out.println("발차기계속함");
            System.out.println("현재 이동거리 : " + move);
            move += 3;
        }
        System.out.println("도착했다");


        // Do while 반복
        do{
            System.out.println("발차기 계속함");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        } while(move + height < distance);
    }
}
