package db;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class MyHibernateSessionFactory {

	private static  SessionFactory sessionFactory;//�Ự��������
	
	//���췽��˽�л�����֤����ģʽ
	private MyHibernateSessionFactory() {
		
	}
	
	//���еľ�̬��������ûỰ��������
	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			// �������ö���
			Configuration config = new Configuration().configure();
			// ��������ע�����
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(config.getProperties()).build();
			// �����Ự��������
			sessionFactory = config
					.buildSessionFactory(serviceRegistry);
			return sessionFactory;
		}else {
			return sessionFactory;
		}
		
	}
}
