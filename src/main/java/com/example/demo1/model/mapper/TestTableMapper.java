/**
 * 
 */
package com.example.demo1.model.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 */
@Mapper
public interface TestTableMapper {
	//select * from Test_Table
    public List<Map<String, Object>> SelectAllList(String dName) throws Exception;

}
