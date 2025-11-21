package se.yrgo.library;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import se.yrgo.library.models.Book;

class BookTest {

	//G
	@Test
	public void test2EqualBooks() {
		Book book1 = new Book(1, "Hejsan Java", "", "", "", 0);
		Book book2 = book1;
		assertEquals(book1, book2, "Books should be equal");
	}

	//G
	@Test
	public void test2NonEqualBooks() {
		Book book1 = new Book(1, "Hejsan Java", "", "", "", 0);
		Book book2 = new Book(2, "Hejsan Git", "", "", "", 100);
		assertNotEquals(book1, book2, "Books should not be equal");
	}

}
