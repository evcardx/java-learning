/**
 *
 * @版权 : Copyright (c) 2017-2018 *********公司技术开发部
 * @author: 作者姓名(一般是写姓名的拼音)
 * @E-mail: 邮箱
 * @版本: 1.0
 * @创建日期: 2019年9月22日 上午1:04:19
 * @ClassName MyFormatter
 * @类描述-Description:  TODO(这里用一句话描述这个方法的作用)
 * @修改记录:
 * @版本: 1.0
 */

package formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.format.Formatter;

public class MyFormatter implements Formatter<Date> {
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	@Override
	public String print(Date object, Locale arg1) {
		return dateFormat.format(object);
	}
	@Override
	public Date parse(String source, Locale arg1) throws ParseException {
		return (Date) dateFormat.parse(source);
	}
}
