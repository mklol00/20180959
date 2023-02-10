package study_03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class _02_Practice {
    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(10);
        numbers.add(9);
        numbers.add(4);

        numbers.remove(1);
        System.out.println("두번째 값 : " + numbers.get(1));

        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("내림차순으로 정렬 : " + numbers);

        for (int i : numbers) {
            System.out.println("numbers 의 값 : " + i);
        }

        boolean exist = numbers.contains(11);
        System.out.println(exist);

    }
}
