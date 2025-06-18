package HW11_ObjectMethods;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getAuthorName() {
        return this.name;
    }

    public String getAuthorSurname() {
        return this.surname;
    }

    public void setAuthorName(String name) {
        this.name = name;
    }

    public void setAuthorSurname(String Surname) {
        this.surname = surname;
    }

    public String toString() {
        return "Автор: " + getAuthorName() + " " + getAuthorSurname();
    }

    public boolean equals(Author author) {
        return this.name.equals(author.getAuthorName()) && this.surname.equals(author.getAuthorSurname());
    }

    public int hashCode() {
        return java.util.Objects.hash(this.name, this.surname);
    }


}
