package com.example.demo.contorller;

import com.example.demo.bean.User;
import com.example.demo.service.UserService;
import com.example.demo.utils.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
@RequestMapping(value = "/users")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value ="/byname", method =  RequestMethod.GET)
    public ResponseEntity<Object>   getUser(HttpServletRequest request) {
            System.out.print(request.getParameter("id") + "123465");
            Integer id = Integer.parseInt(request.getParameter("id"));

            return  new ResponseEntity<>(userService.getUserName(id),HttpStatus.OK);
    };
}
