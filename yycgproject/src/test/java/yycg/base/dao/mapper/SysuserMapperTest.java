package yycg.base.dao.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;
import yycg.base.service.UserService;

public class SysuserMapperTest extends TestCase {

	private ApplicationContext applicationContext;
	
	private SysuserMapper sysuserMapper;
	@Autowired
	private UserService userService;

	protected void setUp() {
		// 获取spring容器
		applicationContext = new ClassPathXmlApplicationContext
				("spring/applicationContext.xml",
						"spring/applicationContext-base-dao.xml",
						"spring/applicationContext-base-service.xml",
						"spring/springmvc.xml");
		sysuserMapper = (SysuserMapper) applicationContext.getBean("sysuserMapper");
	}
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	//根据主键删除
	public void testSelect() throws Exception {

	}


}
