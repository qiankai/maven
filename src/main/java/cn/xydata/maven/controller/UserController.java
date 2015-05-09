package cn.xydata.maven.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.xydata.maven.model.User;
import cn.xydata.maven.service.UserService;

@Controller
@RequestMapping("/")
public class UserController {

    private String a = "hellow rold";
    @Resource
    private UserService userService;
    private List<User> b;
    
    
    @RequestMapping("index")
    public String index(){
        return "index";
    }
    
    
    @RequestMapping(value="content", method=RequestMethod.GET)
    public ModelAndView getContent() {
        ModelAndView mav = new ModelAndView("content");
        
        b = userService.getUsers();
        
        System.out.println(b.get(0));
        mav.addObject("a",a);
        mav.addObject("b",b);
        
        return mav;
    } 
}
