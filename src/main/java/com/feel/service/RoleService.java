package com.feel.service;

import com.feel.model.Role;

import java.util.List;
import java.util.Map;

/**
 * Created by admin-pc on 2016/10/12.
 */
public interface RoleService  {
    public Map findRoleByParam(Role role);
    public List<Map> getAllRole();
    public String addRole(Role role);
    public String deleteRoleById(String id);
    public String updateRole(Role role);
}
