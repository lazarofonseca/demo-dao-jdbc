package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		System.out.println("Teste 01 findAll");

		DepartmentDao dep = DaoFactory.createDepartmentDao();

		List<Department> list = dep.findAll();

		for (Department department : list) {
			System.out.println(department);
		}

	}

}
