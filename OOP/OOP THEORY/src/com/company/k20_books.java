package com.company;

import java.util.Scanner;

class Books
{
    Scanner sc = new Scanner(System.in);
    public String genre;
    public void bookGenre()
    {
        System.out.println("enter the book genre");
        genre = sc.nextLine();
    }
}
class comedy_genre extends Books
{
    private String bookTitle;
    private String book_author;
        comedy_genre()
        {

        }
}
public class k20_books {
}
