//package pers.lilei.test.controller;
//
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.AbstractController;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// * <h3>SpringMVCTest</h3>
// * <p>${description}</p>
// *
// * @author : 李雷
// * @date : 2020-12-07 10:36
// **/
//public class HelloWorldServlet extends AbstractController {
//    @Override
//    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
//
//        String hello = httpServletRequest.getParameter("hello");
//        System.out.println("hello:"+hello);
//
//        ModelAndView modelAndView = new ModelAndView("message");
//        modelAndView.addObject("message",hello);
//
//        return modelAndView;
//    }
//}
