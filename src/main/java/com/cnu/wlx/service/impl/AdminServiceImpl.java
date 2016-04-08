package com.cnu.wlx.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cnu.wlx.bean.Admin;
import com.cnu.wlx.dao.AdminDao;
import com.cnu.wlx.formbean.AdminFormbean;
import com.cnu.wlx.service.AdminService;
import com.cnu.wlx.utils.WebUtils;

@Service("adminService")
public class AdminServiceImpl implements AdminService{

	private AdminDao adminDao;
	
	public Admin login(String account,String password) {
		
		Admin ad =adminDao.find(account);
		String pw = WebUtils.MD5Encode(password);
		if( ad.equals(pw)){
			return ad;
		}else
			return null;
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

	public Admin login(AdminFormbean admin) {
		// TODO Auto-generated method stub
		return null;
	}

}
