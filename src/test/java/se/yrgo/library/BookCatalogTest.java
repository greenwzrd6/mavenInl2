package se.yrgo.library;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import se.yrgo.library.models.Book;
import se.yrgo.library.models.BookCatalog;
import se.yrgo.library.models.BookNotFoundException;

public class BookCatalogTest
{

	private BookCatalog bc;
	private Book book1;

	public BookCatalogTest()
	{
		bc = new BookCatalog();
		book1 = new Book(1, "Hello-Java", "", "", "", 0);
		bc.addBook(book1);
	}

	//G
	@Test
	public void testAddABook() throws BookNotFoundException
	{
		assertEquals(1, bc.getNumberOfBooks(),
		             "There should be one book in catalogue");
		assertSame(book1, bc.getBookArray()[0],
		           "Book should be in the first array box");
	}

	//G
	@Test
	public void testFindBook() throws BookNotFoundException
	{
		assertEquals(book1, bc.findBook("Hello-Java"), "Book should exist");
	}

	//G
	@Test
	public void testFindBookIgnoringCase() throws BookNotFoundException
	{
		assertEquals(book1, bc.findBook("hello-java"),
		           "Book should exist, even when searching with lowercase");
	}

	//G
	@Test
	public void testFindBookWithExtraSpaces() throws BookNotFoundException
	{
		assertEquals(book1, bc.findBook(" Hello-Java"),
		             "Book should exist, even when searching with blank spaces");
	}

	//VG
	// This test should throw BookNotFoundException in order to pass.
	@Test
	public void testFindBookThatDoesntExist()
	{
		assertThrows(BookNotFoundException.class, () -> bc.findBook("hej"),
		             "Book should not be found and throw BookNotFoundException");
	}

}
