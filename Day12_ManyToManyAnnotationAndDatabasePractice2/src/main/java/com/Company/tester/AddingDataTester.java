package com.Company.tester;

import static com.Company.utils.HibernateUtils.getFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Company.entities.Department;
import com.Company.entities.Employee;


public class AddingDataTester {

	public static void main(String[] args) {
		
		try(SessionFactory factory = getFactory()){
			
			Session session = factory.openSession();
			Transaction tx = session.beginTransaction();

			System.out.println("--------In tester Adding Data in Student and table");
			
			System.out.println("Transac. started");
			
			
			if(tx!=null) {
				Department d1 = new Department();
		        d1.setName("Computer Science");
		        d1.setLocation("Block A");

		        // Create Employees
		        Employee e1 = new Employee();
		        e1.setName("Alice");
		        e1.setRole("Professor");
		        e1.setSalary(85000);

		        Employee e2 = new Employee();
		        e2.setName("Bob");
		        e2.setRole("Lab Assistant");
		        e2.setSalary(80000);

		        // Link both sides
		        d1.addEmployee(e1);
		        d1.addEmployee(e2);

		        // Save only parent — cascade will handle employees
		        session.persist(d1);
				tx.commit();
				System.out.println("Data saved successfully------");
			}
			else {
				System.out.println("transaction failed");
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
