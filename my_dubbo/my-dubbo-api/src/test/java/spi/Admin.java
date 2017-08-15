package spi;

/**   
 * @ClassName: Admin   
 * @Description: 管理员用户实现   
 * @author: XiaWenQiang
 * @date: 2017年8月15日 下午5:19:41   
 *      
 */
public class Admin implements IUser {

	public void call() {
		System.out.println("Hello Admin !");
	}

}
