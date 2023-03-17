/**
 * MainBook
 */
public class MainBook {

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setTitle("Pemrograman Java");
        book1.setCategory("Teknologi");
        book1.setAuthors(new String[] { "Budi" });
        book1.display();

        System.out.println();

        Book book2 = new Book();
        book2.setTitle("Das Kapital");
        book2.setCategory("Politik");
        book2.setAuthors(new String[] { "Karl Marx" });
        book2.display();

        System.out.println();

        Book book3 = new Book();
        book3.setTitle("Mahir Bermain Paloran");
        book3.setCategory("Agama");
        book3.setAuthors(new String[] { "Andi", "Budi", "Joko" });
        book3.display();

        System.out.println();

        Book book4 = new Book();
        book4.setTitle("Pemrograman Python");
        book4.setCategory("Teknologi");
        book4.setAuthors(new String[] { "Budi" });
        book4.display();

        System.out.println();

        Book book = new Book("Teknologi");
        book.display();

        System.out.println();

        System.out.printf("Kesamaan dari book1 dengan book4 adalah %d%%", book1.similarity(book4)); // 66%

    }
}