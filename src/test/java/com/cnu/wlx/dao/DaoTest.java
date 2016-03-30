package com.cnu.wlx.dao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.cnu.wlx.bean.Admin;

/**
* @author 周亮 
* @version 创建时间：2016年3月28日 下午2:36:16
* 类说明
*/
public class DaoTest {
	
	private static HibernateTemplate ht;
	@Before
	public void init(){
		//实例化spring ioc框架
		ApplicationContext context =new ClassPathXmlApplicationContext("wlx-service.xml");
		
		ht =(HibernateTemplate) context.getBean("hibernateTemplate");
	}
	
	@Test
	public void addAdmin(){
		Admin ad = new Admin();
		ad.setAccount("7");
		ad.setPassword("123");
		ad.setId("5");
		ht.save(ad);
	}

	@Test
	public void findAdmin(){
		ht.get(Admin.class, "1");
		ht.get(Admin.class, "2");
		ht.get(Admin.class, "3");
		ht.get(Admin.class, "4");
		ht.get(Admin.class, "5");
		ht.get(Admin.class, "1");
		ht.get(Admin.class, "2");
		ht.get(Admin.class, "3");
		ht.get(Admin.class, "4");
		ht.get(Admin.class, "5");
	}
}
