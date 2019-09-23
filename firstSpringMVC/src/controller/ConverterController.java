/**
 *
 * @版权 : Copyright (c) 2017-2018 *********公司技术开发部
 * @author: 作者姓名(一般是写姓名的拼音)
 * @E-mail: 邮箱
 * @版本: 1.0
 * @创建日期: 2019年9月21日 下午11:45:09
 * @ClassName ConverterController
 * @类描述-Description:  TODO(这里用一句话描述这个方法的作用)
 * @修改记录:
 * @版本: 1.0
 */

package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import domain.GoodsModel;

@Controller
@RequestMapping("my")
public class ConverterController {
	@RequestMapping("/converter")
	public String myConverter(@RequestParam("goods") GoodsModel gm, Model model) {
		System.out.println(gm);
		model.addAttribute("goods", gm);
		return "showGoods";
	}
}
