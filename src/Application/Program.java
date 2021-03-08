package application;

import java.util.Date;

import model.entities.Sellert;
import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		//DEPARTMENT TEST 
		Sellert obj = new Sellert(1, "Books");
		
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);
		
		SellerDAO sellerDao = new DAOFactory().createSellerDAO();
		
		System.out.println(seller);

	}

}
