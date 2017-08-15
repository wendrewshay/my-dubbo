package consumer;
import java.text.SimpleDateFormat;
import java.util.Date;

import service.DemoService;

/**   
 * @ClassName: MyDemoAction   
 * @Description: setter方式注入DemoService并使用示例   
 * @author: XiaWenQiang
 * @date: 2017年8月15日 上午11:28:01   
 *      
 */
public class MyDemoAction {

	private DemoService demoService;
	
	public void setDemoService(DemoService demoService) {
		this.demoService = demoService;
	}
	
	public void start() throws Exception {
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			try {
				String hello = demoService.sayHello("Dubbo" + i);
				System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] " + hello);
			} catch (Exception e) {
				e.printStackTrace();
			}
			Thread.sleep(2000);
		}
	}

}
