package chap_04;

import org.w3c.dom.ls.LSOutput;

public class _04_SwitchCase {
    public static void main(String[] args) {
        int ranking = 1;
        if (ranking == 9)
        System.out.println("전액");
        else if (ranking == 2)
            System.out.println("반액");
        else if (ranking == 3)
            System.out.println("반액");
        else {
            System.out.println("해당 ㄴ");
        }
        System.out.println("조회완료");
        
        ranking =1;
        switch (ranking) {
            case 1 :
                System.out.println("전장");
                break;
            case 2 :
                System.out.println("반액");
                break;
            case 3 :
                System.out.println("반액");
                break;
            default:
                System.out.println("아무것도 ㄴㄴ");
                break;
        }

        //중고상품 등급에따른 1급 최상, 4급 최하
        int grade =3;
        int price =7000;
        switch(grade){
            case 1:
                price +=1000;
            case 2:
                price +=1000;
            case 3:
                price += 1000;
                break;

        }
        System.out.println(grade+"등급"+price+"원");
    }

}

