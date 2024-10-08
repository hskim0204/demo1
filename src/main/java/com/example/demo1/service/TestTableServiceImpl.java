package com.example.demo1.service;

import java.util.List;
import java.util.Map;

import com.example.demo1.vo.TestTableVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.example.demo1.model.mapper.TestTableMapper;
 
@Service
public class TestTableServiceImpl implements TestTableService{
 
    @Autowired
    TestTableMapper testTableMapper;

    private final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
    
    @Override
    public List<Map<String, Object>> SelectAllList(String dName) throws Exception {
        // TODO Auto-generated method stub
        return testTableMapper.SelectAllList(dName);
    }

    @Override
    public void write(TestTableVo ttv) {
        testTableMapper.write(ttv);
    }

    @Override
    public void update(TestTableVo ttv) {
        testTableMapper.update(ttv);
    }

    @Override
    public List<TestTableVo> getDepts() {
        return testTableMapper.getDepts();
    }

    @Override
    public List<TestTableVo> getDeptByDeptNo(String deptNo) {
        return testTableMapper.getDeptByDeptNo(deptNo);
    }

    @Override
    public void delete(String deptNo) {
        testTableMapper.delete(deptNo);
    }

}