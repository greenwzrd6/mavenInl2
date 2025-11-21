package se.yrgo.library;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import se.yrgo.library.models.Book;
import se.yrgo.library.models.Customer;
import se.yrgo.library.models.Loan;
import se.yrgo.library.utilities.GenderType;

import java.time.LocalDate;

public class LoanTest
{

	private Customer apa;
	private Loan loan;
	private Book book1;
	private LocalDate dueDate;

	public LoanTest()
	{
		book1 = new Book(34, "ApBoken", "Apan", "123123123", "", 567);
		apa = new Customer("VD", "Apa", "Mannen", "Apgata 1, 44444, Apstad",
		                   "+4607070707", "apadress@apa.ap", 123,
		                   GenderType.UNKNOWN);
		loan = new Loan(1, apa, book1);
		dueDate = LocalDate.now().plusDays(14);
	}

	//VG
	@Test
	public void testDueDate()
	{
		assertEquals(dueDate, loan.getDueDate());
	}
}