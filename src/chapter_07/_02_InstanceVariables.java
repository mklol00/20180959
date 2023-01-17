package chapter_07;

public class _02_InstanceVariables {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "블랙";

        System.out.println(b1.color);
        System.out.println(b1.resolution);

        System.out.println("------------");

        //새로운 신제품
        BlackBox b2 =new BlackBox();
        b2.modelName = "하양이";
        b2.resolution = "UHD";
        b2.price = 102223;

        System.out.println(b2.resolution);


    }
}
