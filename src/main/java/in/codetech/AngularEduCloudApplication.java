package in.codetech;


import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.codetech.model.Role;
import in.codetech.model.User;
import in.codetech.model.UserRole;
import in.codetech.service.UserService;


@SpringBootApplication
public class AngularEduCloudApplication {//implements CommandLineRunner{

//	@Autowired
//	private UserService userService;
//	
	public static void main(String[] args) {
	    SpringApplication.run(AngularEduCloudApplication.class, args);

	}

	
//
//	@Override
//	public void run(String... args) throws Exception {
//		
//		User user = new User();
//		user.setId(1L);
//		user.setFirstName("Sanket");
//		user.setLastName("Goykar");
//		user.setEmail("Sanket12@gmail.com");
//		user.setpNumber(8788734335L);
//		user.setUserName("Anand");
//		user.setPassword("12345678");
//		user.setProfile("PNG");
//		
//		
//		Role role = new Role();
//		role.setRoleId(1L);
//		role.setRole("Normal");
//		
//		Set<UserRole> userRoles = new HashSet<>();
//		
//		UserRole userRole = new UserRole();
//		userRole.setUserRoleID(1L);
//		userRole.setUser(user);
//		userRole.setRole(role);
//		
//		userRoles.add(userRole);
//		
//		User user1 = this.userService.createUser(user,userRoles);
//		System.out.println(user1.getUserName());
//		
//		
//	}
}



