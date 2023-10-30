package com.company.Task14;
import org.junit.Assert;
import org.junit.Test;
public class BookTest {

    @Test
    public void TestClone() {
        Book book1 = new Book("Title", "Author", 100);
        Book book2 = book1.clone();

        Assert.assertNotSame(book1, book2);

        Assert.assertEquals(book1.GetTitle(), book2.GetTitle());
        Assert.assertEquals(book1.GetAuthor(), book2.GetAuthor());
        Assert.assertEquals(book1.GetPrice(), book2.GetPrice());

        book1.SetTitle("New Title");
        book1.SetAuthor("New Author");
        book1.SetPrice(200);

        Assert.assertNotEquals(book1.GetTitle(), book2.GetTitle());
        Assert.assertNotEquals(book1.GetAuthor(), book2.GetAuthor());
        Assert.assertNotEquals(book1.GetPrice(), book2.GetPrice());
    }
}
