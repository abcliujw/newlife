package com.newlife.fitness.frontend.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.newlife.fitness.entity.Train;
import com.newlife.fitness.entity.TrainExample;

public interface TrainMapper {
    long countByExample(TrainExample example);

    int deleteByExample(TrainExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Train record);

    int insertSelective(Train record);

    List<Train> selectByExample(TrainExample example);

    Train selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Train record, @Param("example") TrainExample example);

    int updateByExample(@Param("record") Train record, @Param("example") TrainExample example);

    int updateByPrimaryKeySelective(Train record);

    int updateByPrimaryKey(Train record);
}