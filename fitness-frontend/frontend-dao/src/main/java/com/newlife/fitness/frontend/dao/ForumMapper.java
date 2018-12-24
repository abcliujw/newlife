package com.newlife.fitness.frontend.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.newlife.fitness.entity.Forum;
import com.newlife.fitness.entity.ForumExample;

public interface ForumMapper {
    long countByExample(ForumExample example);

    int deleteByExample(ForumExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Forum record);

    int insertSelective(Forum record);

    List<Forum> selectByExample(ForumExample example);

    Forum selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Forum record, @Param("example") ForumExample example);

    int updateByExample(@Param("record") Forum record, @Param("example") ForumExample example);

    int updateByPrimaryKeySelective(Forum record);

    int updateByPrimaryKey(Forum record);
}