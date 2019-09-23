/**
 *
 * @版权 : Copyright (c) 2017-2018 *********公司技术开发部
 * @author: 作者姓名(一般是写姓名的拼音)
 * @E-mail: 邮箱
 * @版本: 1.0
 * @创建日期: 2019年9月20日 下午9:56:13
 * @ClassName UserController
 * @类描述-Description:  TODO(这里用一句话描述这个方法的作用)
 * @修改记录:
 * @版本: 1.0
 */

package controller;

import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import domain.UserForm;
import service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	// 得到一个用来记录日志的对象，这样打印信息能够标记打印的是哪个类的信息
	private static final Log logger = LogFactory.getLog(UserController.class);
	// 将服务依赖注入属性
	@Autowired
	public UserService userService;
	
	
	@RequestMapping("/register")
	/*
	 * UserForm对象user接收注册页面提交的请求参数
	 */
//	public String register(UserForm user, Model model) {
//		System.out.println(user.getUname());
//		System.out.println(user.getUpass());
//		if ("zhangsan".equals(user.getUname())
//				&& "123456".equals(user.getUpass())) {
//			return "login";	// 注册成功，跳转到login.jsp
//		} else {
//			// 在register.jsp页面上可以使用EL表达式取出model的uname值
//			model.addAttribute("uname", user.getUname());
//			return "register";
//		}
//	}
//	public String register(String uname, String upass, Model model) {
//		System.out.println(uname);
//		System.out.println(upass);
//		if ("zhangsan".equals(uname)
//				&& "123456".equals(upass)) {
//			return "login";	// 注册成功，跳转到login.jsp
//		} else {
//			// 在register.jsp页面上可以使用EL表达式取出model的uname值
//			model.addAttribute("uname", uname);
//			return "register";
//		}
//	}
//	public String register(HttpServletRequest request, Model model) {
//		String uname = request.getParameter("uname");
//		String upass = request.getParameter("upass");
//		System.out.println(uname);
//		System.out.println(upass);
//		if ("zhangsan".equals(uname)
//				&& "123456".equals(upass)) {
//			return "login";	// 注册成功，跳转到login.jsp
//		} else {
//			// 在register.jsp页面上可以使用EL表达式取出model的uname值
//			model.addAttribute("uname", uname);
//			return "register";
//		}
//	}
//	public String register(@RequestParam String uname, @RequestParam String upass, Model model) {
//		System.out.println(uname);
//		System.out.println(upass);
//		if ("zhangsan".equals(uname)
//				&& "123456".equals(upass)) {
//			return "login";	// 注册成功，跳转到login.jsp
//		} else {
//			// 在register.jsp页面上可以使用EL表达式取出model的uname值
//			model.addAttribute("uname", uname);
//			return "register";
//		}
//	}
//	public String register(@ModelAttribute("user") UserForm user, Model model) {
//		String uname = user.getUname();
//		String upass = user.getUpass();
//		System.out.println(uname);
//		System.out.println(upass);
//		if ("zhangsan".equals(uname)
//				&& "123456".equals(upass)) {
//			return "login";	// 注册成功，跳转到login.jsp
//		} else {
//			// 在register.jsp页面上可以使用EL表达式取出model的uname值
//			model.addAttribute("uname", uname);
//			return "register";
//		}
//	}
	public String register(@ModelAttribute("user") UserForm user, Model model) {
		String uname = user.getUname();
		String upass = user.getUpass();
		logger.info(uname);
		logger.info(upass);
		if (userService.register(user)) {
			logger.info("成功");
			return "login";	// 注册成功，跳转到login.jsp
		} else {
			// 在register.jsp页面上可以使用EL表达式取出model的uname值
			logger.info("失败");
			model.addAttribute("u", user);
			return "register";
		}
	}
	
//	@RequestMapping(value = "/register/{uname}/{upass}", method = RequestMethod.GET)
//	public String register(@PathVariable String uname, @PathVariable String upass, Model model) {
//		
//		System.out.println(uname);
//		System.out.println(upass);
//		if ("zhangsan".equals(uname)
//				&& "123456".equals(upass)) {
//			return "login";	// 注册成功，跳转到login.jsp
//		} else {
//			// 在register.jsp页面上可以使用EL表达式取出model的uname值
//			model.addAttribute("uname", uname);
//			return "register";
//		}
//	
	/*
	 * 登录操作
	 */
	@RequestMapping("/login")
//	public String login(UserForm user, HttpSession session, Model model) {
//		String uname = user.getUname();
//		String upass = user.getUpass(); 
//		if ("zhangsan".equals(uname)
//				&& "123456".equals(upass)) {
//			session.setAttribute("u", uname);
//			return "main";
//		} else {
//			model.addAttribute("uname", uname);
//			model.addAttribute("upass", upass);
//			return "login";
//		}
//	}
	public String login(UserForm user, HttpSession session, Model model) {
		if (userService.login(user)) {
			session.setAttribute("u", user);
			logger.info("成功");
			return "main";
		} else {
			logger.info("失败");
			model.addAttribute("message", "用户名或密码错误");
			return "login";
		}
	}
}
