package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        int hour=5; //주차시간
        boolean isSmallCar = false;
        boolean withDisablePerson = false;
        
        int fee = hour * 4000; // 주차 정산 요금
        
        // 30000원 초과시 일일 최대 요금으로 수정
        if (fee > 30000){
            fee = 30000;
        }

        //경차또는 장애인 차량이 경우 50%할인
        if(isSmallCar || withDisablePerson){
            fee = fee/2;
        }

        // 실행결과
        System.out.println("주차요금은" + fee + "원입니다");

//        switch(car){
//            case 1:
//                System.out.println("일반차량입니다");
//                finalFee = parkFee * parkTime ;
//                System.out.println(finalFee);
//                if(parkFee>max){
//                    break;
//                }
//        }
    }
}
