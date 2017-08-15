package spi;

/**
 * 
 * @ClassName: Guest   
 * @Description: 访客用户实现   
 * @author: XiaWenQiang
 * @date: 2017年8月15日 下午5:20:37   
 *
 */
public class Guest implements IUser {

	public void call() {
		System.out.println("Hello Guest !");
	}

}
