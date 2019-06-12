package com.hht.myBatisSpringbootDemo.mapper;

import org.mybatis.spring.annotation.MapperScan;

import com.hht.myBatisSpringbootDemo.entity.CommonTable;

@MapperScan
public interface CommonTableMapper {

	CommonTable getCommonTable(int id);
	
}
