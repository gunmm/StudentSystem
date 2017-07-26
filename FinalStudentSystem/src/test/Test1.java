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

//		// 创建配置对象
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
//		// 创建schemaExport对象
//		SchemaExport export = new SchemaExport(config);
//
//		export.create(true, true);
		
		Users user = new Users(1, "zhangsan", "123456");
		UserDao userDao = new UserDaoImpl();
		System.out.println(userDao.usersLogin(user));

	}

}
