package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(21, "Bob", "Bob@bob.com", new Date(), 3000.00, obj);
		SellerDao sellerDao = DaoFactory.createSellerDao();//deessa forma o programa n�o conhece a implementa��o, somente a interface.
		
		System.out.println(obj);
		System.out.println(seller);
	}

}
