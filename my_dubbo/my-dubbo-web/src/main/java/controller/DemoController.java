package controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;

import service.DemoService;

/**   
 * @ClassName: DemoController   
 * @Description: 客户端请求示例   
 * @author: XiaWenQiang
 * @date: 2017年8月16日 上午10:40:32   
 *      
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

	@Reference
	DemoService demoService;
	
	@RequestMapping(value="/test", produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String test(HttpServletResponse resp) {
		
		return demoService.sayHello("Controller");
	}
}
