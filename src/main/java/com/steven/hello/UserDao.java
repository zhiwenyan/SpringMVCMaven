package com.steven.hello;

public interface UserDao {
	//根据用户id查询用户信息
	public SUser findUserById(int id) throws Exception;
}
