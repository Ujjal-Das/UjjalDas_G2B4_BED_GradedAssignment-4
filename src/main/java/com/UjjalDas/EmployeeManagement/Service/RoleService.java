package com.UjjalDas.EmployeeManagement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UjjalDas.EmployeeManagement.Entity.Role;
import com.UjjalDas.EmployeeManagement.Repository.RoleRepository;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public Role addRole(Role role) {
        return roleRepository.save(role);
    }
}

