package com.nowcoder.community.dao;


import com.nowcoder.community.CommunityApplication;
import com.nowcoder.community.entity.User;
import java.util.Date;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class UserMappperTest{

  @Autowired
  private UserMappper userMappper;

  @Test
  public void testSelectUser() {
    User user = userMappper.selectById(101);
    System.out.println(user);

    user = userMappper.selectByName("liubei");
    System.out.println(user);

    user = userMappper.selectByEmail("nowcoder101@sina.com");
    System.out.println(user);
  }

  @Test
  public void testInsertUser() {
    User user = new User();
    user.setUsername("test");
    user.setPassword("123456");
    user.setSalt("abc");
    user.setEmail("test@qq.com");
    user.setHeaderUrl("http://www.nowcoder.com/101.png");
    user.setCreateTime(new Date());

    int rows = userMappper.insertUser(user);
    System.out.println(rows);
    System.out.println(user.getId());
  }

  @Test
  public void testUpdate() {
    int rows = userMappper.updateStatus(150,1);
    System.out.println(rows);

    rows = userMappper.updateHeader(150,"http://www.nowcoder.com/102.png");
    System.out.println(rows);

    rows = userMappper.updatePassword(150,"456789");
    System.out.println(rows);
  }
}