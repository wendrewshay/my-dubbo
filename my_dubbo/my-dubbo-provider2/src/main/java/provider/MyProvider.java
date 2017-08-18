package provider;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**   
 * @ClassName: MyProvider   
 * @Description: 服务提供者   
 * @author: XiaWenQiang
 * @date: 2017年8月15日 上午10:01:14   
 *      
 */
public class MyProvider {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/my-dubbo-provider.xml"});
		context.start();
		
		System.in.read(); // 按任意键退出
	}
}
