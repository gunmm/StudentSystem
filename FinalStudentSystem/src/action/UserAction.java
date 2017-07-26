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

	// 用户登录动作
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
		
//		// 用户名不能为空
//		if (user.getUsername() == null||"".equals(user.getUsername())) {
//			this.addFieldError("usernameError", "用户名不能为空");
//		}
//		// 密码不能为空
//		if (user.getPassword().length()<6) {
//			this.addFieldError("passwordError", "密码长度不小于六位");
//		}
	}

}
