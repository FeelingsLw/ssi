package com.feel.controller;


/**
 * Created by admin-pc on 2016/10/10.
 */

public class UserAction {

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }


    public String getUser(){
        return "success";
        //userService.getAllUser();
    }
}
