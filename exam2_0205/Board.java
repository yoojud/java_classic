package exam2_0205;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Board implements Iterable<Article> {
    private int no;
    private String title;
    private List<Article> list;

    public Board(int no, String title) {
        this.no = no;
        this.title = title;
        this.list = new ArrayList<>();
    }

    public int getNo() {
        return this.no;
    }

    public String getTitle() {
        return this.title;
    }

    public void write(Article article) {
        this.list.add(article);
    }

    public void sort() {
        Collections.sort(this.list);
    }

    public void sort(Comparator<Article> comparator) {
        Collections.sort(this.list, comparator);
    }

    public Article search(int no) {
        this.sort((s1, s2) -> s1.getTitle().compareTo(s2.getTitle()));

        int index = Collections.binarySearch(this.list, new Article(3, "", ""));
        return this.list.get(index);
    }

    @Override
    public Iterator<Article> iterator() {
        return this.list.iterator();
    }
}