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
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("===== TEST 1: Seller findById ======");
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		
		System.out.println();
		
		System.out.println("===== TEST 2: Seller findByDepartment ======");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println();
		
		System.out.println("===== TEST 3: Seller finfAll ======");
		list = sellerDao.findAll();
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("===== TEST 4: Seller insert ======");
		
		Seller sellerInsert = new Seller(null, "Greg", "greg@gmail.com", new Date(), 3000.00, department);
		sellerDao.insert(sellerInsert);
		System.out.println("inserido, novi Id " + sellerInsert.getId());
		
		System.out.println();
		
		System.out.println("===== TEST 5: Seller insert ======");
		seller = sellerDao.findById(1);
		seller.setName("Lázaro Nóbrega Fonseca");
		sellerDao.update(seller);
		System.out.println("Atualização realizada com sucesso!");
		
		System.out.println();
		
		System.out.println("===== TEST 6: Seller delete ======");
		System.out.println("Entre com o id do vendedor a ser deletado: ");
		int id = sc.nextInt();
		Seller sellerDeletado = sellerDao.findById(id);
		sellerDao.delete(id);
		System.out.println("O vendedor " + sellerDeletado + " foi deletado com sucesso!");
		
		sc.close();
	}

}
