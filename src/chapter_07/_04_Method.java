package chapter_07;

public class _04_Method {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";

        b1.autoReport();//지원안됨
        BlackBox.canAutoReport = true;
        b1.autoReport();

        b1.insertMemoryCard(5);

        //일반 영상 : 1

        //이벤트 영상 (충돌 감지) : 2

        int filecount = b1.getVideoFileCount(1);
        System.out.println("일반 영상 파일 수 : " + filecount + "개" );

        filecount = b1.getVideoFileCount(2);
        System.out.println("이벤트 영상 파일 수 : " + filecount + "개");

        filecount = b1.getVideoFileCount(3);
        System.out.println();

    }
}
