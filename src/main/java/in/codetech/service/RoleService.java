package in.codetech.service;


import org.springframework.stereotype.Service;

import in.codetech.model.Role;

@Service
public interface RoleService {
	
	public Role getRoleById(Long id);
    public Role saveRole(Role role);
    public Role updateRole(Long id, Role role);
    public void deleteRole(Long id);

}