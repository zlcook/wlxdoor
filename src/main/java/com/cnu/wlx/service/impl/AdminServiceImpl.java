package com.cnu.wlx.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cnu.wlx.bean.Admin;
import com.cnu.wlx.dao.AdminDao;
import com.cnu.wlx.formbean.AdminFormbean;
import com.cnu.wlx.service.AdminService;

@Service("adminService")
public class AdminServiceImpl implements AdminService{

	private AdminDao adminDao;
	
	public void login(AdminFormbean admin) {
		
	}

	public AdminDao getAdminDao() {
		return adminDao;
	}
	@Resource
	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	public void register(AdminFormbean formbean) {
		// TODO Auto-generated method stub
		
	}

}
