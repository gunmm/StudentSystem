package service.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import db.MyHibernateSessionFactory;

import entity.Students;
import servicee.StudentsDao;

public class StudentDaoImpl implements StudentsDao {

	public List<Students> queryAllStudents() {
		// 事物对象
		Transaction tx = null;
		List<Students> list = null;
		String hql = "";
		try {
			Session session = MyHibernateSessionFactory.getSessionFactory()
					.getCurrentSession();
			tx = session.beginTransaction();
			hql = "from Students";
			Query query = session.createQuery(hql);
			list = query.list();
			tx.commit();
			return list;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return list;
		} finally {
			if (tx != null) {
				tx = null;
			}
		}
	}

	public Students queryStudentById(String id) {
		// 事物对象
		Transaction tx = null;
		try {
			Session session = MyHibernateSessionFactory.getSessionFactory()
					.getCurrentSession();
			tx = session.beginTransaction();
			Students stu = (Students) session.get(Students.class, id);
			tx.commit();
			return stu;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		} finally {
			if (tx != null) {
				tx = null;
			}
		}
	}

	public boolean addStudents(Students s) {
		s.setSid(getNewId());
		// 事物对象
		Transaction tx = null;
		try {
			Session session = MyHibernateSessionFactory.getSessionFactory()
					.getCurrentSession();
			tx = session.beginTransaction();
			session.save(s);
			tx.commit();
			return true;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		} finally {
			if (tx != null) {
				tx = null;
			}
		}
	}

	public boolean updateStudents(Students s) {
		// 事物对象
		Transaction tx = null;
		try {
			Session session = MyHibernateSessionFactory.getSessionFactory()
					.getCurrentSession();
			tx = session.beginTransaction();
			session.update(s);
			tx.commit();
			return true;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		} finally {
			if (tx != null) {
				tx = null;
			}
		}
	}

	public boolean deleteStudents(String id) {
		// 事物对象
		Transaction tx = null;
		try {
			Session session = MyHibernateSessionFactory.getSessionFactory()
					.getCurrentSession();
			tx = session.beginTransaction();
			Students s = (Students) session.get(Students.class, id);
			session.delete(s);
			tx.commit();
			return true;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		} finally {
			if (tx != null) {
				tx = null;
			}
		}
	}

	// 生成学生id
	private String getNewId() {
		// 事物对象
		Transaction tx = null;
		String sid = null;
		String hql = "";
		try {
			Session session = MyHibernateSessionFactory.getSessionFactory()
					.getCurrentSession();
			tx = session.beginTransaction();
			hql = "select max(sid) from Students";
			Query query = session.createQuery(hql);
			sid = (String) query.uniqueResult();
			if (sid == null || "".equals(sid)) {
				sid = "S0000001";
			} else {
				String temp = sid.substring(1);
				int i = Integer.parseInt(temp);
				i++;
				temp = String.valueOf(i);
				int length = temp.length();
				for (int j = 0; j < 7 - length; j++) {
					temp = "0" + temp;
				}
				temp = "S" + temp;
				sid = temp;
			}
			tx.commit();
			return sid;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		} finally {
			if (tx != null) {
				tx = null;
			}
		}

	}

}
