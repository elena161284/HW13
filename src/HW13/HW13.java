package HW13;

public class HW13 {
    public static void main(String[] args) {
        Author author = new Author("Фёдор", "Достоевский");
        Book fmd1 = new Book("Идиот", author, 1870);
        System.out.println(fmd1);
        fmd1.setYear(1869);
        System.out.println("fmd1.getYear()= " + fmd1.getYear());

        Author author1 = new Author("Фёдор", "Достоевский");
        Book fmd3 = new Book("Бесы", author1, 1871);
        System.out.println(fmd3);
        fmd3.setYear(1872);
        System.out.println("fmd3.getYear()= " + fmd3.getYear());

        if (fmd1.equals(fmd3) && (author.equals(author1))) {
            System.out.println("Это разны книги");
        } else {
            System.out.println("Это один и тот же автор, но разные книги");
        }
    }
}
