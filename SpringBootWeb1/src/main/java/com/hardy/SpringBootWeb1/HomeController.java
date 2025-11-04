package com.hardy.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.net.http.HttpRequest;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        System.out.println("home called");
        return "index.jsp";
    }

    @RequestMapping("add")
    public String add(int num1, int num2,
            /*HttpSession session*/ModelAndView mav){
//        System.out.println("add called");
//        int num1 = Integer.parseInt(request.getParameter("num1"));
//        int num2 = Integer.parseInt(request.getParameter("num2"));
        int result = num1 + num2 ;
//        System.out.println(result);
//        session.setAttribute("result",result);
        mav.addObject("result",result);
        mav.setViewName("result");
        return "result.jsp";
    }
}
