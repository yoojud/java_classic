package exam2_0205;

import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        Board board = new Board(1, "Movie board");

        board.write(new Article(1, "Star wars", "itsme"));
        board.write(new Article(2, "Avengers", "itsme"));
        board.write(new Article(5, "Verteran2", "it's me"));
        board.write(new Article(4, "Avatar", "non"));

        Iterator<Article> iter = board.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        board.sort();

        board.sort((s1, s2) -> s1.getTitle().compareTo(s2.getTitle()));
        System.out.println();

        for (Article a : board) {
            System.out.println(a);
        }

        System.out.println();

        // Article result = board.search(3);
        // System.out.println(result);
    }
}