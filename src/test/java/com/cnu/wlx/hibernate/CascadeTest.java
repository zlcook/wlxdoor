package com.cnu.wlx.hibernate;

import java.util.Iterator;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.cnu.wlx.bean.ColumnType;

/**
* @author 周亮 
* @version 创建时间：2016年4月6日 下午3:32:35
* 类说明
*/
public class CascadeTest {

	private static HibernateTemplate ht;
	@Before
	public void init(){
		//实例化spring ioc框架
		ApplicationContext context =new ClassPathXmlApplicationContext("wlx-service.xml");
		
		ht =(HibernateTemplate) context.getBean("hibernateTemplate");
	}
	
	@Test
	public void testCascade(){
		ColumnType ct = new ColumnType("学工新闻t", "x4");
		ColumnType ct_1 = new ColumnType("学工子新闻1", "x101");
		ColumnType ct_2 = new ColumnType("学工子新闻2", "x102");
		ct_1.setParent(ct);
		ct_1.setParent(ct);
		
		ht.persist(ct);
		ht.persist(ct_1);
		
	}

	@Test
	public void testUpdate(){
		
	}
}
