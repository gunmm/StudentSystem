package test;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import service.impl.StudentDaoImpl;
import servicee.StudentsDao;

import entity.Students;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

////		// �������ö���
//		Configuration config = new Configuration().configure();
//		// ��������ע�����
//		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
//				.applySettings(config.getProperties()).build();
//		// �����Ự��������
//		SessionFactory sessionFactory = config
//				.buildSessionFactory(serviceRegistry);
//		// �Ự����
//		Session session = sessionFactory.getCurrentSession();
//
//		//�����������
//		Transaction transaction = session.beginTransaction();
//		Students s1 = new Students("S0000001", "����", "��", new Date(), "����μ��");
//		session.save(s1);
//		
//		transaction.commit();
//		sessionFactory.close();
		StudentsDao sdao = new StudentDaoImpl();
		Students s1 = new Students("S0000001", "����", "��", new Date(), "����μ��");
		sdao.addStudents(s1);
		List<Students> list = sdao.queryAllStudents();
		for (Students students : list) {
			System.out.println(students);
		}
	}

}
