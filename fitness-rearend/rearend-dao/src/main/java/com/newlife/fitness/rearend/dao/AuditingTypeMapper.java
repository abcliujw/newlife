package com.newlife.fitness.rearend.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.newlife.fitness.entity.AuditingType;
import com.newlife.fitness.entity.AuditingTypeExample;

public interface AuditingTypeMapper {
    long countByExample(AuditingTypeExample example);

    int deleteByExample(AuditingTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AuditingType record);

    int insertSelective(AuditingType record);

    List<AuditingType> selectByExample(AuditingTypeExample example);

    AuditingType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AuditingType record, @Param("example") AuditingTypeExample example);

    int updateByExample(@Param("record") AuditingType record, @Param("example") AuditingTypeExample example);

    int updateByPrimaryKeySelective(AuditingType record);

    int updateByPrimaryKey(AuditingType record);
}