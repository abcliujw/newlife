package com.newlife.fitness.frontend.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newlife.fitness.entity.AuditingType;
import com.newlife.fitness.frontend.biz.AuditingTypeService;
import com.newlife.fitness.frontend.dao.AuditingTypeMapper;

@Service("auditingTypeService")
public class AuditingTypeServiceImpl implements AuditingTypeService{
	
	@Autowired
	private AuditingTypeMapper auditingTypeMapper;

	@Override
	public int save(AuditingType auditingType) {
		// TODO Auto-generated method stub
		return auditingTypeMapper.insertSelective(auditingType);
	}
	
}
