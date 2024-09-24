package com.example.demo1.service;

import com.example.demo1.vo.TestTableVo;

import java.util.List;
import java.util.Map;

public interface TestTableService { //select * from Test_Table
    public List<Map<String, Object>> SelectAllList(String dName) throws Exception;

    public void write(TestTableVo ttv);

    public void update(TestTableVo ttv);

    public List<TestTableVo> getDepts();

    public List<TestTableVo> getDeptByDeptNo(String deptNo);
}
