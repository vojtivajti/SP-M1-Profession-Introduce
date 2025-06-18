package HW11_ObjectMethods;

public class Main {
    public static void main(String[] args) {
        /*
        Реализуйте методы: toString, equals и hashCode в классах Author и Book, которые вы создали на прошлом уроке.
        Обратите внимание, что toString книги не должен дублировать код из toString автора,
        а должен делегировать (вызывать) его версию метода.
         */
        Author author1 = new Author("Александр", "Пушкин");
        Author author2 = new Author("Александр", "Пушкин");
        Author author3 = new Author("Лев", "Толстой");

        Book book1 = new Book("Евгений Онегин", author1, 2001);
        Book book2 = new Book("Война и мир", author2, 1999);
        Book book3 = new Book("Война и мир", author2, 2010);

        System.out.println("Проверка авторов:");
        System.out.println(author1.toString());
        System.out.println(author2.toString());
        System.out.println(author3.toString());
        System.out.println(author1.equals(author3));
        System.out.println(author1.equals(author2));
        System.out.println();

        System.out.println("Проверка книг:");
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
        System.out.println(book1.equals(book2));
        System.out.println(book2.equals(book3));
        book3.setYearOfPublication(1999);
        System.out.println(book3.toString());
        System.out.println(book2.equals(book3));





    }
}
