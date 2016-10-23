package com.feel.service;

import com.feel.dao.RoleDao;
import com.feel.model.Role;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by admin-pc on 2016/10/12.
 */
@Service("roleService")
public class RoleServiceImp implements RoleService {
    @Resource
    private RoleDao roleDao;

    public RoleDao getRoleDao() {
        return roleDao;
    }

    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    public Map findRoleByParam(Role role){
        return roleDao.findRoleByParam(role);
    }

    public List<Map> getAllRole() {
        return roleDao.getAllRole();
    }

    public String addRole(Role role) {
        try {
            roleDao.addRole(role);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }

    public String deleteRoleById(String id) {
        try {
            roleDao.deleteRoleById(id);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }

    public String updateRole(Role role) {
        try {
            roleDao.updateRole(role);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }
}
