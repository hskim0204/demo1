package com.example.demo1.controller;

import java.util.List;
import java.util.Map;

import com.example.demo1.vo.TestTableVo;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo1.service.TestTableService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;

@RestController
@Tag(name="dept", description="부서 검색 서비스")
@CrossOrigin(origins = "*", methods = RequestMethod.GET) 
public class TestTableController {
	
    @Resource
    private TestTableService testtableService;
    
    @RequestMapping(value="list")
    @Operation(summary="deptList", description="부서 리스트 조회")
    @CrossOrigin(origins = "*", methods = RequestMethod.GET)
    public ModelAndView AllListView(Map<String, Object> map) throws Exception{
        ModelAndView mav = new ModelAndView();
        
        List<Map<String, Object>> AllList = testtableService.SelectAllList("");
        
        mav.addObject("Alllist", AllList);
        mav.setViewName("list");
        return mav;
    }
    
    @RequestMapping(value="list1")
    @CrossOrigin(origins = "*", methods = RequestMethod.GET)
    public List<Map<String, Object>> AllListView1(@RequestParam Map<String, Object> map) throws Exception{
    	
    	String dName = "";
    	if(map.get("dName") != null) {
    		System.out.println("map.get(dName)==>"+ map.get("dName"));
    		dName = map.get("dName").toString();
    	}
        
        List<Map<String, Object>> AllList = testtableService.SelectAllList(dName);        
        
        return AllList;
    }

    @PostMapping("/write")
    @CrossOrigin(origins = "*", methods = RequestMethod.POST)
    public void write(@RequestBody TestTableVo ttv) {
        System.out.println("TestTableVo==>"+ ttv.toString());
        testtableService.write(ttv);
    }

}
