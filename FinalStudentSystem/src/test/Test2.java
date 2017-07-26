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

////		// 创建配置对象
//		Configuration config = new Configuration().configure();
//		// 创建服务注册对象
//		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
//				.applySettings(config.getProperties()).build();
//		// 创建会话工场对象
//		SessionFactory sessionFactory = config
//				.buildSessionFactory(serviceRegistry);
//		// 会话对象
//		Session session = sessionFactory.getCurrentSession();
//
//		//创建事物对象
//		Transaction transaction = session.beginTransaction();
//		Students s1 = new Students("S0000001", "闵哲", "男", new Date(), "陕西渭南");
//		session.save(s1);
//		
//		transaction.commit();
//		sessionFactory.close();
		StudentsDao sdao = new StudentDaoImpl();
		Students s1 = new Students("S0000001", "闵哲", "男", new Date(), "陕西渭南");
		sdao.addStudents(s1);
		List<Students> list = sdao.queryAllStudents();
		for (Students students : list) {
			System.out.println(students);
		}
	}

}
