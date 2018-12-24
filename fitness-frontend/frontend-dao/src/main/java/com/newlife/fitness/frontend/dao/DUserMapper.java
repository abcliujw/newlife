package com.newlife.fitness.frontend.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.newlife.fitness.entity.DUser;
import com.newlife.fitness.entity.DUserExample;

public interface DUserMapper {
    long countByExample(DUserExample example);

    int deleteByExample(DUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DUser record);

    int insertSelective(DUser record);

    List<DUser> selectByExample(DUserExample example);

    DUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DUser record, @Param("example") DUserExample example);

    int updateByExample(@Param("record") DUser record, @Param("example") DUserExample example);

    int updateByPrimaryKeySelective(DUser record);

    int updateByPrimaryKey(DUser record);
}