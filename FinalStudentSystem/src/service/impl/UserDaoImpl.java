package service.impl;




import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import db.MyHibernateSessionFactory;

import entity.Users;
import servicee.UserDao;

public class UserDaoImpl implements UserDao{

	public boolean usersLogin(Users u) {
		//事物对象
		Transaction tx = null;
		String hql = "";
		try {
			Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
//			hql = "from Users where username='"+u.getUsername()+"' and password='"+u.getPassword()+"'";
			hql = "from Users where username=? and password=?";

			Query query = session.createQuery(hql);
			query.setParameter(0, u.getUsername());
			query.setParameter(1, u.getPassword());
			List list = query.list();
			tx.commit();
			if (list.size()>0) {
				return true;
			}else {
				return false;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}finally{
			if (tx != null) {
				tx = null;
			}
		}
	}

}
