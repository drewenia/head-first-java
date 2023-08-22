package io.drewenia.collectionsAndGenerics;

import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.TreeSet;

public class TestTree {
    public static void main(String[] args) {
        new TestTree().go();
    }

    private void go() {
        Book b1 = new Book("How cats work");
        Book b2 = new Book("Remix your body");
        Book b3 = new Book("Finding emo");

        BookComparator bookComparator = new BookComparator();
        TreeSet<Book> bookSet = new TreeSet<>(bookComparator);
        bookSet.add(b1);
        bookSet.add(b2);
        bookSet.add(b3);
        System.out.println(bookSet);
    }
}

record Book(String title) implements Comparable<Book>{
    @Override
    public int compareTo(Book o) {
        return title.compareTo(o.title);
    }
}

class BookComparator implements Comparator<Book>{
    @Override
    public int compare(Book o1, Book o2) {
        return (o1.title().compareTo(o2.title()));
    }
}
