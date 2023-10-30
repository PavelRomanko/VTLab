package com.company.Task15;
public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private static int edition;
    private String isbn;

    public Book(String title, String author, int price, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return price == book.price && title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + price;
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }


    public String GetTitle() {
        return title;
    }

    public String GetAuthor() {
        return author;
    }

    public int GetPrice() {
        return price;
    }

    @Override
    public int compareTo(Book other) {
        return this.isbn.compareTo(other.isbn);
    }
}