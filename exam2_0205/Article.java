package exam2_0205;

public class Article implements Comparable<Article> {
    private int no;
    private String title;
    private String writer;
    private int viewCount = 0;

    public Article(int no, String title, String writer) {
        this.no = no;
        this.title = title;
        this.writer = writer;
    }

    public int getNo() {
        return this.no;
    }

    public String getTitle() {
        return this.title;
    }

    public String getWriter() {
        return this.writer;
    }

    public int getViewCounter() {
        return this.viewCount;
    }

    @Override
    public int compareTo(Article article) { // 글번호로 비교
        return this.no - article.getNo();
    }

    @Override
    public String toString() {
        return this.no + ", " + this.title + ", " + this.writer + ", " + this.viewCount;
    }
}