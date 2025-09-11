class Main30 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Object Language");
        System.out.println("Original String : " + str);
        // Obtaining String Length.
        System.out.println("Length of String : " + str.length());
        // Accessing Character In A String.
        for (int i = 0; i < str.length(); i++) {
            int p = i + 1;
            System.out.println("Character at position " + p + " is " + str.charAt(i));
        }
        // Inserting A String In The Middle.
        String aString = new String(str.toString());
        int pos = aString.indexOf("Language");
        str.insert(pos, "Oriented ");
        System.out.println("Modified string : " + str);
        // Modifying Characters.
        str.setCharAt(6, '-');
        System.out.println("String now : " + str);
        // Appending A String At The End.
        str.append(" improves security.");
        System.out.println("Appended string : " + str);
    }
}