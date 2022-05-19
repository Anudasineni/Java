public class Book implements Comparable<Book> {
    private String title;
    private String writer;
    private Integer releaseDate;

    public Book(String title, String writer, Integer releaseDate) {
        this.title = title;
        this.writer = writer;
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public Integer getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Integer releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", writer='" + writer + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return -this.releaseDate.compareTo(o.releaseDate);//descending order
    }
}
