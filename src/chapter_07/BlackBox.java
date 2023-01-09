package chapter_07;

public class BlackBox {
    String modelName; //인스턴스 변수
    String resolution;
    int price;
    String color;
    int serialNumber;

    static int counter = 0;//시리얼넘버 생성해주는 역할

    static boolean canAutoReport = false; //자동 신고 기능

    BlackBox() {
//        System.out.println("기본 생성자 호출");
//        this.serialNumber = ++counter;
//        System.out.println("새로운 시리어넘버를 발급받음 :" + this.serialNumber);
    }

    BlackBox(String modelName, String resolution, int price, String color) {
//        this(); //기본생성자 호출
//
//        System.out.println("사용자 정의 생성자 호출");
//        this.modelName = modelName;
//        this.resolution = resolution;
//        this.price = price;
//        this.color = color;

    }


    void autoReport() {
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고함");
        } else {
            System.out.println("자동 신고 기능이 지원되지 않음");
        }
    }

    void insertMemoryCard(int capacity) {
        System.out.println("메모리카드 삽입됨");
        System.out.println("용량은" + capacity + "GB입니다");
    }

    int getVideoFileCount(int type) {
        if (type == 1) {
            return 9;
        } else if (type == 2) {
            return 1;
        } else return 10;
    }


    void record(boolean showDataTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다.");
        if (showDataTime) {
            System.out.println("영상에 날짜정보가 표시됩니다");

        }
        if (showSpeed) {
            System.out.println("영상에 속도정보가 표시됩니다");
        }
        System.out.println("영상은 속도 정보가 표시됩니다");
    }

    void record() {
        record(true, true, 5);
    }

    static void callServiceCenter() {
        System.out.println("서비스 센터 1588-0000 로 연결합니다");
        canAutoReport = false;
        // modelName = "test"; 사용불가
    }

    void appendModelName(String modelName) {
        this.modelName += modelName; //앞에 modelname은 인스턴스변수 뒤에는 그냥 파라미터 modelname
    }


    //Getter & Setter
    String getModelName(){
        return modelName;
    }

    void setModelName(String modelName){
        this.modelName=modelName;
    }

    String getResolution(){
        if(resolution == null || resolution.isEmpty()){
            System.out.println("판매자에게 문의하세요");
        }
        return resolution;
    }

    void setResolution(String resolution){
        this.resolution=resolution;
    }

    int getPrice(){
        return price;
    }

    void setPrice(int price){
        if(price < 10000){
            this.price = 10000;
        }
        else {
            this.price = price;
        }
    }


    String getColor() {
        return color;
    }

    void setColor(String color)
    {
        this.color = color;
    }
}

