package wweek10;

public class TestSmartDocument {
    public static void main(String[] args) {
        SmartDocument smartDocument = new SmartDocument("/Users/max/Downloads/37.jpeg");
        try {
            String result = smartDocument.parse();
            System.out.println("Parsed content: " + result);
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
