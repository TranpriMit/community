package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Hastur
 */
@Mapper
public interface DiscussPostMapper {

  /**
   * 分页查询帖子
   * @param userId
   * @param offset
   * @param limit
   * @return
   */
  List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

  /**
   * 查询共有多少业
   * '@param' 用于给参数取别名
   * 若只有一个参数，并且在<if》中使用，则必须加别名
   * @param userId
   * @return
   */
  int selectDiscussPostRows(@Param("userId")int userId);


}
