package com.School.tester;

import static com.School.utils.HibernateUtils.getFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.School.entities.Address;
import com.School.entities.Student;
public class AddingDataTester {

	public static void main(String[] args) {
		
		try(SessionFactory factory = getFactory()){
			
			Session session = factory.openSession();
			Transaction tx = session.beginTransaction();

			System.out.println("--------In tester Adding Data in Student and table");
			Student s = new Student();
			System.out.println("----Student Object Created");
			Address a = new Address();
			System.out.println("----Address Object Created");
			System.out.println("Transac. started");
			
			
			if(tx!=null) {
				s.setName("Hardy");
				s.setEmail("hardy@email");
				a.setCity("Delhi");
				a.setState("UnionTerritory");
				a.setPinCode("100200");
				a.setStudent(s);
				s.setAddress(a);
				session.persist(a);
				session.persist(s);
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
