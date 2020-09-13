public class Book {
    String author;
    String name;
    int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
class Test{
    public static void main(String[] args) {
        Book one=new Book();
        one.setAuthor("Автор");
        one.setName("книга");
        one.setYear(10);
        System.out.println( one.toString());
    }
}