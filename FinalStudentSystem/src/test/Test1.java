package test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import service.impl.UserDaoImpl;
import servicee.UserDao;


import entity.Students;
import entity.Users;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		// �������ö���
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
//		// ����schemaExport����
//		SchemaExport export = new SchemaExport(config);
//
//		export.create(true, true);
		
		Users user = new Users(1, "zhangsan", "123456");
		UserDao userDao = new UserDaoImpl();
		System.out.println(userDao.usersLogin(user));

	}

}
