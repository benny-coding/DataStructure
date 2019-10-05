package inflearnJava;

public class Main {
    public static void main(String[] args) {
        Grandeur myCar1 = new Grandeur();

        myCar1.color = "red";
        myCar1.gear = "auto";
        myCar1.price = 25000000;

        myCar1.run();
        myCar1.stop();
        myCar1.info();

        System.out.println();


        // # 자전거 출력
        Bicycle bike1 = new Bicycle("Yello",300000);

        bike1.info();

    }
}
