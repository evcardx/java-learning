/**
 *
 * @版权 : Copyright (c) 2017-2018 *********公司技术开发部
 * @author: 作者姓名(一般是写姓名的拼音)
 * @E-mail: 邮箱
 * @版本: 1.0
 * @创建日期: 2019年9月21日 下午11:52:04
 * @ClassName GoodsConverter
 * @类描述-Description:  TODO(这里用一句话描述这个方法的作用)
 * @修改记录:
 * @版本: 1.0
 */

package converter;

import org.springframework.core.convert.converter.Converter;

import domain.GoodsModel;

public class GoodsConverter implements Converter<String, GoodsModel>{
	@Override
	public GoodsModel convert(String source) {
		System.out.println(source);
		GoodsModel goods = new GoodsModel();
		// 以『,』分隔
		String stringValues[] = source.split(",");
		if (stringValues != null &&
				stringValues.length == 3) {
			// 为Goods实例赋值
			goods.setGoodsname(stringValues[0]);
			goods.setGoodsprice(Double.parseDouble(stringValues[1]));
			goods.setGoodsnumber(Integer.parseInt(stringValues[2]));
			return goods;
		} else {
			throw new IllegalArgumentException(String.format("类型转换失败，需要格式「apple,10.58,200」，但格式是[%s]", source));
		}
	}
}
