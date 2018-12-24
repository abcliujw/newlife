package com.newlife.fitness.rearend.dao;

import com.newlife.fitness.entity.DUser;
import com.newlife.fitness.entity.DUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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