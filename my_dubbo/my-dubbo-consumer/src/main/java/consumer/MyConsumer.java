package consumer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.DemoService;

/**   
 * @ClassName: MyConsumer   
 * @Description: 服务消费者示例  
 * @author: XiaWenQiang
 * @date: 2017年8月15日 上午11:09:15   
 *      
 */
public class MyConsumer {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/my-dubbo-consumer.xml"});
		context.start();
		
		DemoService demoService = (DemoService) context.getBean("demoService");
		String hello = demoService.sayHello("Dubbo!");
		
		System.out.println(hello);
	}
}
