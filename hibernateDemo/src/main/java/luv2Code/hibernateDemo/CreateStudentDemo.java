package luv2Code.hibernateDemo;

import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import luv2Code.hibernateDemo.entity.StudentEntity;

public class CreateStudentDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(StudentEntity.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {

			StudentEntity se = new StudentEntity(UUID.randomUUID().toString(), "bharath", "reddy",
					"bhrarath@gmail.com");

			session.beginTransaction();

			session.save(se);

			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			factory.close();
		}

	}

}
