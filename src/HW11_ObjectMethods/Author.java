package HW11_ObjectMethods;

public class Author {
    private String Name;
    private String Surname;

    public Author(String Name, String Surname) {
        this.Name = Name;
        this.Surname = Surname;
    }

    public String getAuthorName() {
        return this.Name;
    }

    public String getAuthorSurname() {
        return this.Surname;
    }

    public void setAuthorName(String Name) {
        this.Name = Name;
    }

    public void setAuthorSurname(String Surname) {
        this.Surname = Surname;
    }

    public String toString() {
        return "Автор: " + getAuthorName() + " " + getAuthorSurname();
    }

    public boolean equals(Author author) {
        return this.Name.equals(author.getAuthorName()) && this.Surname.equals(author.getAuthorSurname());
    }

    public int hashCode() {
        return java.util.Objects.hash(this.Name, this.Surname);
    }


}
