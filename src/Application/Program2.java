package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.dao.DAOFactory;
import model.dao.DepartmentDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDAO departmentDao = new DAOFactory().createDepartmentDAO();	
		
		System.out.println("=== TEST 1: Department findById ====");
		Department department = departmentDao.findById(1);
		
		System.out.println(department);

		System.out.println("=== TEST 2: Department findAll ====");
		List<Department> list = new ArrayList<Department>();
		list = departmentDao.findAll();
		
		for (Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("=== TEST 3: Department Insert ====");
		Department newDep = new Department(null, "Perifericos");
		departmentDao.insert(newDep);
		System.out.println("Inserted!");
		
		System.out.println("=== TEST 4: Department Update ====");
		newDep = departmentDao.findById(1);
		newDep.setName("Teste");
		departmentDao.update(newDep);
		System.out.println("Update completed");
		
	}

}
