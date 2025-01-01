package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

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
		
		/*
		System.out.println("=== TEST 4: seller INSERT ===");
		Seller newsSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newsSeller);
		System.out.println("Inserted! new ID = " + newsSeller.getId());
		**/
		
		/*
		System.out.println("=== TEST 5: seller UPDATE ===");
		seller = sellerDao.findById(6);
		seller.setEmail("alexpink@gmail.com");
		sellerDao.update(seller);
		System.out.println("UPDATE completed"); **/
		
		System.out.println("=== TEST 6: seller DELETE ===");
		System.out.print("Enter Id for test DELETE: ");
		int id= sc.nextInt();
		
		sellerDao.deleteById(id);
		System.out.println("DELETE COMPLETED!");
		
		sc.close();
		
	}

}
