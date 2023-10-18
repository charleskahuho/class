import java.util.Scanner;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		books new1 = new books();
		System.out.println("Please enter the title of the book");
		books.title = scanner.next();
		System.out.println("Plese enter the author name");
		books.Author  = scanner.next();
		System.out.println("Please enter the number of pages");
		books.numberOfPages = scanner.nextInt();
		System.out.println("the book title is:" + books.title);
		System.out.println("the book author is:"+ books.Author);
		System.out.println("the book has"+ books.numberOfPages + "Pages");

	}
