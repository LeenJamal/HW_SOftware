package softwareHW;

import java.util.ArrayList;

public class ShoppingCart {
	ArrayList<Book> b;
//	int count;

	public ShoppingCart() {
		
		 b = new ArrayList<Book>();
		// count=0;
	}

	
	
	
	public void  AddBook (Book BB )
	
	{
		
		b.add(BB);
		
	
	}




	public int getCount() {
		// TODO Auto-generated method stub
		int count =0;
		for (int i=0; i<b.size(); i++)
		
		{
			if(b.get(i)!= null)
			
				count++;
			
		}
			return count;
			
		}




	public int getPrice() {
		
		int price =0;
		for (int i=0 ; i<b.size();i++)
		
		{Book BBBB= b.get(i);
		price+= BBBB.price;
			
		}
		
		
		
		return price;
	}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


