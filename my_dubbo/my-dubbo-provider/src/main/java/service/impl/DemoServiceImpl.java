package service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.alibaba.dubbo.rpc.RpcContext;

import service.DemoService;

/**
 * 
 * @ClassName: DemoServiceImpl   
 * @Description: 接口实现示例  
 * @author: XiaWenQiang
 * @date: 2017年8月15日 上午9:26:32   
 *
 */
public class DemoServiceImpl implements DemoService {

	/**   
	 * @Title: sayHello  
	 * @Description:   
	 * @param name
	 * @return   
	 * @see service.DemoService#sayHello(java.lang.String)   
	 */
	public String sayHello(String name) {
		System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + ", request from consumer : " + RpcContext.getContext().getRemoteAddress());
		return "Hello " + name + ", response from provider : " + RpcContext.getContext().getLocalAddress();
	}

}
