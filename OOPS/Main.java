package OOPS;

public class Main {
	public static void main(String[] args) {

        Author author = new Author(
                "Shaik Tahaseen",
                "tahaseen06@gmail.com",
                'M');

        Book book = new Book(
                "Java Programming",
                author,
                499.50,
                20);

        System.out.println("Book Name : " + book.getName());
        System.out.println("Price : " + book.getPrice());
        System.out.println("Quantity : " + book.getQtyInStock());

        System.out.println("Author Name : " + book.getAuthor().getName());
        System.out.println("Author Email : " + book.getAuthor().getEmail());
        System.out.println("Author Gender : " + book.getAuthor().getGender());
    }
}
