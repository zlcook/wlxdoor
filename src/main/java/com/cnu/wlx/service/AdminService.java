package com.cnu.wlx.service;

import com.cnu.wlx.bean.Admin;
import com.cnu.wlx.formbean.AdminFormbean;

public interface AdminService {
	/**
	 * 登陆
	 * @param admin
	 */
	public Admin login(AdminFormbean admin);
	/**
	 * 注册
	 * @param formbean
	 */
	public void register(AdminFormbean formbean);
}
