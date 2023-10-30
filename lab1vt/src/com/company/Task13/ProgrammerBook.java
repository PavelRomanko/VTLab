package com.company.Task13;

import com.company.Task12.Book;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, String language, int level) {
        super(title, author, price);
        this.language = language;
        this.level = level;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof ProgrammerBook that)) return false;
        if (!super.equals(obj)) return false;
        return level == that.level && language.equals(that.language);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + level;
        return result;
    }

    @Override
    public String toString() {
        return "ProgrammerBook{" +
                "title='" + GetTitle() + '\'' +
                ", author='" + GetAuthor() + '\'' +
                ", price=" + GetPrice() +
                ", language='" + language + '\'' +
                ", level=" + level +
                '}';
    }
}
