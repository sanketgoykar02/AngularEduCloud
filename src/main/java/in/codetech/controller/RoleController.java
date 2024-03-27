package in.codetech.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.codetech.model.Role;
import in.codetech.service.RoleService;

@RestController
@RequestMapping("/roles")
public class RoleController {
	@Autowired
	private RoleService roleService;

	 @GetMapping("/{id}")
	    public ResponseEntity<Role> getRoleById(@PathVariable Long id) {
	        Role role = roleService.getRoleById(id);
	        return role != null ? ResponseEntity.ok(role) : ResponseEntity.notFound().build();
	    }

	    @PostMapping
	    public ResponseEntity<Role> createRole(@RequestBody Role role) {
	        Role savedRole = roleService.saveRole(role);
	        return new ResponseEntity<>(savedRole,HttpStatus.CREATED);
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<String> deleteRole(@PathVariable Long id) {
	        roleService.deleteRole(id);
	        return new ResponseEntity<>("Deleted Sucessfully",HttpStatus.OK);
	    }
}
