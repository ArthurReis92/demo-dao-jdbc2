package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Department department = new Department(21, "Music");
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println(department);
	}

}
