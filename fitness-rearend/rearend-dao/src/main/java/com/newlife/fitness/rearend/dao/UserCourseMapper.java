package com.newlife.fitness.rearend.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.newlife.fitness.entity.UserCourse;
import com.newlife.fitness.entity.UserCourseExample;

public interface UserCourseMapper {
    long countByExample(UserCourseExample example);

    int deleteByExample(UserCourseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserCourse record);

    int insertSelective(UserCourse record);

    List<UserCourse> selectByExample(UserCourseExample example);

    UserCourse selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserCourse record, @Param("example") UserCourseExample example);

    int updateByExample(@Param("record") UserCourse record, @Param("example") UserCourseExample example);

    int updateByPrimaryKeySelective(UserCourse record);

    int updateByPrimaryKey(UserCourse record);
}