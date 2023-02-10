package study_03;

import java.util.ArrayList;
import java.util.Scanner;

public class _01_Mission {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();

        System.out.println("학생의 이름을 입력하고 엔터를 누르세요. (한글로만 입력해야 합니다.)");
        System.out.println("학생들을 다 입력했다면, print라고 입력해주세요.");

        String name = scanner.next();
        list.add(name);


        if (name != "print") {
            System.out.println("학생 명단(가나다순)");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list);
                break;
            }

        }


    }
}

