package com.nowcoder.community.dao;

import com.nowcoder.community.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Hastur
 */
@Mapper
public interface UserMappper {

  User selectById(int id);

  User selectByName(String name);

  User selectByEmail(String email);

  int insertUser(User user);

  int updateStatus(int id, int status);

  int updateHeader(int id, String headerUrl);

  int updatePassword(int id, String password);
}
