package io.drewenia.primitivesAndReferences;

public class BooksTestDrive {
    public static void main(String[] args) {
        Books[] myBooks = new Books[3];

        myBooks[0] = new Books();
        myBooks[0].title = "The Grapes of java";
        myBooks[0].author = "bob";

        myBooks[1] = new Books();
        myBooks[1].title = "Thats java";
        myBooks[1].author = "sue";

        myBooks[2] = new Books();
        myBooks[2].title = "Go lang";
        myBooks[2].author = "ian";

        int x = 0;
        while (x < myBooks.length) {
            System.out.println("Book title : " + myBooks[x].title);
            System.out.println("Book author : " + myBooks[x].author);
            x += 1;
        }
    }
}
