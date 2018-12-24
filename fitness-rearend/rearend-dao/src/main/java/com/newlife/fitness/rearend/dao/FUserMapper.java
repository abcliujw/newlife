package com.newlife.fitness.rearend.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.newlife.fitness.entity.FUser;
import com.newlife.fitness.entity.FUserExample;

public interface FUserMapper {
    long countByExample(FUserExample example);

    int deleteByExample(FUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FUser record);

    int insertSelective(FUser record);

    List<FUser> selectByExample(FUserExample example);

    FUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FUser record, @Param("example") FUserExample example);

    int updateByExample(@Param("record") FUser record, @Param("example") FUserExample example);

    int updateByPrimaryKeySelective(FUser record);

    int updateByPrimaryKey(FUser record);
}