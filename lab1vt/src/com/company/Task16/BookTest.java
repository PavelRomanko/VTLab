package com.company.Task16;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookTest {

    @Test
    public void TestSortingByTitle() {
        Book book1 = new Book("Title 1", "Author 1", 100);
        Book book2 = new Book("Title 3", "Author 2", 200);
        Book book3 = new Book("Title 2", "Author 3", 150);

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        Collections.sort(books, Book.TitleComparator);

        Assert.assertEquals(book1, books.get(0));
        Assert.assertEquals(book3, books.get(1));
        Assert.assertEquals(book2, books.get(2));
    }

    @Test
    public void TestSortingByTitleAndAuthor() {
        Book book1 = new Book("Title 1", "Author 1", 100);
        Book book2 = new Book("Title 3", "Author 2", 200);
        Book book3 = new Book("Title 2", "Author 1", 150);

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        Collections.sort(books, Book.TitleAuthorComparator);

        Assert.assertEquals(book1, books.get(0));
        Assert.assertEquals(book3, books.get(1));
        Assert.assertEquals(book2, books.get(2));
    }

    @Test
    public void testSortingByAuthorAndTitle() {
        Book book1 = new Book("Title 1", "Author 2", 100);
        Book book2 = new Book("Title 3", "Author 1", 200);
        Book book3 = new Book("Title 2", "Author 1", 150);

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        Collections.sort(books, Book.AuthorTitleComparator);

        Assert.assertEquals(book3, books.get(0));
        Assert.assertEquals(book2, books.get(1));
        Assert.assertEquals(book1, books.get(2));
    }

    @Test
    public void TestSortingByAuthorTitlePrice() {
        Book book1 = new Book("Title 1", "Author 2", 100);
        Book book2 = new Book("Title 3", "Author 1", 200);
        Book book3 = new Book("Title 2", "Author 1", 150);

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        Collections.sort(books, Book.AuthorTitlePriceComparator);

        Assert.assertEquals(book3, books.get(0));
        Assert.assertEquals(book2, books.get(1));
        Assert.assertEquals(book1, books.get(2));
    }
}
