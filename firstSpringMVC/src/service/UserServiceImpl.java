/**
 *
 * @版权 : Copyright (c) 2017-2018 *********公司技术开发部
 * @author: 作者姓名(一般是写姓名的拼音)
 * @E-mail: 邮箱
 * @版本: 1.0
 * @创建日期: 2019年9月21日 上午7:24:08
 * @ClassName UserServiceImpl
 * @类描述-Description:  TODO(这里用一句话描述这个方法的作用)
 * @修改记录:
 * @版本: 1.0
 */

package service;

import org.springframework.stereotype.Service;

import domain.UserForm;

// 注解为一个服务
@Service
public class UserServiceImpl implements UserService{
	@Override
	public boolean login(UserForm user) {
		String uname = user.getUname();
		String upass = user.getUpass();
		if ("zhangsan".equals(uname)
				&& "123456".equals(upass)) {
			return true;
		} 
		return false;
	}
	
	@Override
	public boolean register(UserForm user) {
		String uname = user.getUname();
		String upass = user.getUpass();
		if ("zhangsan".equals(uname)
				&& "123456".equals(upass)) {
			return true;
		} 
		return false;
	}
}
