package com.respect.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by qumingyang on 2017/10/9.
 */
@RestController
public class TestController {

    @RequestMapping(value = "/hello")
    public String sayHello(){
        return "hello world";
    }


    @RequestMapping(value = "/list")
    public List<String> listTest(){
        List<String> lists = new ArrayList<>();
        lists.add("1");
        lists.add("2");
        lists.add("3");
        lists.add("4");
        lists.add("5");
        return lists;
    }


    @RequestMapping(value = "/map")
    public Map<String,Object> mapTest(){
        Map<String,Object> map = new HashMap<>();
        map.put("key1",1);
        map.put("key2",2);
        map.put("key3",3);
        map.put("key4",4);
        return map;
    }



}
