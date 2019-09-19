/**
 *
 * @版权 : Copyright (c) 2017-2018 *********公司技术开发部
 * @author: 作者姓名(一般是写姓名的拼音)
 * @E-mail: 邮箱
 * @版本: 1.0
 * @创建日期: 2019年9月18日 上午10:56:47
 * @ClassName CDPlayer
 * @类描述-Description:  TODO(这里用一句话描述这个方法的作用)
 * @修改记录:
 * @版本: 1.0
 */

package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {
	private CompactDisc cDisc;
	
	@Autowired
	public CDPlayer(CompactDisc cDisc) {
		this.cDisc = cDisc;
	}
	
	public void play() {
		cDisc.play();
	}
}