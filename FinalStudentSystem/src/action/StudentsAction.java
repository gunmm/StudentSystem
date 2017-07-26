package action;

import java.util.List;

import com.opensymphony.xwork2.ModelDriven;

import entity.Students;
import entity.Users;
import service.impl.StudentDaoImpl;
import servicee.StudentsDao;

public class StudentsAction extends SuperAction implements ModelDriven<Students>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Students student = new Students();
	
	//查询所有学生的动作
	public String query() {
		StudentsDao sdao = new StudentDaoImpl();
		List<Students> list = sdao.queryAllStudents();	
//		if (list != null && list.size() > 0) {
		session.setAttribute("students_list", list);
//		}
		return "query_success";
	}
	
	
	//根据id查询单个学生的动作
	public String queryForId() {
		String sid = request.getParameter("sid");
		StudentsDao sdao = new StudentDaoImpl();
		Students stu = sdao.queryStudentById(sid);
		session.setAttribute("students_info", stu);
		return "queryForId_success";
	}
	
	//删除action
	public String delete() {
		StudentsDao sdao = new StudentDaoImpl();
		String sid = request.getParameter("sid");
		sdao.deleteStudents(sid);
		return "delete_success";
	}
	
	//add action
	public String add() {
		StudentsDao sdao = new StudentDaoImpl();
		if (sdao.addStudents(student)) {
			session.setAttribute("add_success", "1");
		}else {
			session.setAttribute("add_success", "0");
		}
		return "add_success";
	}
	
	//更新资料动作
	public String update() {
		StudentsDao sdao = new StudentDaoImpl();
		student.setSid(request.getParameter("sid"));
		if (sdao.updateStudents(student)) {
			session.setAttribute("update_success", "1");
		}else {
			session.setAttribute("update_success", "0");
		}
		return "update_success";
	}
	
	

	public Students getModel() {
		// TODO Auto-generated method stub
		return this.student;
	}
	

}
