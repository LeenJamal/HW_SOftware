package softwareHW;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class Test {
	 static ShoppingCart  SC;

	@BeforeClass

	public static void setUpBeforeClass() throws Exception {
		 SC		  = new ShoppingCart();
				
	}

/*	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
*/
	@org.junit.Test
	public void test1() {
		//fail("Not yet implemented");
		 int act = SC.getCount();
		
		int s= 0;
		assertTrue( act==s);
		
		
	}

	
	@org.junit.Test

	
	public void test2()
	{
		Book BBB= new Book(127 ,"Java Book");
		
		SC.AddBook(BBB);
		
		int act = SC.getCount();
		int s =1 ;
		int price= SC.getPrice();
		int p = 127;
		assertTrue((act ==1 )&&(price==p));
		
		
	}
	@org.junit.Test
	public void test3()
	{

		
		Book book = new Book(100,"Web design Book");
		SC.AddBook(book);

		int act = SC.getCount();
		int price= SC.getPrice();
		int p = 227;
		assertTrue((price ==p)&&(act==2));
		
		
		
	}
	
	
	
	
	
	
}
