package com.hht.myBatisSpringbootDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hht.myBatisSpringbootDemo.entity.CommonTable;
import com.hht.myBatisSpringbootDemo.mapper.CommonTableMapper;

@RestController
public class CommonTableController {

	@Autowired
	private CommonTableMapper commonTableMapper;
	
	@GetMapping("/commonTable/{id}")
	public CommonTable getCommonTable(@PathVariable int id) {
		CommonTable commonTable = commonTableMapper.getCommonTable(id);
		return commonTable;
	}
	
}
