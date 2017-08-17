package dao;

import org.springframework.stereotype.Repository;

import domain.User;

/**   
 * @ClassName: IUserDao   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author: XiaWenQiang
 * @date: 2017年8月17日 上午10:48:11   
 *      
 */
@Repository
public interface UserDao {

	public User findById(Long userid);
}
