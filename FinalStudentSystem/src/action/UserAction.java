package action;

import service.impl.UserDaoImpl;
import servicee.UserDao;

import com.opensymphony.xwork2.ModelDriven;

import entity.Users;

public class UserAction extends SuperAction implements ModelDriven<Users> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Users user = new Users();

	// �û���¼����
	public String login() {
		System.out.println(user.getUsername());

		UserDao userDao = new UserDaoImpl();
		if (userDao.usersLogin(user)) {
			return "login_success";
		} else {
			return "login_failure";
		}
	}

	public Users getModel() {
		// TODO Auto-generated method stub
		return this.user;
	}

	@Override
	public void validate() {
		// TODO Auto-generated method stub
		
//		// �û�������Ϊ��
//		if (user.getUsername() == null||"".equals(user.getUsername())) {
//			this.addFieldError("usernameError", "�û�������Ϊ��");
//		}
//		// ���벻��Ϊ��
//		if (user.getPassword().length()<6) {
//			this.addFieldError("passwordError", "���볤�Ȳ�С����λ");
//		}
	}

}
