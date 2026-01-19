// Write a Java program to detect double and triple spaces in a string.
class Main83 { // DetectSpaces.
    public static void main(String[] args) {
        String str = "This  String   has Double and Triple Spaces";
        System.out.println("Index of Double Space : " + str.indexOf("  "));
        System.out.println("Index of Triple Space : " + str.indexOf("   "));
    }
}