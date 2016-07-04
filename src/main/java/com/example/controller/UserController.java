package com.example.controller;

import com.example.dao.UserDAO;
import com.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by nazar.dovhyy on 03.07.2016.
 */
@Controller
public class UserController {

    @Autowired
    private UserDAO userDAO;


    @RequestMapping("/save")
    @ResponseBody
    public String save(String firstName, String lastName, String email){

        String userId = null;

        try {
            User user = new User();
            user.setFirstname(firstName);
            user.setLastname(lastName);
            user.setEmail(email);

            userDAO.save(user);

            userId = String.valueOf(user.getUserId());
        }catch(Exception e){
            return "error creating the user "+e.toString();
        }

        return "user created with id "+userId;
    }


}
