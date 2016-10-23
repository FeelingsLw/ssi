package com.feel.dao;

import com.feel.model.Role;

import java.util.List;
import java.util.Map;

public interface RoleDao {
    public Map findRoleByParam(Role role);
    public List<Map> getAllRole();
    public void addRole(Role role);
    public void deleteRoleById(String id);
    public void updateRole(Role role);
}