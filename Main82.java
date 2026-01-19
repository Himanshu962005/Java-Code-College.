/* Write a Java program to fill in a letter template which looks like below :
Letter = "Dear <|name|>, Thanks a lot!".
Replace <|name|> with a string (some name). */
class Main82 { // LetterTemplate.
    public static void main(String[] args) {
        String letter = "Dear <|name|>, Thanks a lot!";
        String name = "Himanshu";
        letter = letter.replace("<|name|>", name);
        System.out.println(letter);
    }
}