package com.itheima.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.itheima.domain.User;

@Mapper
public interface UserMapper {

	public List<User> queryUserList();
}
