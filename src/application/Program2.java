package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Teste 01 findAll");

		DepartmentDao dep = DaoFactory.createDepartmentDao();

		List<Department> list = dep.findAll();

		for (Department department : list) {
			System.out.println(department);
		}
		System.out.println();
		
		System.out.println("Teste 02 findById");
		System.out.println("Digite o id do departamento: ");
		int id = sc.nextInt();
		System.out.println(dep.findByid(id));
		
		
		
		
		
		
		sc.close();
		
	}

}
