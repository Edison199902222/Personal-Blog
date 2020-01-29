package com.edison.demo.web;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by limi on 2017/10/13.
 */
@Controller
public class IndexController{
    @GetMapping("/")
    public String index(){
        return"index";
    }
}