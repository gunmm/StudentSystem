package servicee;

import java.util.List;

import entity.Students;

public interface StudentsDao {
	//查询所有学生资料
	public List<Students> queryAllStudents();
	
	//根据学生编号查询学生资料
	public Students queryStudentById(String id);
	
	//添加学生资料
	public boolean addStudents(Students s);
	
	//修改学生资料
	public boolean updateStudents(Students s);
	
	//删除学生资料
	public boolean deleteStudents(String id);


}
