package com.hht.myBatisSpringbootDemo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.hht.myBatisSpringbootDemo.entity.CommonTable;

@Mapper
public interface CommonTableMapper {

	CommonTable getCommonTable(Integer id);
	
}
