package com.channel.zengpeng.primary.entity;

import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * 用户
 * @author zengpeng
 *
 */
@Entity
@Table(name = "t_user")
@Setter
@Getter
public class TUserInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "user_id")
	private String userId;
	@Column(name = "username")
	private String userName;
	@Column(name = "password")
	private String passWord;
	@Column(name = "salt")
	private String salt;
	@Column(name = "email")
	private String email;
	@Column(name = "phone")
	private String phone;
	@Column(name = "sex")
	private int sex;
	@Column(name = "age")
	private int age;
	@Column(name = "status")
	private int status;
	@Column(name = "create_time")
	private Timestamp createTime;
	@Column(name = "update_time")
	private Timestamp updateTime;
	@Column(name = "last_login_time")
	private Timestamp lastLoginTime;
}
