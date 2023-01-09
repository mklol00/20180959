package chapter_07;

public class _02_InstanceVariable {
    public static void main(String[] args) {

        //처음만든 블랙박스
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "블랙";

        System.out.println(b1.color);

        // 새로운 신제품

        BlackBox b2= new BlackBox();
        b2.color = "흰색";
        b2.resolution = "UHD";
        System.out.println(b2.color);

    }
}
