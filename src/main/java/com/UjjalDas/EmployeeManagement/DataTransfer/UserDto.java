package com.UjjalDas.EmployeeManagement.DataTransfer;

import java.util.List;

public class UserDto {

    private String username;
    private String password;
    private List<RoleDto> roles;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<RoleDto> getRoles() {
		return roles;
	}
	public void setRoles(List<RoleDto> roles) {
		this.roles = roles;
	}
	public UserDto(String username, String password, List<RoleDto> roles) {
		super();
		this.username = username;
		this.password = password;
		this.roles = roles;
	}

    
}
