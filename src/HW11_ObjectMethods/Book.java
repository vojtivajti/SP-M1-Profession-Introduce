package HW11_ObjectMethods;

public class Book {
    private String bookName;
    private Author bookAuthor;
    private int yearOfPublication;

    public Book(String bookName, Author bookAuthor, int yearOfPublication) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.yearOfPublication = yearOfPublication;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getBookAuthor(){
        return this.bookAuthor;
    }

    public int getYearOfPublication(){
        return this.yearOfPublication;
    }

    public void setBookName(String bookName){
        this.bookName = bookName;
    }

    public void setBookAuthor(String Name, String Surname) {
        this.bookAuthor.setAuthorSurname(Name);
        this.bookAuthor.setAuthorSurname(Surname);
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String toString() {
        return "Книга: " + this.getBookName() +
               ". Автор: " + this.bookAuthor.toString() +
               ". Год публикации: " + this.yearOfPublication;
    }

    public boolean equals(Book book) {
        return this.bookName.equals(book.getBookName()) &&
               this.bookAuthor.equals(book.bookAuthor) &&
               this.yearOfPublication == book.getYearOfPublication();
    }

    public int hashCode() {
        return java.util.Objects.hash(bookName, this.bookAuthor.hashCode(), this.yearOfPublication);
    }

}
