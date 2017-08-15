package spi;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * 
 * @ClassName: Main   
 * @Description: 测试SPI
 * SPI : Service Provider Interface 服务提供接口，通常用于服务发现   
 * @author: XiaWenQiang
 * @date: 2017年8月15日 下午5:21:15   
 *
 */
public class Main {

	public static void main(String[] args) {
		ServiceLoader<IUser> serviceLoaders = ServiceLoader.load(IUser.class);
		Iterator<IUser> iterator = serviceLoaders.iterator();
		while(iterator.hasNext()) {
			IUser user = iterator.next();
			user.call();
		}
	}

}
