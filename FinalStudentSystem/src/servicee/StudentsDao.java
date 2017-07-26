package servicee;

import java.util.List;

import entity.Students;

public interface StudentsDao {
	//��ѯ����ѧ������
	public List<Students> queryAllStudents();
	
	//����ѧ����Ų�ѯѧ������
	public Students queryStudentById(String id);
	
	//���ѧ������
	public boolean addStudents(Students s);
	
	//�޸�ѧ������
	public boolean updateStudents(Students s);
	
	//ɾ��ѧ������
	public boolean deleteStudents(String id);


}
