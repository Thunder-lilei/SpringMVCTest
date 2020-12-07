package pers.lilei.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import pers.lilei.test.po.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * <h3>SpringMVCTest</h3>
 * <p>${description}</p>
 *
 * @author : 李雷
 * @date : 2020-12-07 14:38
 **/
@Controller
@RequestMapping("/user")
public class UserServlet {
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String list() {
        System.out.println("查询用户");
        return "user/userList";
    }
    @RequestMapping("/add")
    public String add() {
        System.out.println("注册用户");
        return "user/userAdd";
    }
    @RequestMapping("/update.do")
    public String update() {
        System.out.println("更新用户信息");
        return "user/userUpdate";
    }
    @RequestMapping("/getUserInfo")
    public String getUserInfo(String username,Integer password) {
        System.out.println(username+" "+password);
        return "../index";
    }
    @RequestMapping("/getUserInfo2")
    public String getUserInfo2(HttpServletRequest request) {
        System.out.println(request.getParameter("username")+" "+request.getParameter("password"));
        request.setAttribute("message",request.getParameter("username")+" "+request.getParameter("password"));
        return "../index";
    }
    @RequestMapping("/getUserInfo3")
    public String getUserInfo3(@RequestParam(value = "username")String username,Integer password) {
        System.out.println(username+" "+password);
        return "../index";
    }
    @RequestMapping("/getUserInfo4")
    public String getUserInfo3(User user) {
        System.out.println(user.getUsername()+" "+user.getPassword());
        return "../index";
    }
    @RequestMapping("getModelAndView")
    public ModelAndView getModelAndView() {
        ModelAndView modelAndView = new ModelAndView("../index");
        modelAndView.addObject("message","ModelAndView");
        return modelAndView;
    }
    @RequestMapping("ajaxTest")
    public ModelAndView ajaxTest() {
        ModelAndView modelAndView = new ModelAndView("../index");
        modelAndView.addObject("message","ModelAndView");
        return modelAndView;
    }
}
