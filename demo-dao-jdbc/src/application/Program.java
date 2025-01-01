package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createrSellerDao();
		System.out.println("=== TEST 1: seller findbyId ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("=== TEST 2: seller findDepartmentbyId ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("=== TEST 3: seller findAll ===");
		list = sellerDao.findAll();
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		
		System.out.println("=== TEST 4: seller INSERT ===");
		Seller newsSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newsSeller);
		System.out.println("Inserted! new ID = " + newsSeller.getId());
	}

}
