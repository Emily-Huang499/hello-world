package com.emily.controller;

import com.emily.vo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
    @RequestMapping(value = "/receive.do")
    public ModelAndView getParam(String name,Integer age){
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname",name);
        mv.addObject("myage",age);
        mv.setViewName("show");
        return mv;
    }

    @RequestMapping(value = "/receiveparam.do")
    public ModelAndView receiveParam(@RequestParam(value = "rname",required = false) String name,
                                     @RequestParam(value = "rage",required = false) Integer age){
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname",name);
        mv.addObject("myage",age);
        mv.setViewName("show");
        return mv;
    }
    @RequestMapping(value = "/receiveobject.do")
    public ModelAndView receiveObject(Student myStudent){
        System.out.println("receiveObject,name="+myStudent.getName()+ "age=" +myStudent.getAge() );
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname",myStudent.getName());
        mv.addObject("myage",myStudent.getAge());
        mv.addObject("myStudent",myStudent);
        mv.setViewName("show");
        return mv;
    }

}
