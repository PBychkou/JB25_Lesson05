public class Task_15_7_Book {
    private String title;
    private String author;
    private int yearPublished;

    public Task_15_7_Book(String _title, String _author, int _yearPublished) {
        title = _title;
        author = _author;
        yearPublished = _yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
}