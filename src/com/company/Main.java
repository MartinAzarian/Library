package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        ArrayList<Book>library = new ArrayList<>();
        int inputdigit;
        Scanner scanner = new Scanner(System.in);
        boolean check=true;
        do{
            System.out.println("-------------MENU-------------\n" +
                    "PRESS 1 TO ADD BOOK\n" +
                    "PRESS 2 TO VIEW BOOK\n" +
                    "PRESS 3 FOR EXIT\n" +
                    "------------------------------");
            inputdigit = scanner.nextInt();
            if( inputdigit == 1 )
            {
                Book book = new Book();

                book.setName(scanner.nextLine());
                System.out.println("please enter the name");
                book.setName(scanner.nextLine());
                System.out.println("please enter author");
                book.setAuthor(scanner.nextLine());
                System.out.println("please enter genre");
                book.setGenre(scanner.nextLine());
                System.out.println("please enter number page");
                book.setNumberOfPage(scanner.nextInt());
                System.out.println("please enter year ");
                book.setYear(scanner.nextInt());

                library.add(book);
            }
            else if( inputdigit == 2 ) {
                System.out.println("Please enter book name");
                for (int i = 0; i < library.size(); i++) {
                    if (library.get(i).getName().equals(scanner.nextLine())) {
                        System.out.println(library.get(i).toString());
                    }
                }
            }
            else if ( inputdigit == 3 )
            {
                 check = false;
            }

        }
        while(check == true);
    }
}
