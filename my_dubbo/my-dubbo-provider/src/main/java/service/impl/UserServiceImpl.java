package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.rpc.RpcContext;

import dao.UserDao;
import domain.User;
import service.UserService;

/**
 * 
 * @ClassName: UserServiceImpl   
 * @Description: 用户服务实现   
 * @author: XiaWenQiang
 * @date: 2017年8月17日 上午11:10:01   
 *
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	
	/**   
	 * @Title: queryUserById  
	 * @Description:   
	 * @param userid
	 * @return   
	 * @see service.UserService#queryUserById(java.lang.Long)   
	 */
	public User queryUserById(Long userid) {
		System.out.println(RpcContext.getContext().getLocalAddress() + " : queryUserById");
		return userDao.findById(userid);
	}

}
