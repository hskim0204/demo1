package com.example.demo1.service;

import java.util.List;
import java.util.Map;

import com.example.demo1.vo.TestTableVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.example.demo1.model.mapper.TestTableMapper;
 
@Service
public class TestTableServiceImpl implements TestTableService{
 
    @Autowired
    TestTableMapper testTableMapper;
    
    @Override
    public List<Map<String, Object>> SelectAllList(String dName) throws Exception {
        // TODO Auto-generated method stub
        return testTableMapper.SelectAllList(dName);
    }

    @Override
    public void write(TestTableVo ttv) {
        testTableMapper.write(ttv);
    }

}