package com.example.demo1.service;

import java.util.List;
import java.util.Map;

public interface TestTableService { //select * from Test_Table
    public List<Map<String, Object>> SelectAllList(String dName) throws Exception;

}
