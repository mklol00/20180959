package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        //Continue

        //치킨 주문 손님중에 노쇼 손님이 있다고 가정
        //For

        int max = 20; //최대 치킨 판매 수량
        int sold = 0; //현재 치킨 판매 수량
        int noShow = 17; //대기번호 17번 손님이 노쇼
        for(int i=1;i<=50;i++) {
            System.out.println(i + "번 손님 치킨나옴");
            
            //손님이 없다면?
            if(i == noShow){
                System.out.println(i + "번 노쇼로 인해 다음으로 넘어감");
                continue;
            }
            sold++;
            if(sold == max){
                System.out.println("다팔림");
                break;
            }
        }
        System.out.println("영업종료");
    }
}
