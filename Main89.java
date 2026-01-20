/* Write a program to find out the type of website from the URL.
 .com --> Commercial website.
 .org --> Organizational website.
 .in  --> Indian website.
*/

import java.util.Scanner;

class Main89 { // WebsiteType.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Website URL : ");
        String site = sc.nextLine();
        if (site.endsWith(".com")) {
            System.out.println("Commercial Website");
        } else if (site.endsWith(".org")) {
            System.out.println("Organizational Website");
        } else if (site.endsWith(".in")) {
            System.out.println("Indian Website");
        } else {
            System.out.println("Unknown Website Type");
        }
        sc.close();
    }
}