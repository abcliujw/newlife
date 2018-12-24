package com.newlife.fitness.rearend.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.newlife.fitness.entity.UserTrain;
import com.newlife.fitness.entity.UserTrainExample;

public interface UserTrainMapper {
    long countByExample(UserTrainExample example);

    int deleteByExample(UserTrainExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserTrain record);

    int insertSelective(UserTrain record);

    List<UserTrain> selectByExample(UserTrainExample example);

    UserTrain selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserTrain record, @Param("example") UserTrainExample example);

    int updateByExample(@Param("record") UserTrain record, @Param("example") UserTrainExample example);

    int updateByPrimaryKeySelective(UserTrain record);

    int updateByPrimaryKey(UserTrain record);
}