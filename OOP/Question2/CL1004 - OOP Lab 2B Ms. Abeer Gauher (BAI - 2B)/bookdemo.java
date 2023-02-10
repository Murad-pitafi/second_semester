package com.company;



class book {
    private String title;
    private String author;
   private double price;
    public book(String T, String A, double P)
    {
        title = T;
        author = A;
        price = P;
    }
    public void setTitle(String t)
    {
        title = t;
    }
    public void setAuthor(String a)
    {
        author = a;
    }
    public void setPrice(double p)
    {
        price = p;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor()
    {
        return author;
    }
    public double getPrice()
    {
        return price;
    }


}
public class bookdemo
{
    public static void main(String[] args) {
        book obj = new book("Great Expectations", "Charles Dicken", 79.75);
    }
}



