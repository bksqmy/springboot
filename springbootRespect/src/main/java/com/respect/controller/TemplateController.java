package com.respect.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by qumingyang on 2017/10/9.
 */
@Controller
public class TemplateController {

    @RequestMapping(value = "/helloHtml")
    public String helloHtml(Map<String,Object> map ){
        map.put("hello","from TemplateController.helloHtml");
        return  "/Thymel";
    }


}
