/**
 *
 * @版权 : Copyright (c) 2017-2018 *********公司技术开发部
 * @author: 作者姓名(一般是写姓名的拼音)
 * @E-mail: 邮箱
 * @版本: 1.0
 * @创建日期: 2019年9月19日 下午10:59:23
 * @ClassName IndexController
 * @类描述-Description:  TODO 方法级别的注解
 * @修改记录:
 * @版本: 1.0
 */

package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller
//public class IndexController {
//	@RequestMapping(value = "/index/login")
//	public String login() {
//		return "login";
//	}
//	@RequestMapping(value = "/index/register")
//	public String register() {
//		return "register";
//	}
//}

// 类级别的注释
@Controller
@RequestMapping("/index")
public class IndexController {
	@RequestMapping("/login")
	public String login() {
		return "/login";
	}
	
	@RequestMapping("/register")
	public String register(Model model) {
		model.addAttribute("success", "注册成功");
		return "register";
	}
}
