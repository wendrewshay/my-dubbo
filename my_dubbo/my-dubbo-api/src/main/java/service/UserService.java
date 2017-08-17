package service;

import domain.User;

/**   
 * @ClassName: UserService   
 * @Description: 用户服务接口  
 * @author: XiaWenQiang
 * @date: 2017年8月17日 上午11:06:40   
 *      
 */
public interface UserService {

	public User queryUserById(Long userid);
}
