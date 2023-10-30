package com.company.Task15;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookTest {

    @Test
    public void TestSortingByISBN() {
        Book book1 = new Book("Title 1", "Author 1", 100, "ISBN1");
        Book book2 = new Book("Title 2", "Author 2", 200, "ISBN2");
        Book book3 = new Book("Title 3", "Author 3", 150, "ISBN3");

        List<Book> books = new ArrayList<>();
        books.add(book3);
        books.add(book1);
        books.add(book2);

        Collections.sort(books);

        Assert.assertEquals(book1, books.get(0));
        Assert.assertEquals(book2, books.get(1));
        Assert.assertEquals(book3, books.get(2));
    }
}
