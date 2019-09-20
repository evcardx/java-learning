/**
 *
 * @版权 : Copyright (c) 2017-2018 *********公司技术开发部
 * @author: 作者姓名(一般是写姓名的拼音)
 * @E-mail: 邮箱
 * @版本: 1.0
 * @创建日期: 2019年9月20日 下午3:01:56
 * @ClassName SpittleRepository
 * @类描述-Description:  TODO(这里用一句话描述这个方法的作用)
 * @修改记录:
 * @版本: 1.0
 */

package spittr.data;

import java.util.List;

import spitter.Spittle;

public interface SpittleRepository {
	List<Spittle> findSpittles(long max, int count);
}
