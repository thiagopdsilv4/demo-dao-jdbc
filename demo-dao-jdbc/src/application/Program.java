package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.DaoFactoryy;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		//Department obj = new Department(1, "Books");
		
		//SellerDao sellerDao = DaoFactory.createSellerDao();//deessa forma o programa n?o conhece a implementa??o, somente a interface.
		//Seller sellerD = sellerDao.findById(3);
		
		SellerDao sellerDao = DaoFactoryy.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
	}

}
