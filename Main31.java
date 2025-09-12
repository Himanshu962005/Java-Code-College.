import java.util.*; // Importing Vector Class.

class Main31 {
    public static void main(String[] args) {
        Vector<String> list = new Vector<>();
        String[] languages = { "Ada", "BASIC", "C++", "FORTRAN", "Java" };
        for (String lang : languages) {
            list.addElement(lang);
        }
        list.insertElementAt("COBOL", 2);
        String[] listArray = new String[list.size()];
        list.copyInto(listArray);
        System.out.println("List of Languages");
        for (int i = 0; i < listArray.length; i++) {
            System.out.println(listArray[i]);
        }
    }
}