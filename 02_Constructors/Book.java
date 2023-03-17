/**
 * Book
 */
public class Book {

    // Attributes / Instance Variables

    private String title;
    private String category;
    private String[] authors;

    // Default Constructor
    public Book() {

    }

    // Constructor with 1 parameter
    public Book(String category) {
        this.title = "Some Title";
        this.category = category;
        this.authors = new String[] { "Andi", "Budi" };
    }

    public Book(String title, String category) {
        this.title = title;
        this.category = category;
        this.authors = new String[] { "Joko", "Pramono" };
    }

    public Book(String[] authors) {
        this.title = "Some Title";
        this.category = "Category";
        this.authors = authors;
    }

    // Setters & Getters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    // Methods

    public void display() {
        System.out.printf("Title\t\t: %s\n", this.title);
        System.out.printf("Category\t: %s\n", this.category);

        System.out.print("Author(s)\t: ");
        for (int i = 0; i < this.authors.length; i++) {
            System.out.printf("%s", this.authors[i]);
            if (i < this.authors.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
    }

    // similarity mengecek kesamaan nilai atribut 2 objek
    public int similarity(Book secondBook) {
        double similarity = 0;
        double totalAttributes = 3;

        if (this.title.equals(secondBook.getTitle())) {
            similarity++;
        }

        if (this.category.equals(secondBook.getCategory())) {
            similarity++;
        }

        if (this.authors.length == secondBook.getAuthors().length) {
            boolean equal = true;

            for (int i = 0; i < this.authors.length; i++) {
                if (!this.authors[i].equals(secondBook.getAuthors()[i])) {
                    equal = false;
                    break;
                }
            }

            if (equal) {
                similarity++;
            }
        }

        int percentage = (int) ((similarity / totalAttributes) * 100);

        return percentage;
    }
}