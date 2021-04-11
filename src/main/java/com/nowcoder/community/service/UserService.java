package com.nowcoder.community.service;

import com.nowcoder.community.dao.UserMappper;
import com.nowcoder.community.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired
  private UserMappper userMappper;

  public User findUserByID(int id){
    return userMappper.selectById(id);
  }


}
