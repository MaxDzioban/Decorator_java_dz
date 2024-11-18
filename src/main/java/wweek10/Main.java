package wweek10;

public class Main {
    public static void main(String[] args) {
        SmartDocument sd = new SmartDocument("/Users/max/Downloads/15.jpg");
        System.out.println(sd.parse());
    }
}