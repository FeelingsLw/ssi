package com.feel.controller;

import com.feel.model.Role;
import com.feel.service.RoleService;
import com.google.gson.Gson;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/**
 * Created by admin-pc on 2016/10/12.
 */
public class RoleAction{

    Logger logger=Logger.getLogger(RoleAction.class.getName());
    private String id;
    private String name;
    private String level;

    private RoleService roleService;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public RoleService getRoleService() {
        return roleService;
    }

    public void setRoleService(RoleService roleService) {
        this.roleService = roleService;
    }
    public void getRoleByparam()throws Exception{
        Role role=new Role();
        role.setId(id);
        Map map=roleService.findRoleByParam(role);
        HttpServletResponse response=ServletActionContext.getResponse();
        response.setHeader("Content-type", "text/html;charset=UTF-8");
        String strRole=new Gson().toJson(map);
        response.getWriter().print(strRole);
    }
    public void getAllRole() throws Exception{
        logger.info("开始获取所有角色");
        List list=roleService.getAllRole();
        String strRole=new Gson().toJson(list);
        HttpServletResponse response=ServletActionContext.getResponse();
        response.setHeader("Content-type", "text/html;charset=UTF-8");
        response.getWriter().print(strRole);
        logger.info("完成获取所有角色");
    }

    public void addRole() throws Exception{
        Role role=new Role();
        role.setId(id);
        role.setName(name);
        role.setLevel(level);
        roleService.addRole(role);
        ServletActionContext.getResponse().getWriter().write("success".toCharArray());
    }

    public void deleteRoleById()throws Exception{
        roleService.deleteRoleById(id);
        ServletActionContext.getResponse().getWriter().write("success".toCharArray());
    }
    public void updateRole()throws Exception{
        Role role=new Role();
        role.setId(id);
        role.setLevel(level);
        roleService.updateRole(role);
        ServletActionContext.getResponse().getWriter().write("success".toCharArray());
    }
}
