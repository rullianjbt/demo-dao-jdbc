package application;

import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDAO sellerDao = new DAOFactory().createSellerDAO();
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);

	}

}
