// Write a Java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.
class Main76 { // EncryptDecryptGrade.
    public static void main(String[] args) {
        char grade = 'B';
        // Encrypt.
        char encrypted = (char) (grade + 8);
        System.out.println("Encrypted Grade : " + encrypted);
        // Decrypt.
        char decrypted = (char) (encrypted - 8);
        System.out.println("Decrypted Grade : " + decrypted);
    }
}