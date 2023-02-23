public class Practice5_1 {
    public static void swap(int x, int y) {
            int temp = x;
            x = y;
            y = temp;
        }


    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("스왑호출전에는 : a =" + a + ",b= " + b);
        swap(a,b);
        System.out.println("swap() 호출 후 : a = " + a + ", b = " + b);
    }
}

