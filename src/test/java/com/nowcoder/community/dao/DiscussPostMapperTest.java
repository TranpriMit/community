package com.nowcoder.community.dao;

import static org.junit.Assert.*;

import com.nowcoder.community.CommunityApplication;
import com.nowcoder.community.entity.DiscussPost;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class DiscussPostMapperTest {

  @Autowired
  private DiscussPostMapper discussPostMapper;

  @Test
  public void selectDiscussPosts() {
    List<DiscussPost> list = discussPostMapper.selectDiscussPosts(149,0,10);
    for(DiscussPost discussPost:list){
      System.out.println(discussPost);
    }
  }

  @Test
  public void selectDiscussPostRows() {
    int rows = discussPostMapper.selectDiscussPostRows(149);
    System.out.println(rows);
  }
}