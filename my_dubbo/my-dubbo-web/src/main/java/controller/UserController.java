package controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;

import service.UserService;

/**   
 * @ClassName: UserController   
 * @Description: 用户   
 * @author: XiaWenQiang
 * @date: 2017年8月17日 上午11:17:20   
 *      
 */
@RestController
@RequestMapping(value="/user", produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UserController {

	@Reference
	UserService userService;
	
	@RequestMapping("/queryById")
	public String queryUser(Long userid) {
		return userService.queryUserById(userid).toString();
	}
}
