package com.cnu.wlx.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
* @author ���� 
* @version ����ʱ�䣺2016��3��28�� ����1:49:12
* ��˵��
*/
@Entity
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
@Table(name="t_admin")
public class Admin {
	/**
	 * ��ʶid
	 */
	private String id;
	/**
	 * �˺�
	 */
	private String account;
	/**
	 * ����
	 */
	private String password;
	/**
	 * ����ʱ��
	 */
	private Date createTime=new Date();
	
	@Id 
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Column(nullable=false)
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	@Column(nullable=false)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Temporal(TemporalType.TIMESTAMP)
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	
}
