package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        if (n != 0) {
            Book sc[] = new Book[n];
            for (int i = 0; i < n; i++) {
                String bookName = scanner.nextLine();
                String authorName = scanner.nextLine();
                String ISBN = scanner.nextLine();
                sc[i]=new Book(bookName,authorName,ISBN);
            }
            for (int i = 0; i <n; i++) {
                System.out.println(sc[i]);
            }
        } else {
            System.out.println("N/A");
        }
    }
}