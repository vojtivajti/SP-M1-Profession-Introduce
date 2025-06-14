package HW10_Classes;

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

}
