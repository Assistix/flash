package daopack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import beans.Employee;

public class userDao {
	public static void main(String[] args){
		Configuration config=new Configuration().configure();
		SessionFactory fact=config.buildSessionFactory();
		Session s=fact.openSession();
		Transaction t=s.beginTransaction();
		Employee e=new Employee();
		e.setEmployeeName("karan");
		e.setEmployeeSalary(2500.0);
		e.setEmployeeAge(26);
		
		s.save(e);
		
		t.commit();
		s.close();
		
	}

	public static int register(Employee emp) {
		int i=0;
		/*Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session=factory.openSession();*/
		Session session=new AnnotationConfiguration().configure().buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		
		i=(Integer)session.save(emp);
		
		
		
		
		
		tx.commit();
		session.close();
		
		return i;
	}

}
