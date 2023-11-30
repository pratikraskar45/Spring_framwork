package springmvc_employee.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import springmvc_employee.dto.Employee;

@Repository
public class Employedao {

	@Autowired
	private EntityManager entityManager;
	
	
	public Employee saveEmployee(Employee employee) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		return employee;
		
	}
	
	public Employee updatEmployee(Employee employee) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(employee);
		entityTransaction.commit();
		return employee;
		
	}
	
	public boolean deletEmployee(int id) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Employee employee=entityManager.find(Employee.class, id);
		if(employee!=null) {
			entityTransaction.begin();
			entityManager.remove(employee);
			entityTransaction.commit();
			return true;
		}else {
			return false;
		}
		
	}
	
	public Employee getEmployeebyid(int id) {
	return entityManager.find(Employee.class, id);
	}
	
	public List<Employee> getallEmployees() {
		Query query=entityManager.createQuery("select e from Employee e");
		return query.getResultList();
	}
	
}
